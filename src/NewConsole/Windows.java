package NewConsole;

/*Creado por Kentry Gutter...
//Titulo Version Windoms Color.
//Dia: Enero/04/2023
//Hora: 12:45:00PM
//Estorno de desarrollo NetBeans IDE 8.2 - Java8.
//Proximo desarrollo = String BackGround color aleatorio.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Windows {

    public static void main(String[] args) {

        int Pulsar = 1;
        String tab = "\033[32m ...> ";
        String red = "\033[31m", blue = "\033[34m", purple = "\033[35m";
        String BackGround = "\033[44m::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\033[49m";
        //Hora y Fecha
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
        Date time = new Date();
        Date date = new Date();
        //...
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("\033[32m Run...> Siguiente Pulse Enter | \033[31m Salir Ingrese Exit");
            System.out.print(tab);
            String Enter = in.nextLine();
            if (Enter.isEmpty()) {
                int windows = (int) (Math.random() * 17 + 1);
                String name = null;

                switch (windows) {
                    case 1:
                        MetodoColores mc1 = new MetodoColores();
                        name = mc1.Colores() + " Windows 1.0 (1985)";
                        break;
                    case 2:
                        MetodoColores mc2 = new MetodoColores();
                        name = mc2.Colores() + " Windows 2.0 (1987)";
                        break;
                    case 3:
                        MetodoColores mc3 = new MetodoColores();
                        name = mc3.Colores() + " Windows 3.0 (1990)";
                        break;
                    case 4:
                        MetodoColores mc4 = new MetodoColores();
                        name = mc4.Colores() + " Windows 3.1 (1992)";
                        break;
                    case 5:
                        MetodoColores mc5 = new MetodoColores();
                        name = mc5.Colores() + " Windows NT (1993)";
                        break;
                    case 6:
                        MetodoColores mc6 = new MetodoColores();
                        name = mc6.Colores() + " Windows 95 (1995)";
                        break;
                    case 7:
                        MetodoColores mc7 = new MetodoColores();
                        name = mc7.Colores() + " Windows 98 (1998)";
                        break;
                    case 8:
                        MetodoColores mc8 = new MetodoColores();
                        name = mc8.Colores() + "Windows 2000 (2000)";
                        break;
                    case 9:
                        MetodoColores mc9 = new MetodoColores();
                        name = mc9.Colores() + " Windows Me (2000)";
                        break;
                    case 10:
                        MetodoColores mc10 = new MetodoColores();
                        name = mc10.Colores() + " Windows Me (2000)";
                        break;
                    case 11:
                        MetodoColores mc11 = new MetodoColores();
                        name = mc11.Colores() + " Windows Vista (2007)";
                        break;
                    case 12:
                        MetodoColores mc12 = new MetodoColores();
                        name = mc12.Colores() + " Windows 7 (2009)";
                        break;
                    case 13:
                        MetodoColores mc13 = new MetodoColores();
                        name = mc13.Colores() + " Windows 8 (2011)";
                        break;
                    case 14:
                        MetodoColores mc14 = new MetodoColores();
                        name = mc14.Colores() + " Windows 8.1 (2013)";
                        break;
                    case 15:
                        MetodoColores mc15 = new MetodoColores();
                        name = mc15.Colores() + " Windows 10 (2014)";
                        break;
                    case 16:
                        MetodoColores mc16 = new MetodoColores();
                        name = mc16.Colores() + " Windows 10S (2015) y 10X (2020)";
                        break;
                    case 17:
                        MetodoColores mc17 = new MetodoColores();
                        name = mc17.Colores() + " Windows 11 (2021)";
                        break;
                }
                System.out.println(BackGround);
                System.out.println(tab + "|Version : " + name + "| \033[32m Posicion : " + windows + "|");
                System.out.println(BackGround);
                System.out.println(tab + blue + "|Hora : " + timeFormat.format(time) + purple + " / Fecha : " + dateFormat.format(date) + "|\033[32m");
                System.out.println(BackGround);
            } else if (Enter.equals("Exit") || Enter.equals("exit")) {
                Pulsar = 0;
            } else {
                System.out.println(tab + red + "El comando no existe.");
            }
        } while (Pulsar == 1);
    }
}
