import java.sql.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by franco on 18/04/17.
 */
public class Main {

    public static void main(String[] args){

        //Localidad resistencia = Localidad.resistencia();
        /*Localidad saenzP = Localidad.saenzP();
        Localidad villaAngela = Localidad.villaAngela();
        Localidad charata = Localidad.charata();*/

        //FunctionsLibrary.generarCarpetas();
        //FunctionsLibrary.descargarArchivo(resistencia);

        //FunctionsLibrary.connectionDB();

        /*String[] array = {
                "15874-2-xx",
                "1",
                "25326/16",
                "65412/852",
                "puto el que lee",
                "fin"
        };*/

        //FunctionsLibrary.insertIntoDB(array);

        //FunctionsLibrary.selectFromDB();




        //      intento de extraer texto

        String texto = "               CAMARA CIVIL - SALA I - Fecha Despacho: 21/04/2017\n" +
                " \n" +
                "---------------------------------------------------------------------------------\n" +
                "Orden  Expediente             Caratula\n" +
                "---------------------------------------------------------------------------------\n" +
                "1     12769/08-1-C    AYALA, PABLO RODOLFO Y LABORIE, MARTA CECILIA C/ WITH,\n" +
                "                      ALEJANDRA Y/O SANATORIO GUEMES A.C.E. Y/O SANATORIO \n" +
                "                      MATERNO INFANTIL Y/O CLINICA DE URGENCIAS S.R.L Y/O \n" +
                "                      Q S/DA�OS Y PERJUICIOS Y DA�O MORAL  -\n" +
                "                      JARDON, ROBERTO MARTIN(); ITURRI, CARLOS\n" +
                "                      ALBERTO(); SANCHEZ DANSEY, JOSE MARTIN(); CARLEN, OSVALDO\n" +
                "                      NORBERTO(); REAL, MARCO AURELIO(); DELSSIN,\n" +
                "                      FERNANDO JUAN()\n" +
                "----------------------------------------------------------------\n" +
                "2     14678/03-1-C    BANCO CREDICOOP COOPERATIVO LIMITADO C/ SUCESORES DE\n" +
                "                      MARTINEZ RUBEN HECTOR MIGUEL; SUCESORES DE DELGADO \n" +
                "                      NORMA SUSANA Y SUCESORES DE MARTINEZ RUBEN HECTOR \n" +
                "                      S/JUICIO EJECUTIVO  -\n" +
                "                      GINESTA, LUCRECIA SARA(); ABDALA, MARCELO()\n" +
                "----------------------------------------------------------------\n" +
                "3     6197/97-1-C     BANCO DE CORRIENTES S.A. C/ORDENAVIA JOSE OMAR S/JUICIO\n" +
                "                      EJECUTIVO  -\n" +
                "                      KATZ, SILVIA(); MODI, ALBERTO FABIAN()\n" +
                "----------------------------------------------------------------\n" +
                "4     9709/13-1-C     BARTOLI, PATRICIA C/ AYALA, MONICA HAYDEE S/EJECUCION DE\n" +
                "                      HONORARIOS  -\n" +
                "                      MIRO, MARIA SOFIA(); TURBAY, EMMA MARIA ELVIRA()\n" +
                "----------------------------------------------------------------\n" +
                "5     5830/11-1-C     BELOTTI, CARLOS ENZO C/ DOMINGUEZ SILVA, VIRGINIA\n" +
                "                      S/CONSIGNACION  -\n" +
                "                      RICOTTI, MARIA ANDREA(); SANCHEZ, JOSE\n" +
                "                      ALEJANDRO(); BUSEMI, PABLO E. H.(); BUSEMI, ALEJANDRA()\n" +
                "----------------------------------------------------------------\n" +
                "6     3091/13-1-C     CASTRO, ROXANA KARINA ANABEL C/ UNION DE TRABAJADORES\n" +
                "                      HOTELEROS Y GASTRONOMICOS DE LA REPUBLICA ARGENTINA \n" +
                "                      (U.T.H.G.R.A.) Y/O ABALOS, WALTER CARLOS Y/O... \n" +
                "                      S/DA�OS Y PERJUICIOS Y DA�O MORAL  -\n" +
                "                      GIMENEZ, GLORIA GABRIELA(); DIB, JOSE ENRIQUE();\n" +
                "                      AGUIRRE, ARIEL GERARDO()\n" +
                "----------------------------------------------------------------\n" +
                "7     2526/07-1-C     CONTRERA, VICENTE EN AUTOS: \"SANTOS, CECILIA V. C/\n" +
                "                      CONTRERA, VICENTE S/ JUICIO EJECUTIVO\" EXPTE N  2546/06 \n" +
                "                      S/INC. LEVANTAMIENTO DE EMBARGO  -\n" +
                "                      GALUGA, DANIEL EDGARDO(); ZURANO MARTINEZ, MIGUEL\n" +
                "                      ANTONIO() NTONIO()\n" +
                "----------------------------------------------------------------\n" +
                "8     6301/15-1-F     D.................... S/ACCION DE SIMULACION\n" +
                "                      -\n" +
                "                      MOHUAPE, MIGUEL ERNESTO(); ROLFI, ADOLFO H.()\n" +
                "----------------------------------------------------------------\n" +
                "9     6517/05-1-C     DALTAC Y CIA. S.R.L. C/ OJEDA, JUAN OSVALDO; SAUCEDO,\n" +
                "                      ROBERTO Y VI�ON, GUSTAVO ALBERTO S/JUICIO EJECUTIVO  -\n" +
                "                      DA DALT, ELDA BEATRIZ(); CAROSSINI, KARINA\n" +
                "                      ALEJANDRA() A()\n" +
                "----------------------------------------------------------------\n" +
                "10    7695/03-1-C     DE LA FUENTE, NESTOR OSVALDO C/AITOR IDER BALBO S.A.A.C.I.\n" +
                "                      Y/O QUIEN RESULTE RESPONSABLE S/DA�OS Y \n" +
                "                      PERJUICIOS  -\n" +
                "                      JUDCHAK DE KATZ, CELIA(); MIANOVICH, RICARDO\n" +
                "                      ALCIDES() S()\n" +
                "----------------------------------------------------------------\n" +
                "11    13532/16-1-C    DR. ANDRES MARTIN SALGADO JUEZ CIVIL Y COMERCIAL DE LA\n" +
                "                      DECIMOCUARTA NOMINACION E/A: \"TOSETTO, GABRIELA \n" +
                "                      FABIANA C/ TRIBUNAL DE CUENTA DE LA PROVINCIA \n" +
                "                      (COMPLETAR S/INC. DE OPOSICION  -\n" +
                "                      \n" +
                "----------------------------------------------------------------\n" +
                "12    1861/05-1-C     DYACSA S.R.L. C/ BERNARDIS, HECTOR DANIEL Y SALAZAR,\n" +
                "                      DAMIAN RAFAEL S/JUICIO EJECUTIVO  -\n" +
                "                      DA DALT, ELDA BEATRIZ(); RODRIGUEZ, LAURA MABEL()\n" +
                "----------------------------------------------------------------\n" +
                "13    13/05-1-C       DYACSA S.R.L. C/ GALARZA, ADOLFO ISIDORO Y RUIZ DIAZ,\n" +
                "                      LEONIDA S/JUICIO EJECUTIVO  -\n" +
                "                      DA DALT, ELDA BEATRIZ()\n" +
                "----------------------------------------------------------------\n" +
                "14    10708/14-1-C    ENRIQUEZ, LUIS BALDOMERO ENRIQUE C/VERGES, ROBERT ENRIQUE\n" +
                "                      S/INTERDICTO DE OBRA NUEVA  -\n" +
                "                      SANCHEZ DE LA VEGA, DIEGO(); FRONGIA, LIDIA\n" +
                "                      RICARDA() ()\n" +
                "----------------------------------------------------------------\n" +
                "15    9035/12-1-C     FERREYRA, MARIA JULIA DEL CARMEN C/BARGAS, OSVALDO\n" +
                "                      S/EJECUCION DE HONORARIOS  -\n" +
                "                      FERREYRA, MARIA J. DEL CARMEN()\n" +
                "----------------------------------------------------------------\n" +
                "16    10373/06-1-C    GALARZA, ROLANDO GABRIEL C/ SOTO, ROBERTO EPIFANIO Y/O\n" +
                "                      QUIEN RESULTE RESPONSABLE Y/O USUFRUCTUARIO Y/O \n" +
                "                      PROPIETARIO DEL RODADO DOMINIO ROZ.-278 S/DA�OS Y \n" +
                "                      PERJUICIOS  -\n" +
                "                      YAYA, JORGE ALBERTO(); VARAS, CARLOS GUILLERMO();\n" +
                "                      SANCHEZ, MARTIN ALEJANDRO()\n" +
                "----------------------------------------------------------------\n" +
                "17    513/16-1-C      GARCIA, DELIA ELIZABETH: DOSSO, OSCAR ALBERTO Y DOSSO,\n" +
                "                      MARCELO ALEJANDRO C/ PROVINCIA DEL CHACO S/EJECUCION \n" +
                "                      DE SENTENCIAS ART. 97 LEY 848  -\n" +
                "                      DOSSO, MARCELO ALEJANDRO(); MOZZATI, MARIA\n" +
                "                      OFELIA(); MEZA, LUIS ALBERTO()\n" +
                "----------------------------------------------------------------\n" +
                "18    16753/11-1-C    HONCZARUK, JAVIER GUSTAVO C/ O.S.D.E. (ORGANIZACION DE\n" +
                "                      SERVICIOS DIRECTOS EMPRESARIOS S/CUMPLIMIENTO DE \n" +
                "                      CONTRATO Y DA�OS Y PERJUICIOS  -\n" +
                "                      LOVERA, OTILIA EMILCE(); VARELA, FERNANDO\n" +
                "                      ALBERTO(); SERRANO GIMENEZ, JUAN FRANCISCO(); SERRANO\n" +
                "                      SEGURA, AGUSTINA MARIA()\n" +
                "----------------------------------------------------------------\n" +
                "19    11/17-1-O       INSTITUTO DE SEGURIDAD SOCIAL, SEGUROS Y PRESTAMOS DE LA\n" +
                "                      PROVINCIA DEL CHACO (IN.S.S.SE.P.) E/A: \"VILLA, \n" +
                "                      NELLY ROSA C/ INSTITUTO DE SEGURIDAD SOCIAL, \n" +
                "                      SEGUROS... S/RECURSO DE QUEJA  -\n" +
                "                      CASTRO, NOEMI RUTH()\n" +
                "----------------------------------------------------------------\n" +
                "20    2458/15-1-C     JUDCHAK DE KATZ, CELIA C/ DONATO, SANTIAGO S/EJECUCION DE\n" +
                "                      HONORARIOS  -\n" +
                "                      KATZ, SILVIA(); CARLEN, OSVALDO NORBERTO()\n" +
                "----------------------------------------------------------------\n" +
                "21    9246/13-1-C     JUDCHAK DE KATZ, CELIA C/ EL VIEJO BARBACUA S.A.\n" +
                "                      S/EJECUCION DE HONORARIOS  -\n" +
                "                      \n" +
                "----------------------------------------------------------------\n" +
                "22    17868/10-1-C    KOLESNIK, SARA INES C/FIGUEROA, ALEJO RICARDO Y/O EMPRESA\n" +
                "                      SAN FERNANDO URBANO Y/O PROTECCION MUTUAL DE SEG. \n" +
                "                      Y/O PROP. Y/O USUFRUCTUARIO Y/O TENEDOR Y/O... \n" +
                "                      S/DA�OS Y PERJUICIOS POR ACCIDENTE DE TRANSITO  -\n" +
                "                      GUEVARA, SERGIO ANIBAL(); CAMARGO, LUIS R.();\n" +
                "                      CASTEL-N, FRANCISCO ROMERO(); GINESTA, LUCRECIA\n" +
                "                      SARA(); CONTRERAS, MARIO ROBERTO()\n" +
                "----------------------------------------------------------------\n" +
                "23    665/13-1-C      LUQUE, ANA C/ FERNANDEZ, JORGE RAMON, CONDUCTOR DEL\n" +
                "                      OMNIBUS DOMINIO LDB-183 Y/O TRANSPORTE INTERPROVINCIAL \n" +
                "                      CORRENTINO S.A. (T.I.C.S.A.) Y/O QUIEN RESULTE \n" +
                "                      RES... S/DA�OS Y PERJUICIOS Y DA�O MORAL POR ACCIDENTE \n" +
                "                      DE TRANSITO  -\n" +
                "                      VARAS (H), MAXIMINO FACUNDO(); GONZALEZ ACEVEDO,\n" +
                "                      WALTER ALEJANDRO(); ORTIZ, SANDRA MARCELA();\n" +
                "                      OCAMPO, ALEJANDRA LUCIA(); CLAUDIANI, EDUARDO ARTURO();\n" +
                "                      GINESTA, LUCRECIA SARA()\n" +
                "----------------------------------------------------------------\n" +
                "24    90/17-1-C       MAIDANA, RAMONA C/OBRA SOCIAL DE LA UNION PERSONAL DE LA\n" +
                "                      NACION S/MEDIDA AUTOSATISFACTIVA  -\n" +
                "                      ABRAHAM, ANA DEL CARMEN(); POZZI, LILIANA\n" +
                "                      LEONOR( \n" +
                "----------------------------------------------------------------\n" +
                "25    40/94-1-C       MIRANDA, VICTOR LEONARDO C/ PAREDES, JUAN CARLOS Y/O\n" +
                "                      EMPRESA ATACO NORTE Y/O QUIEN RESULTE RESPONSABLE \n" +
                "                      S/DA�OS Y PERJUICIOS Y DA�O MORAL  -\n" +
                "                      RABOSSI, ADRIAN(); YAYA, JORGE ALBERTO(); MORALES,\n" +
                "                      SANDRA LILIANA()\n" +
                "----------------------------------------------------------------\n" +
                "26    9708/13-1-C     MIRO, MARIA SOFIA C/ AYALA, MONICA HAYDEE S/EJECUCION DE\n" +
                "                      HONORARIOS  -\n" +
                "                      BARTOLI, PATRICIA LILIANA(); TURBAY, EMMA MARIA\n" +
                "                      ELVIRA() IRA()\n" +
                "----------------------------------------------------------------\n" +
                "27    7356/07-1-C     MOLINA, NORMA BEATRIZ C/ ORTELLADO, JOSE Y/U OCUPANTES\n" +
                "                      S/ACCION DE REIVINDICACION  -\n" +
                "                      RAMIREZ, DUILIO JORGE(); FERNANDEZ, ANDRES A.();\n" +
                "                      ALOS, JAVIER OSVALDO()\n" +
                "----------------------------------------------------------------\n" +
                "28    7656/08-1-C     MUNICIPALIDAD DE BARRANQUERAS C/ BRANCHI, LUIS FELIX\n" +
                "                      S/DESALOJO  -\n" +
                "                      VINOKUROV, RAUL MAURICIO(); BARBIERI, JORGE\n" +
                "                      ALBERTO(); BERNARDIS, MARCELA ALEJANDRA()\n" +
                "----------------------------------------------------------------\n" +
                "29    70/10-1-C       MUNICIPALIDAD DE RESISTENCIA C/ INSTITUTO PROVINCIAL DE\n" +
                "                      DESARROLLO URBANO Y VIVIENDA (I.P.D.U.V.) \n" +
                "                      S/EJECUCION FISCAL  -\n" +
                "                      BARRETO, MARIA SILVIA(); FLORES, ALICIA MONICA()\n" +
                "----------------------------------------------------------------\n" +
                "30    1674/16-1-C     SANCHEZ, MAGDALENA C/SANCHEZ, PAULINA LEONOR Y ESCOBAR,\n" +
                "                      CLAUDIO NORBERTO S/DESALOJO  -\n" +
                "                      QUI�ONEZ, JULIO MANUEL(); ARG_ELLO, DANIEL ARIEL\n" +
                "                      FERNANDO() RNANDO()\n" +
                "----------------------------------------------------------------\n" +
                "31    12667/15-1-C    SAUCEDO, NATALIA ALEJANDRA Y SAUCEDO, SERGIO DAVID\n" +
                "                      C/GENOVESE, OSCAR ORLANDO S/ACCION DE REIVINDICACION  -\n" +
                "                      MONTI, KARINA ARACELI(); KURAY, NESTOR ARIEL()\n" +
                "----------------------------------------------------------------\n" +
                "32    714/13-1-C      SINDICATO ARGENTINO DE TELEVISION, SERVICIOS\n" +
                "                      AUDIOVISUALES, INTERACTIVOS Y DE DATOS C/ MACHAGAI CABLE Y \n" +
                "                      MULTIMEDIA S.A. S/APREMIO  -\n" +
                "                      SCHWARTZ, CARLOS FELIPE(); FIGUEROA, ALBERTO\n" +
                "                      FEDERICO() CO()\n" +
                "----------------------------------------------------------------\n" +
                "33    3238/03-1-C     TABANELLI, EDUARDO JOSE C/ BANCA NAZIONALE DEL LAVORO S.A.\n" +
                "                      Y/O QUIEN RESULTE RESPONSABLE S/DA�OS Y \n" +
                "                      PERJUICIOS Y DA�O MORAL  -\n" +
                "                      JARA MELAGRANI, UBALDO(); JARA MELAGRANI,\n" +
                "                      MARIANO(); MOUSSA, ROSA NORMA(); MANSILLA, HORACIO\n" +
                "                      ALFREDO() )\n" +
                "----------------------------------------------------------------\n" +
                "34    3594/12-1-C     VARGAS, MARIO DANIEL C/ DISTRIBUIDORA ALKA S.R.L. S/DA�OS\n" +
                "                      Y PERJUICIOS  -\n" +
                "                      PEDERSEN, GUSTAVO(); JUDCHAK DE KATZ, CELIA();\n" +
                "                      SERRANO SEGURA, AGUSTINA MARIA(); SERRANO SEGURA,\n" +
                "                      GLORIA MARIA()\n" +
                "----------------------------------------------------------------\n" +
                "35    6819/08-1-C     WORKSYSTEM SERVICIOS INFORMATICOS S.R.L. C/ TORRES, COSME\n" +
                "                      DAMIAN Y/U ORBIS COMPA�IA ARGENTINA DE SEGUROS S.A \n" +
                "                      Y/O QUIEN RESULTE RESPONSABLE S/DA�OS Y \n" +
                "                      PERJUICIOS POR ACCIDENTE DE TRANSITO  -\n" +
                "                      JARDON, ROBERTO MARTIN(); ACOSTA, EDGARDO\n" +
                "                      DANIEL(); TORRES, CLAUDIO LUIS()\n" +
                "----------------------------------------------------------------\n" +
                "36    5993/12-1-C     YEDRO, DANIEL C/SERVICIOS ENERGETICOS DEL CHACO EMPRESA\n" +
                "                      DEL ESTADO PROVINCIAL (S.E.CH.E.E.P.) Y/O QUIEN \n" +
                "                      RESULTE PROPIETARIO, USUARIO O USUFRUCTUARIO Y/O... \n" +
                "                      S/DA�OS Y PERJUICIOS Y DA�O MORAL  -\n" +
                "                      FERREYRA, ANGEL GUSTAVO(); BERNARDIS, MARCELA\n" +
                "                      ALEJANDRA(); BISTOLETTI, HILARIO JOSE(); PENCHANSKY,\n" +
                "                      MARIANA(); ROMERO, MARIA DEL CARMEN(); SIMONI,\n" +
                "                      OSVALDO JOSE()\n" +
                "----------------------------------------------------------------\n" +
                "37    18/17-1-O       YEDRO, MONICA TERESA C/ INSTITUTO DE SEGURIDAD SOCIAL,\n" +
                "                      SEGUROS Y PRSTAMOS DE LA PROVINCIA (IN.S.S.SE.P.) \n" +
                "                      S/ACCION DE AMPARO  -\n" +
                "                      GONZALEZ, ZUNILDA INES(); ARZAMENDIA DE GUIRADO,\n" +
                "                      NORMA B.()\n" +
                "----------------------------------------------------------------\n" +
                "38    7359/16-1-C     ZARABOZO, LAUTARO EMANUEL C/CAMPOS, MARIO NESTOR Y/O\n" +
                "                      GOBIERNO DE LA PROVINCIA DEL CHACO (MINISTERIO DE SALUD \n" +
                "                      PUBLICA) Y/O QUIEN RESULTE PROPIETARIO Y/O \n" +
                "                      USUFRUCU S/DA�OS Y PERJUICIOS POR ACCIDENTE DE TRANSITO \n" +
                "                      -\n" +
                "                      SUAREZ PORTELA, AMILCAR(); PENCHANSKY, JUAN\n" +
                "                      CESAR(); RODRIGUEZ, LAURA MABEL(); DUARTE ARTECONA,\n" +
                "                      JULIA ELENA()\n" +
                "----------------------------------------------------------------";

        // corto = 64
        // largo = 81
        String[] array = {"7359/16-1-C","3238/03-1-C"};
        FunctionsLibrary.insertIntoDB(array);

        String[] result = texto.split("----------------------------------------------------------------");

        //System.out.println(result[3]);

        ArrayList<String> exptes = FunctionsLibrary.selectFromDB();

        for (String a : exptes){

            for (String b : result){

                if (b.contains(a)){
                    System.out.println(b);
                }

            }

        }


    }

}
