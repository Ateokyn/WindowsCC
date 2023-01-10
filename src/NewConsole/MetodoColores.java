/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewConsole;

/**
 *
 * @author Kentry Gutter
 */
public class MetodoColores {

    public String Colores() {
        String name = "";
        int case1 = (int) (Math.random() * 8 + 1);
        for (int i = 1; i <= case1; i++) {
            int aleatorio = (int) (Math.random() * 8 + 1);
            if (aleatorio == 1) {
                String colorA = "\033[30m";
                name += colorA;
            } else if (aleatorio == 2) {
                String colorB = "\033[31m";
                name += colorB;
            } else if (aleatorio == 3) {
                String colorC = "\033[32m";
                name += colorC;
            } else if (aleatorio == 4) {
                String colorD = "\033[33m";
                name += colorD;
            } else if (aleatorio == 5) {
                String colorE = "\033[34m";
                name += colorE;
            } else if (aleatorio == 6) {
                String colorF = "\033[35m";
                name += colorF;
            } else if (aleatorio == 7) {
                String colorG = "\033[36m";
                name += colorG;
            } else if (aleatorio == 8) {
                String colorH = "\033[37m";
                name += colorH;
            } else {
                System.out.println("Lo sentimos, se presento un ERROR.");
            }
        }
        return name;
    }
}
