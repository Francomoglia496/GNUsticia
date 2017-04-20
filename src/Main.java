import org.apache.commons.net.ftp.FTPClient;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by franco on 18/04/17.
 */
public class Main {

    public static void main(String[] args){

        //FTPClient client = new FTPClient();

        //FunctionsLibrary.connecToServer();

        HashMap map = FunctionsLibrary.urlsExptes();

        Iterator it = map.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println(e.getKey() + "" + e.getValue());
        }


    }

}
