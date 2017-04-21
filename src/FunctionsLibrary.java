import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import sun.util.resources.cldr.de.CalendarData_de_LI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by franco on 18/04/17.
 */
public class FunctionsLibrary {

    public static void descargarArchivo(Localidad localidad){

        // get an ftpClient object
        FTPClient client1 = new FTPClient();
        FileOutputStream fos = null;

        try {
            // pass directory path on server to connect
            client1.connect("ftp.justiciachaco.gov.ar");

            // pass username and password, returned true if authentication is
            // successful
            boolean login = client1.login("anonymous", "anonymous");

            if (login) {
                System.out.println("Connection established...");

                //FTPFile[] files = client1.listFiles();

                //System.out.println(files.length);

                int cont = 1;
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese la fecha con el siguiente formato: aaaa-mm-dd");
                String fecha = sc.nextLine();


                //Localidad resistencia = Localidad.resistencia();

                for (String url : localidad.getCaratulas()){

                    //fos = new FileOutputStream("/home/franco/archivosLegislacion/"+ localidad.getName() +"/archivo"+ cont +".txt");
                    fos = new FileOutputStream("/GNUsticia"+ localidad.getName() +"/archivo"+ cont +".txt");
                    System.out.println("/" + url + fecha + ".Txt");

                    boolean download = client1.retrieveFile(url + fecha + ".Txt", fos);
                    if (download) {
                        System.out.println("Archivo descargado correctamente!");
                    } else {
                        System.out.println("Error al descargar el archivo !");
                    }
                    cont++;

                }

                System.out.println(localidad.getName());

                // logout the user, returned true if logout successfully
                boolean logout = client1.logout();
                client1.disconnect();
                if (logout) {
                    System.out.println("Logout...");
                }
            } else {
                System.out.println("Connection fail...");
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                client1.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void generarCarpetaGNUsticia(){

        File folder = new File("./GNUsticia");
        folder.mkdir();

    }


}
