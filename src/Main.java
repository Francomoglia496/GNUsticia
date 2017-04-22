import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by franco on 18/04/17.
 */
public class Main {

    public static void main(String[] args){

        Localidad resistencia = Localidad.resistencia();
        /*Localidad saenzP = Localidad.saenzP();
        Localidad villaAngela = Localidad.villaAngela();
        Localidad charata = Localidad.charata();*/


        /*String sistema = System.getProperty("os.name");
        System.out.println(sistema);*/

        FunctionsLibrary.generarCarpetas();
        //FunctionsLibrary.descargarArchivo(resistencia);


    }

}
