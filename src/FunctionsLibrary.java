import org.apache.commons.net.ftp.FTPClient;

import java.io.IOException;

/**
 * Created by franco on 18/04/17.
 */
public class FunctionsLibrary {

    public static void connecToServer(){

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

        } catch (IOException ioe){}

    }


   /* public static HashMap<String, String[]> urlsExptes(){

        //HashMap<String, HashMap<>> map = new HashMap<String, String[]>();

        /*String[] listaResistencia = {"ftp://justiciachaco.gov.ar/listas/C_A_Civ_y_Com_Sala_I/Cam_Civ_Sala_I_",
                "ftp://justiciachaco.gov.ar/listas/C_A_Civ_y_Com_Sala_II/Cam_Civ_Sala_II_",
                "ftp://justiciachaco.gov.ar/listas/C_A_Civ_y_Com_Sala_III/Cam_Civ_Sala_III_",
                "ftp://justiciachaco.gov.ar/listas/C_A_Civ_y_Com_Sala_IV/Cam_Civ_Sala_IV_",
                "ftp://justiciachaco.gov.ar/listas/Camara_Cont_Admin/Camara_Cont_Adm_Sala_1_",
                "ftp://justiciachaco.gov.ar/listas/Camara_Cont_Admin/Camara_Cont_Adm_Sala_2_",
                "ftp://justiciachaco.gov.ar/listas/Camara_Laboral_Sala_I/Cam_Lab_Sala_I_",
                "ftp://justiciachaco.gov.ar/listas/Camara_Laboral_Sala_II/Cam_Lab_Sala_II_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_10/Juzgado_Civil_10_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_11/Juzgado_Civil_11_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_12/Juzgado_Civil_12_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_13/Juzgado_Civil_13_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_14/Juzgado_Civil_14_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_15/Juzgado_Civil_15_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_16/Juzgado_Civil_16_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_17/Juzgado_Civil_17_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_18/Juzgado_Civil_18_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_19/Juzgado_Civil_19_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_1/Juzgado_Civil_1_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_20/Juzgado_Civil_20_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_21/Juzgado_Civil_21_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_22/Juzgado_Civil_22_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_23/Juzgado_Civil_23_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_2/Juzgado_Civil_2_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_3/Juzgado_Civil_3_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_4/Juzgado_Civil_4_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_5/Juzgado_Civil_5_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_6/Juzgado_Civil_6_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_7/Juzgado_Civil_7_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_8/Juzgado_Civil_8_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_9/Juzgado_Civil_9_",
                "ftp://justiciachaco.gov.ar/listas/Registro_Pub_Comercio/Reg_Publico_Comercio_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Notarial/Juzgado_Notarial_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Laboral_1/Juzgado_Laboral_1_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Laboral_2/Juzgado_Laboral_2_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Laboral_3/Juzgado_Laboral_3_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Laboral_4/Juzgado_Laboral_4_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_M-y-Familia_1/Juzg_M-y-Familia_1_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_M-y-Familia_2/Juzg_M-y-Familia_2_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_M-y-Familia_5/Juzg_M-y-Familia_5_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_M-y-Familia_6/Juzg_M-y-Familia_6_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_M-y-Familia1_Sec_Soc/Juzg_M-y-F_SecSoc1_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_M-y-Familia2_Sec_Soc/Juzg_M-y-F_SecSoc2_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_M-y-Familia6_Sec_Soc/Juzg_M-y-F_SecSoc6_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Paz_1/Juzgado_Paz_1_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Paz_2/Juzgado_Paz_2_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Paz_Barranqueras/Juzgado_Paz_Barranqueras_",
                "ftp://justiciachaco.gov.ar/listas/STJ_Sala_Primera/Sala_1_Civ-Com-Lab_",
                "ftp://justiciachaco.gov.ar/listas/STJ_Sala_Segunda/Sala_2_Penal_",
                "ftp://justiciachaco.gov.ar/listas/STJ_Sec_1_Cont-Adm/Sec_1_ContAdm_",
                "ftp://justiciachaco.gov.ar/listas/STJ_Sec_2_Cont-Adm/Sec_2_ContAdm_",
                "ftp://justiciachaco.gov.ar/listas/STJ_Sec_3_Asunt-Const/Sec_3_AsuntConst_"};

        String[] provResis = {"ftp://justiciachaco.gov.ar/listas/C_A_Civ_y_Com_Sala_I_Pro/Cam_Civ_Sala_I_Pro_",
                "ftp://justiciachaco.gov.ar/listas/C_A_Civ_y_Com_Sala_II_Pro/Cam_Civ_Sala_II_Pro_",
                "ftp://justiciachaco.gov.ar/listas/C_A_Civ_y_Com_Sala_III_Pro/Cam_Civ_Sala_III_Pro_",
                "ftp://justiciachaco.gov.ar/listas/C_A_Civ_y_Com_Sala_IV_Pro/Cam_Civ_Sala_IV_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Camara_Cont_Admin_Pro/Camara_Cont_Adm_Sala_1_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Camara_Cont_Admin_Pro/Camara_Cont_Adm_Sala_2_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Camara_Laboral_Sala_I_Pro/Cam_Lab_Sala_I_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Camara_Laboral_Sala_II_Pro/Cam_Lab_Sala_II_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_10_Pro/Juzgado_Civil_10_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_11_Pro/Juzgado_Civil_11_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_12_Pro/Juzgado_Civil_12_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_13_Pro/Juzgado_Civil_13_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_14_Pro/Juzgado_Civil_14_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_15_Pro/Juzgado_Civil_15_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_16_Pro/Juzgado_Civil_16_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_17_Pro/Juzgado_Civil_17_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_18_Pro/Juzgado_Civil_18_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_19_Pro/Juzgado_Civil_19_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_1_Pro/Juzgado_Civil_1_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_20_Pro/Juzgado_Civil_20_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_21_Pro/Juzgado_Civil_21_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_22_Pro/Juzgado_Civil_22_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_23_Pro/Juzgado_Civil_23_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_2_Pro/Juzgado_Civil_2_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_3_Pro/Juzgado_Civil_3_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_4_Pro/Juzgado_Civil_4_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_5_Pro/Juzgado_Civil_5_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_6_Pro/Juzgado_Civil_6_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_7_Pro/Juzgado_Civil_7_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_8_Pro/Juzgado_Civil_8_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Civil_9_Pro/Juzgado_Civil_9_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Registro_Pub_Comercio_Pro/Reg_Publico_Comercio_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Notarial_Pro/Juzgado_Notarial_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Laboral_1_Pro/Juzgado_Laboral_1_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Laboral_2_Pro/Juzgado_Laboral_2_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Laboral_3_Pro/Juzgado_Laboral_3_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Laboral_4_Pro/Juzgado_Laboral_4_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Paz_1_Pro/Juzgado_Paz_1_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Paz_2_Pro/Juzgado_Paz_2_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Juzgado_Paz_Barranqueras/Juzgado_Paz_Barranqueras_Pro_",
                "ftp://justiciachaco.gov.ar/listas/STJ_Sala_Primera_Pro/Sala_1_Civ-Com-Lab_Pro_",
                "ftp://justiciachaco.gov.ar/listas/STJ_Sec_1_Cont-Adm_Pro/Sec_1_ContAdm_Pro_",
                "ftp://justiciachaco.gov.ar/listas/STJ_Sec_2_Cont-Adm_Pro/Sec_2_ContAdm_Pro_",
                "ftp://justiciachaco.gov.ar/listas/STJ_Sec_3_Asunt-Const_Pro/Sec_3_AsuntConst_Pro_"};



        return map;
    }*/

}
