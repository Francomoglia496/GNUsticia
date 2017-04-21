import org.apache.commons.net.ftp.FTPClient;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by franco on 18/04/17.
 */
public class Main {

    public static void main(String[] args){

        Localidad resistencia = Localidad.resistencia();
        Localidad saenzP = Localidad.saenzP();
        Localidad villaAngela = Localidad.villaAngela();
        Localidad charata = Localidad.charata();



        FunctionsLibrary.descargarArchivo(resistencia);


    }

}
