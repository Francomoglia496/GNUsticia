import java.util.Arrays;

/**
 * Created by franco on 20/04/17.
 */
public class Localidad {

    private String[] caratulas;
    private String[] proveidos;

    public String[] getCaratulas() {
        return caratulas;
    }

    public void setCaratulas(String[] caratulas) {
        this.caratulas = caratulas;
    }

    public String[] getProveidos() {
        return proveidos;
    }

    public void setProveidos(String[] proveidos) {
        this.proveidos = proveidos;
    }


    @Override
    public String toString() {
        return "Localidad{" +
                "caratulas=" + Arrays.toString(caratulas) +
                ", proveidos=" + Arrays.toString(proveidos) +
                '}';
    }

    public static Localidad resistencia(){

        Localidad listasResistencia = new Localidad();

        String[] caratulas = {"ftp://justiciachaco.gov.ar/listas/C_A_Civ_y_Com_Sala_I/Cam_Civ_Sala_I_",
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

        String[] proveidos = {"ftp://justiciachaco.gov.ar/listas/C_A_Civ_y_Com_Sala_I_Pro/Cam_Civ_Sala_I_Pro_",
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

        listasResistencia.setCaratulas(caratulas);
        listasResistencia.setProveidos(proveidos);

        return listasResistencia;
    }

    public static Localidad saenzP(){

        Localidad listasSP = new Localidad();

        String[] caratulas = {"ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Camara_Laboral_SP/cam_lab_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Cam_Civ_Sal_II_SP/cam_civ_sal_II_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Cam_Civ_Sal_I_SP/cam_civ_sal_I_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Civil_1_Sec1_SP/Juzg_Civ_1_Sec1_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Civil_1_Sec2_SP/Juzg_Civ_1_Sec2_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Civil_2_Sec3_SP/Juzg_Civ_2_Sec3_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Civil_2_Sec4_SP/Juzg_Civ_2_Sec4_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Laboral_02_SP/Juzgado_Laboral_2_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Laboral_SP/Juzgado_Laboral_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_M-y-Familia_SP/Juzg_M_y_Familia_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Notarial_SP/Juzg_Notarial_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Paz_Sec1_SP/Juzg_Paz_Sec1_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Paz_Sec2_SP/Juzg_Paz_Sec2_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_PECQ_SP/Juzg_pecq_SP_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Registro_Pub_Comercio_SP/Reg_Publico_Comercio_SP_"};

        String[] proveidos = {"ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Camara_Laboral_SP/cam_lab_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Cam_Civ_Sal_II_SP/cam_civ_sal_II_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Cam_Civ_Sal_I_SP/cam_civ_sal_I_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Civil_1_Sec1_SP/Juzg_Civ_1_Sec1_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Civil_1_Sec2_SP/Juzg_Civ_1_Sec2_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Civil_2_Sec3_SP/Juzg_Civ_2_Sec3_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Civil_2_Sec4_SP/Juzg_Civ_2_Sec4_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Laboral_02_SP/Juzgado_Laboral_2_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Laboral_SP/Juzgado_Laboral_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Notarial_SP/Juzg_Notarial_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Paz_Sec1_SP/Juzg_Paz_Sec1_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_Paz_Sec2_SP/Juzg_Paz_Sec2_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Juzgado_PECQ_SP/Juzg_pecq_SP_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Saenz_Pena/Registro_Pub_Comercio_SP/Reg_Publico_Comercio_SP_Pro_"};

        listasSP.setCaratulas(caratulas);
        listasSP.setProveidos(proveidos);

        return listasSP;
    }

    public static Localidad villaAngela()   {

        Localidad listasVillaAngela = new Localidad();

        String[] caratulas = {"ftp://justiciachaco.gov.ar/listas/Villa_Angela/Juzgado_Civil_1/Juzg_Civil_1_V_Angela_",
                "ftp://justiciachaco.gov.ar/listas/Villa_Angela/Juzgado_Civil_2/Juzg_Civil_2_V_Angela_",
                "ftp://justiciachaco.gov.ar/listas/Villa_Angela/Juzgado_laboral/Juzg_Lab_V_Angela_",
                "ftp://justiciachaco.gov.ar/listas/Villa_Angela/Juzgado_M-y-Familia/Juzg_M_y_Familia_VAngela_",
                "ftp://justiciachaco.gov.ar/listas/Villa_Angela/Juzgado_Paz/Juzg_Paz_V_Angela_"};

        String[] proveidos = {"ftp://justiciachaco.gov.ar/listas/Villa_Angela/Juzgado_Civil_1/Juzg_Civil_1_V_Angela_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Villa_Angela/Juzgado_Civil_2/Juzg_Civil_2_V_Angela_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Villa_Angela/Juzgado_laboral/Juzg_Lab_V_Angela_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Villa_Angela/Juzgado_Paz/Juzg_Paz_V_Angela_Pro_"};

        listasVillaAngela.setCaratulas(caratulas);
        listasVillaAngela.setProveidos(proveidos);


        return listasVillaAngela;
    }

    public static Localidad charata(){

        Localidad listasCharata = new Localidad();

        String[] caratulas = {
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_Civ_Lab_Sec_Civil/JCCyL_1_Charata_SecCivil_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_Civ_Lab_Sec_Civil/JCCyL_2_Charata_SecCivil_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_Civ_Lab_Sec_Civil/JCCyL_2_Charata_SecLab_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_Civ_Lab_Sec_Laboral/JCCyL_1_Charata_SecLab_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_Civ_Lab_Sec_Laboral/JCCyL_2_Charata_SecLab_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_M-y-Familia/Familia_Civil_Charata_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_M-y-Familia/Familia_Social_Charata_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_Paz_CH/Juzgado_Paz_CH_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Registro_Pub_Comercio/RegistroPC_Charata_"
        };

        String[] proveidos = {
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_Civ_Lab_Sec_Civil/JCCyL_1_Charata_SecCivil_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_Civ_Lab_Sec_Civil/JCCyL_2_Charata_SecCivil_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_Civ_Lab_Sec_Civil/JCCyL_2_Charata_SecLab_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_Civ_Lab_Sec_Laboral/JCCyL_1_Charata_SecLab_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_Civ_Lab_Sec_Laboral/JCCyL_2_Charata_SecLab_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Juzgado_Paz_CH/Juzgado_Paz_CH_Pro_",
                "ftp://justiciachaco.gov.ar/listas/Charata/Registro_Pub_Comercio/RegistroPC_Charata_Pro_"
        };

        listasCharata.setCaratulas(caratulas);
        listasCharata.setProveidos(proveidos);


        return listasCharata;
    }

    public static Localidad sanMartin(){

        Localidad listasSanMartin = new Localidad();

        String[] caratulas = {
                "ftp://justiciachaco.gov.ar/listas/San_Martin/Juzgado_Civ_Fam/Juzgado_Civ_Fam_",
                "ftp://justiciachaco.gov.ar/listas/San_Martin/Juzgado_Civ_Lab/Juzgado_Civ_Lab_",
                "ftp://justiciachaco.gov.ar/listas/San_Martin/Juzgado_Paz/Juzgado_Paz_"
        };

        String[] proveidos = {
                "ftp://justiciachaco.gov.ar/listas/San_Martin/Juzgado_Civ_Lab/Juzgado_Civ_Lab_Pro_",
                "ftp://justiciachaco.gov.ar/listas/San_Martin/Juzgado_Paz/Juzgado_Paz_Pro_"
        };

        listasSanMartin.setCaratulas(caratulas);
        listasSanMartin.setProveidos(proveidos);


        return listasSanMartin;
    }

    public static Localidad Castelli(){

        Localidad listasCastelli = new Localidad();

        String[] caratulas = {
                "ftp://justiciachaco.gov.ar/listas/J_J_Castelli/Juzgado_Civil_JJC/JCCyL_Castelli_JuzgCivil_",
                "ftp://justiciachaco.gov.ar/listas/J_J_Castelli/Juzgado_Familia_JJC/Juzgado_Familia_JJC_",
                "ftp://justiciachaco.gov.ar/listas/J_J_Castelli/Juzgado_Laboral_JJC/JCCyL_Castelli_JuzgLab_",
                "ftp://justiciachaco.gov.ar/listas/J_J_Castelli/Juzgado_Paz_JJC/Juzgado_Paz_JJC_"
        };

        String[] proveidos = {
                "ftp://justiciachaco.gov.ar/listas/J_J_Castelli/Juzgado_Civil_JJC/JCCyL_Castelli_JuzgCivil_Pro_",
                "ftp://justiciachaco.gov.ar/listas/J_J_Castelli/Juzgado_Laboral_JJC/JCCyL_Castelli_JuzgLab_Pro_",
                "ftp://justiciachaco.gov.ar/listas/J_J_Castelli/Juzgado_Paz_JJC/Juzgado_Paz_JJC_Pro_"
        };

        listasCastelli.setCaratulas(caratulas);
        listasCastelli.setProveidos(proveidos);


        return listasCastelli;
    }


}
