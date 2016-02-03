package x_tablicam;

import java.util.Random;

public class X_tablicaM {

    public int[][] tablicaKw() {
        Random r = new Random();
        int los = r.nextInt(10) + 2 * 6;

        int[][] tabZw = new int[los][los];

        for (int i = 0; i < tabZw.length; i++) {
            for (int j = 0; j < tabZw[i].length; j++) {
                tabZw[i][j] = 0;
                double liczba = r.nextDouble() * 2;
                if (liczba > 1) {
                    if (i == j) {
                        tabZw[i][j] = r.nextInt(5) - 6;
                    }
                }
                if (liczba < 1) {
                    if (i + 1 + j == los) {
                        tabZw[i][j] = 1;
                    }
                }

            }
        }
        return tabZw;
    }

    public static void main(String[] args) {
        X_tablicaM e = new X_tablicaM();
        int[][] tab = e.tablicaKw();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + "   ");
            }
            System.out.println();
        }
    }

}
