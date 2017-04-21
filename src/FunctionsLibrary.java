import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import sun.util.resources.cldr.de.CalendarData_de_LI;

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

    public static void connecToServer() {

        FTPClient client = new FTPClient();

        String urlServ = "ftp.justiciachaco.gov.ar";
        String userServ = "anonymous";
        String passServ = "anonymous";

        try {

            //  CONECTA AL SERVIDOR
            client.connect(urlServ);

            boolean login = client.login(userServ, passServ);

            System.out.println(client.isConnected());
            //client.enterLocalPassiveMode();

            try {

                //  DESLOGUEO DEL SERVIDOR
                client.logout();

                //  DESCONECTA DEL SERVIDOR
                client.disconnect();
            } catch (IOException e) {
            }

        } catch (IOException ioe) {
        }

    }

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

                    fos = new FileOutputStream("/home/franco/archivosLegislacion/"+ localidad.getName() +"/archivo"+ cont +".txt");
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

                /*boolean download = client1.retrieveFile("Cam_Civ_Sala_I_2017-04-21.Txt", fos);
                if (download) {
                    System.out.println("File downloaded successfully !");
                } else {
                    System.out.println("Error in downloading file !");
                }*/

                // logout the user, returned true if logout successfully
                boolean logout = client1.logout();
                if (logout) {
                    System.out.println("Connection close...");
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
}
