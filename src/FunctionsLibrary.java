import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import sun.util.resources.cldr.de.CalendarData_de_LI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;

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

    public static void descargarArchivo(){

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

                System.out.println(client1.changeWorkingDirectory("listas/"));
                System.out.println(client1.changeWorkingDirectory("C_A_Civ_y_Com_Sala_I/"));

                FTPFile[] files = client1.listFiles();

                System.out.println(files.length);


                /*
                * ####################
                * BUSCAR LIBRERIA DE IMPUT
                *#####################
                * */


                fos = new FileOutputStream("/home/franco/archivo.txt");
                boolean download = client1.retrieveFile("Cam_Civ_Sala_I_2017-04-21.Txt", fos);
                if (download) {
                    System.out.println("File downloaded successfully !");
                } else {
                    System.out.println("Error in downloading file !");
                }

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
