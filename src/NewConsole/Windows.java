package NewConsole;
/*Creado por Kentry Gutter...
//Titulo Version Windoms Color.
//Dia: Enero/04/2023
//Hora: 12:45:00PM
//Estorno de desarrollo NetBeans IDE 8.2 - Java8.
//Proximo desarrollo = Enter Automatico.
*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Windows {

    public static void main(String[] args) {

        int Pulsar = 1;
        String tab = "\033[32m ...> ";
        String red = "\033[31m", blue = "\033[34m", purple = "\033[35m";
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
        Date time = new Date();
        Date date = new Date();
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("\033[32m Run...> Siguiente Pulse Enter | \033[31m Salir Ingrese Exit");
            System.out.print(tab);
            String Enter = in.nextLine();
            if (Enter.isEmpty()) {
                int windows = (int) (Math.random() * 17 + 1);
                String name = null;

                switch (windows) {
                    case 1 :
                        int case1 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case1; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += " Windows 1.0 (1985)";
                        break;
                    case 2:
                        int case2 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case2; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows 2.0 (1987)";
                        break;
                    case 3:
                        int case3 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case3; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows 3.0 (1990)";
                        break;
                    case 4:
                        int case4 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case4; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows 3.1 (1992)";
                        break;
                    case 5:
                        int case5 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case5; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows NT (1993)";
                        break;
                    case 6:
                        int case6 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case6; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows 95 (1995)";
                        break;
                    case 7:
                        int case7 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case7; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows 98 (1998)";
                        break;
                    case 8:
                        int case8 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case8; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows 2000 (2000)";
                        break;
                    case 9:
                        int case9 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case9; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows Me (2000)";
                        break;
                    case 10:
                        int case10 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case10; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows Me (2000)";
                        break;
                    case 11:
                        int case11 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case11; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows Vista (2007)";
                        break;
                    case 12:
                        int case12 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case12; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows 7 (2009)";
                        break;
                    case 13:
                        int case13 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case13; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows 8 (2011)";
                        break;
                    case 14:
                        int case14 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case14; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows 8.1 (2013)";
                        break;
                    case 15:
                        int case15 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case15; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows 10 (2014)";
                        break;
                    case 16:
                        int case16 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case16; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows 10S (2015) y 10X (2020)";
                        break;
                    case 17:
                        int case17 = (int) (Math.random() * 8+1);
                        for(int i = 1; i <= case17; i++){
                            int aleatorio = (int) (Math.random() * 8+1);
                            if(aleatorio == 1){
                                String colorA = "\033[30m";
                                name = colorA;
                            }else if(aleatorio == 2){
                                String colorB = "\033[31m";
                                name = colorB;
                            }else if(aleatorio == 3){
                                String colorC = "\033[32m";
                                name = colorC;
                            }else if(aleatorio == 4){
                                String colorD = "\033[33m";
                                name = colorD;
                            }else if(aleatorio == 5){
                                String colorE = "\033[34m";
                                name = colorE;
                            }else if(aleatorio == 6){
                                String colorF = "\033[35m";
                                name = colorF;
                            }else if(aleatorio == 7){
                                String colorG = "\033[36m";
                                name = colorG;
                            }else if(aleatorio == 8){
                                String colorH = "\033[37m";
                                name = colorH;
                            }else{
                                System.out.println("Lo sentimos, se presento un ERROR.");
                            }
                        }
                        name += "Windows 11 (2021)";
                        break;
                }
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println(tab + "|Version : " + name + "| \033[32m Posicion : " + windows + "|");
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println(tab + blue + "|Hora : " + timeFormat.format(time) + purple + "/ Fecha : " + dateFormat.format(date) + "|");
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            } else if (Enter.equals("Exit") || Enter.equals("exit")) {
                Pulsar = 0;
            } else {
                System.out.println(tab + red + "El comando no existe.");
            }
        } while (Pulsar == 1);
    }
}
