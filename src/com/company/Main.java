package com.company;


public class Main {

    public static String getProblem(String x, String y, String z, String k) {
        String timeY = y;
        String timeZ = z;
        String timeK = k;
        if (x.equals("Add")) return (y + "\n" + z);
        if (x.equals("Rea")) return y;
        if (x.equals("Del")) return DdelBook(timeY, timeZ);
        if (x.equals("Chg")) return CchangeBook(timeY, timeZ, timeK);
        if (x.equals("Scn")) return SScanBook(timeY, timeZ);

        return x;
    }

    public static String SScanBook(String timerY, String timerZ) {
        String returning = "";
        String[] massScan = timerZ.split(";;;");
        String[] massLibr = timerY.split("\n");
        int schetchic = 0;
        for (int ml = 0; ml < massLibr.length; ml++) {
            int timerNumber = 0;
            String[] timeML = massLibr[ml].split(";;;");
            for (int tml = 0; tml < timeML.length; tml++) {
                if ((massScan[tml].equals(" ")) || (massScan[tml].equals(""))) timerNumber++;
                if (massScan[tml].equals(timeML[tml])) timerNumber++;

                if (timerNumber == 4) {
                    if (schetchic == 0) {
                        returning += massLibr[ml];
                        schetchic++;
                    } else if (schetchic >= 1) {
                        returning += "\n" + massLibr[ml];
                    }
                }
            }
        }
        return returning;
    }

    public static String DdelBook(String timerY, String timerZ) {
        int time = -1;
        String returning = "";
        String[] timeY = timerY.split("\n");

        for (int i = 0; i < timeY.length; i++) {
            if (timeY[i].equals(timerZ)) time += i + 1;
        }
        for (int i = 0; i < timeY.length; i++) {
            if (i != time) {
                returning += timeY[i];
                if ((i != timeY.length - 1)) returning += "\n";
            }
        }
        return returning;
    }

    public static String CchangeBook(String timerY, String timerZ, String timerK) {
        String returning = "";
        String[] timeY = timerY.split("\n");
        for (int i = 0; i < timeY.length; i++) {
            if (timeY[i].equals(timerZ)) {
                returning += timerK;
            } else returning += timeY[i];
            if (i != timeY.length - 1) returning += "\n";

        }
        return returning;
    }

}
