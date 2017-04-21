import org.apache.commons.net.ftp.FTPClient;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by franco on 18/04/17.
 */
public class Main {

    public static void main(String[] args){

        FTPClient client = new FTPClient();


        //FunctionsLibrary.connecToServer();

        /*Localidad resistencia = Localidad.resistencia();

        for (String a : resistencia.getCaratulas()) {

            System.out.println(a);

        }*/

        FunctionsLibrary.descargarArchivo();


    }

}
