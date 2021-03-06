package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static String getProblem(String x, String z, String k) {
        if (x.equals("Add")) return AddBook(z);
        if (x.equals("Rea")) return ReaBook(z);
        if (x.equals("Chg")) return CchangeBook(z, k);
        if (x.equals("Del")) return DelBook(z);
        if (x.equals("Scn")) return ScnBook(z);
        return "";
    }

    public static String ScnBook(String timerZ) {
        Library libAuth = new Library();
        ArrayList<String> libraryAUT = libAuth.LibAuthorCl();
        Library libTitle = new Library();
        ArrayList<String> libraryTIT = libTitle.LibTitleCl();
        Library libGenre = new Library();
        ArrayList<String> libraryGEN = libGenre.LibGenreCl();
        Library libShelf = new Library();
        ArrayList<String> librarySHE = libShelf.LibShelfCl();
        StringBuilder returning = new StringBuilder();
        String[] timez = timerZ.split(";;;");

        int[] spisokNum = new int[libraryAUT.size()];

        for (int i = 0; i < timez.length; i++) {
            System.out.print(timez[i] + " Этот элемент \n");
            if ((timez[i].equals("")) || (timez[i].equals(" "))) continue;
            if (i == 0) {
                for (int l = 0; l < spisokNum.length; l++) {
                    if (spisokNum[l] == -1) continue;

                    if (timez[i].equals(libraryAUT.get(l))) {
                        System.out.print(libraryAUT.get(l) + "              совпадает \n");
                    } else {
                        spisokNum[l] = -1;
                    }
                }
            }

            if (i == 1) {
                for (int l = 0; l < spisokNum.length; l++) {
                    if (spisokNum[l] == -1) continue;

                    if (timez[i].equals(libraryTIT.get(l))) {
                        System.out.print(libraryTIT.get(l) + "              совпадает \n");
                    } else {
                        spisokNum[l] = -1;
                    }
                }
            }
            if (i == 2) {
                for (int l = 0; l < spisokNum.length; l++) {
                    if (spisokNum[l] == -1) continue;

                    if (timez[i].equals(libraryGEN.get(l))) {
                        System.out.print(libraryGEN.get(l) + "              совпадает \n");
                    } else {
                        spisokNum[l] = -1;
                    }
                }
            }
            if (i == 3) {
                for (int l = 0; l < spisokNum.length; l++) {
                    if (spisokNum[l] == -1) continue;

                    if (timez[i].equals(librarySHE.get(l))) {
                        System.out.print(librarySHE.get(l) + "              совпадает \n");
                    } else {
                        spisokNum[l] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < spisokNum.length; i++) System.out.print(spisokNum[i]);
        int chetchik = 0;
        for (int ti = 0; ti < spisokNum.length; ti++) {
            if (spisokNum[ti] == 0) chetchik++;
        }
        for (int ti = 0; ti < spisokNum.length; ti++) {
            if (spisokNum[ti] == 0) {
                returning.append(libraryAUT.get(ti)).append(" ");
                returning.append(libraryTIT.get(ti)).append(" ");
                returning.append(libraryGEN.get(ti)).append(" ");
                returning.append(librarySHE.get(ti));
                if (chetchik != 1) {
                    chetchik--;
                    returning.append("\n");
                }
            }

        }
        return returning.toString();
    }

    public static String DelBook(String timerZ) {
        Library libAuth = new Library();
        ArrayList<String> libraryAUT = libAuth.LibAuthorCl();
        Library libTitle = new Library();
        ArrayList<String> libraryTIT = libTitle.LibTitleCl();
        Library libGenre = new Library();
        ArrayList<String> libraryGEN = libGenre.LibGenreCl();
        Library libShelf = new Library();
        ArrayList<String> librarySHE = libShelf.LibShelfCl();
        StringBuilder returning = new StringBuilder();
        String[] timez = timerZ.split(";;;");

        int[] spisokNum = new int[libraryAUT.size()];

        for (int i = 0; i < timez.length; i++) {
            System.out.print(timez[i] + " Этот элемент \n");
            if (i == 0) {
                for (int l = 0; l < spisokNum.length; l++) {
                    if (spisokNum[l] == -1) continue;

                    if (timez[i].equals(libraryAUT.get(l))) {
                        System.out.print(libraryAUT.get(l) + "              совпадает \n");
                    } else {
                        spisokNum[l] = -1;
                    }
                }
            }

            if (i == 1) {
                for (int l = 0; l < spisokNum.length; l++) {
                    if (spisokNum[l] == -1) continue;

                    if (timez[i].equals(libraryTIT.get(l))) {
                        System.out.print(libraryTIT.get(l) + "              совпадает \n");
                    } else {
                        spisokNum[l] = -1;
                    }
                }
            }
            if (i == 2) {
                for (int l = 0; l < spisokNum.length; l++) {
                    if (spisokNum[l] == -1) continue;

                    if (timez[i].equals(libraryGEN.get(l))) {
                        System.out.print(libraryGEN.get(l) + "              совпадает \n");
                    } else {
                        spisokNum[l] = -1;
                    }
                }
            }
            if (i == 3) {
                for (int l = 0; l < spisokNum.length; l++) {
                    if (spisokNum[l] == -1) continue;

                    if (timez[i].equals(librarySHE.get(l))) {
                        System.out.print(librarySHE.get(l) + "              совпадает \n");
                    } else {
                        spisokNum[l] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < spisokNum.length; i++) System.out.print(spisokNum[i]);

        for (int ti = 0; ti < spisokNum.length; ti++) {
            if (spisokNum[ti] == 0) continue;
            if (spisokNum[ti] == -1) {
                returning.append(libraryAUT.get(ti)).append(" ");
                returning.append(libraryTIT.get(ti)).append(" ");
                returning.append(libraryGEN.get(ti)).append(" ");
                returning.append(librarySHE.get(ti));
            }
            if (spisokNum.length - 1 != ti) returning.append("\n");
        }
        return returning.toString();
    }

    public static String ReaBook(String timerZ) {
        Library libAuth = new Library();
        ArrayList<String> libraryAUT = libAuth.LibAuthorCl();
        Library libTitle = new Library();
        ArrayList<String> libraryTIT = libTitle.LibTitleCl();
        Library libGenre = new Library();
        ArrayList<String> libraryGEN = libGenre.LibGenreCl();
        Library libShelf = new Library();
        ArrayList<String> librarySHE = libShelf.LibShelfCl();
        StringBuilder finish = new StringBuilder();
        for (int t = 0; t < libraryAUT.size(); t++) {
            finish.append(libraryAUT.get(t));
            finish.append(" ");
            finish.append(libraryTIT.get(t));
            finish.append(" ");
            finish.append(libraryGEN.get(t));
            finish.append(" ");
            finish.append(librarySHE.get(t));
            if (t < libraryAUT.size() - 1) finish.append("\n");
        }
        return finish.toString();
    }

    public static String AddBook(String timerZ) {
        Library libAuth = new Library();
        ArrayList<String> libraryAUT = libAuth.LibAuthorCl();
        Library libTitle = new Library();
        ArrayList<String> libraryTIT = libTitle.LibTitleCl();
        Library libGenre = new Library();
        ArrayList<String> libraryGEN = libGenre.LibGenreCl();
        Library libShelf = new Library();
        ArrayList<String> librarySHE = libShelf.LibShelfCl();
        StringBuilder finish = new StringBuilder();

        for (int t = 0; t < libraryAUT.size(); t++) {
            if (t == 0) finish.append(timerZ).append("\n");
            finish.append(libraryAUT.get(t));
            finish.append(" ");
            finish.append(libraryTIT.get(t));
            finish.append(" ");
            finish.append(libraryGEN.get(t));
            finish.append(" ");
            finish.append(librarySHE.get(t));
            if (t < libraryAUT.size() - 1) finish.append("\n");

        }
        return finish.toString();
    }

    public static String CchangeBook(String timerZ, String timerK) {
        Library libAuth = new Library();
        ArrayList<String> libraryAUT = libAuth.LibAuthorCl();
        Library libTitle = new Library();
        ArrayList<String> libraryTIT = libTitle.LibTitleCl();
        Library libGenre = new Library();
        ArrayList<String> libraryGEN = libGenre.LibGenreCl();
        Library libShelf = new Library();
        ArrayList<String> librarySHE = libShelf.LibShelfCl();
        StringBuilder returning = new StringBuilder();
        String[] timez = timerZ.split(";;;");

        int[] spisokNum = new int[libraryAUT.size()];

        for (int i = 0; i < timez.length; i++) {
            System.out.print(timez[i] + " Этот элемент \n");
            if (i == 0) {
                for (int l = 0; l < spisokNum.length; l++) {
                    if (spisokNum[l] == -1) continue;

                    if (timez[i].equals(libraryAUT.get(l))) {
                        System.out.print(libraryAUT.get(l) + "              совпадает \n");
                    } else {
                        spisokNum[l] = -1;
                    }
                }
            }

            if (i == 1) {
                for (int l = 0; l < spisokNum.length; l++) {
                    if (spisokNum[l] == -1) continue;

                    if (timez[i].equals(libraryTIT.get(l))) {
                        System.out.print(libraryTIT.get(l) + "              совпадает \n");
                    } else {
                        spisokNum[l] = -1;
                    }
                }
            }
            if (i == 2) {
                for (int l = 0; l < spisokNum.length; l++) {
                    if (spisokNum[l] == -1) continue;

                    if (timez[i].equals(libraryGEN.get(l))) {
                        System.out.print(libraryGEN.get(l) + "              совпадает \n");
                    } else {
                        spisokNum[l] = -1;
                    }
                }
            }
            if (i == 3) {
                for (int l = 0; l < spisokNum.length; l++) {
                    if (spisokNum[l] == -1) continue;

                    if (timez[i].equals(librarySHE.get(l))) {
                        System.out.print(librarySHE.get(l) + "              совпадает \n");
                    } else {
                        spisokNum[l] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < spisokNum.length; i++) System.out.print(spisokNum[i]);

        for (int ti = 0; ti < spisokNum.length; ti++) {
            if (spisokNum[ti] == 0) returning.append(timerK);
            if (spisokNum[ti] == -1) {
                returning.append(libraryAUT.get(ti)).append(" ");
                returning.append(libraryTIT.get(ti)).append(" ");
                returning.append(libraryGEN.get(ti)).append(" ");
                returning.append(librarySHE.get(ti));
            }
            if (spisokNum.length - 1 != ti) returning.append("\n");
        }
        return returning.toString();
    }
}


class Library {
    public ArrayList<String[]> libraryFinTest() {
        ArrayList<String[]> returning = new ArrayList<String[]>();
        String timer = "a;;;b;;;c;;;d\nk;;;l;;;m;;;d\nd;;;u;;;b;;;m\nz;;;o;;;p;;;p\na;;;w;;;m;;;d\na;;;a;;;a;;;a\n";
        String[] timer2 = timer.split("\n");
        for (int i = 0; i < timer2.length; i++) {
            returning.add(timer2[i].split(";;;"));
        }
        return returning;
    }

    public ArrayList<String> LibAuthorCl() {
        ArrayList<String> returning = new ArrayList<String>();
        String timer1 = "nameA;;;nameB;;;nameC;;;nameD;;;nameE;;;nameA;;;nameH";
        String[] timer2 = timer1.split(";;;");
        returning.addAll(Arrays.asList(timer2));
        return returning;
    }

    public ArrayList<String> LibTitleCl() {
        ArrayList<String> returning = new ArrayList<String>();
        String timer1 = "titlA;;;titlB;;;titlC;;;titlD;;;titlE;;;titlA;;;titlH";
        String[] timer2 = timer1.split(";;;");
        returning.addAll(Arrays.asList(timer2));
        return returning;
    }

    public ArrayList<String> LibGenreCl() {
        ArrayList<String> returning = new ArrayList<String>();
        String timer1 = "genrA;;;genrB;;;genrC;;;genrD;;;genrE;;;genrA;;;genrH";
        String[] timer2 = timer1.split(";;;");
        returning.addAll(Arrays.asList(timer2));
        return returning;
    }

    public ArrayList<String> LibShelfCl() {
        ArrayList<String> returning = new ArrayList<String>();
        String timer1 = "shelA;;;shelB;;;shelC;;;shelD;;;shelE;;;shelV;;;shelH";
        String[] timer2 = timer1.split(";;;");
        returning.addAll(Arrays.asList(timer2));
        return returning;
    }

}
