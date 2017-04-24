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

                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese la fecha con el siguiente formato: aaaa-mm-dd");
                String fecha = sc.nextLine();

                for (int i = 0; i < localidad.getLinkCaratulas().length; i++) {


                    //String caratula = localidad.getNombresCaratulas()[i];

                    fos = new FileOutputStream("./GNUsticia/"+ localidad.getName() +"/"+
                            localidad.getNombresCaratulas()[i] + fecha +".txt");

                    //if (!fileExist(localidad, caratula, fecha)){

                        boolean download = client1.retrieveFile(localidad.getLinkCaratulas()[i] + fecha + ".Txt", fos);

                        if (download) {
                            System.out.println("Archivo descargado correctamente!");
                        } else {
                            System.out.println("Error al descargar el archivo o el archivo no existe!");
                        }

                    //}else {

                        /*System.out.println("archivo: " + localidad.getNombresCaratulas()[i] + fecha +
                                ".txt" + " ya existente");*/
                    //}


                    /*boolean download = client1.retrieveFile(localidad.getLinkCaratulas()[i] + fecha + ".Txt", fos);

                    if (download) {
                        System.out.println("Archivo descargado correctamente!");
                    } else {
                        System.out.println("Error al descargar el archivo o el archivo no existe!");
                    }*/
                    
                }
                
                
                // logout the user, returned true if logout successfully
                boolean logout = client1.logout();
                client1.disconnect();
                if (logout) {
                    System.out.println("Logout...");
                    System.out.println("Disconnecting...");
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

    public static void generarCarpetas(){

        File folder = new File("./GNUsticia");
        folder.mkdir();

        File folderResistencia = new File("./GNUsticia/Resistencia");
        File folderSaenzP = new File("./GNUsticia/SaenzPeña");
        File folderVillaAngela = new File("./GNUsticia/VillaAngela");
        File folderCharata = new File("./GNUsticia/Charata");
        File folderSanMartin = new File("./GNUsticia/SanMartin");
        File folderCastelli = new File("./GNUsticia/Castelli");

        if (!folderResistencia.exists()){
            folderResistencia.mkdir();
        }else System.out.println("directorio Resistencia ya existente");

        if (!folderSaenzP.exists()){
            folderSaenzP.mkdir();
        }else System.out.println("directorio Saenz Peña ya existente");

        if (!folderVillaAngela.exists()){
            folderVillaAngela.mkdir();
        }else System.out.println("directorio Villa Angela ya existente");

        if (!folderCharata.exists()){
            folderCharata.mkdir();
        }else System.out.println("directorio Charata ya existente");

        if (!folderSanMartin.exists()){
            folderSanMartin.mkdir();
        }else System.out.println("directorio SanMartin ya existente");

        if (!folderCastelli.exists()){
            folderCastelli.mkdir();
        }else System.out.println("directorio Castelli ya existente");


    }

    public static boolean fileExist(Localidad localidad,String caratula, String fecha) {

        boolean result = false;

        String nombreArchivo = caratula + fecha + ".txt";

        File archivo = new File("./GNUsticia/" + localidad.getName() + "/" + nombreArchivo);

        if (archivo.length() != 0){
            result = true;
        }

        System.out.println(archivo.length());

        return result;
    }
}
