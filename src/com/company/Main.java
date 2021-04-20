package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileOutputStream;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        for (int time = 0; time < 100; time++) {                            ///MAIN BCLOCK
            System.out.print("\n введите номер необходимого действия \n");
            System.out.print("добавить---------ADD\n");     //add        fin
            System.out.print("удалить----------DEL\n");     //delete     fin
            System.out.print("изменить---------CHG\n");     //change     fin
            System.out.print("поиск------------SCN\n");     //scan       fin
            System.out.print("читать список ---REA\n");     //read       fin
            System.out.print("Конец работы-----FIN\n");     //fin        fin
            Scanner inInMain = new Scanner(System.in);
            String addComandInMain = inInMain.nextLine().toLowerCase();

            if (addComandInMain.equals("add")) {
                AddBook bNew = new AddBook("start");
            } else if (addComandInMain.equals("del")) {
                DeleteBook dNew = new DeleteBook("start");
            } else if (addComandInMain.equals("rea")) {
                ReadListOfBook rNew = new ReadListOfBook("start");
            } else if (addComandInMain.equals("chg")) {
                CchangeBook cNew = new CchangeBook("start");
            } else if (addComandInMain.equals("scn")) {
                ScanScanBook sNew = new ScanScanBook("start");
            } else if (addComandInMain.equals("fin")) {
                System.out.print("удачи сталкер");
                break;
            }
        }
    }
}


class CchangeBook {
    String asdFast;
    ScanListOfBook ssbFinally = new ScanListOfBook();


    public CchangeBook(String startSSB) throws IOException {
        String deleteLine = "";
        asdFast = ssbFinally.howMuchNum;
        int timeNum = 0;

        String fileSeparator = File.separator;
        String fileWay = "C:" + fileSeparator + "IdeaProjects" + fileSeparator + "first project" + fileSeparator + "library.txt";

        String testPolygon = "";
        File fileB = new File(fileWay);
        Scanner scanner = new Scanner(fileB);
        while (scanner.hasNextLine()) {
            testPolygon += scanner.nextLine() + "\n";
            timeNum += 1;

        }
        scanner.close();
        String[] arrayNumber = asdFast.split(",");
        String[] finalScanScamBook = testPolygon.split("\n");
        System.out.print(Arrays.toString(arrayNumber) + "array number\n");

        for (int i = 0; i < arrayNumber.length; i++) {
            for (int k = 0; k < finalScanScamBook.length; k++) {
                String timeK = Integer.toString(k);
                if (arrayNumber[i].equals(timeK)) {

                    System.out.print(finalScanScamBook[k] + "\n");
                }
            }
        }

        for (int timeCB = 1; timeCB < 10; timeCB++) {
            System.out.print("напишите нужный номер по результатам поиска\n ");
            Scanner inINCCB = new Scanner(System.in);
            String addComandInMain = inINCCB.nextLine();
            int timeNUMBER = 0;

            try {
                timeNUMBER = new Integer(addComandInMain);
                System.out.println(timeNUMBER);
            } catch (NumberFormatException e) {
                System.err.println("Неправильный формат строки!");
            }

            String testPoly = "";
            int timeDelete = 0;
            File fileC = new File(fileWay);
            Scanner scann = new Scanner(fileB);


            while (scann.hasNext()) {

                if (timeDelete == timeNUMBER) {
                    System.out.print("ведите новые данные через энтер в порядке автор-название-жанр-полка");
                    String inIa = new Scanner(System.in).nextLine();
                    String inIb = new Scanner(System.in).nextLine();
                    String inIc = new Scanner(System.in).nextLine();
                    String inId = new Scanner(System.in).nextLine();
                    testPoly += inIa + ";;;" + inIb + ";;;" + inIc + ";;;" + inId + "\n";
                    deleteLine += scann.nextLine();
                } else {
                    testPoly += scann.nextLine() + "\n";
                }
                timeDelete += 1;

            }
            scanner.close();
            File doomedFile = new File(fileWay, "library.txt");
            doomedFile.delete();

            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(fileWay)))) {
                writer.write(testPoly);
                writer.close();
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            scanner.close();

        }

    }
}

class ScanListOfBook {
    String howMuchNum = "";

    public ScanListOfBook() {


        int truuOption = 0;
        String fileSeparator = File.separator;
        String fileWay = "C:" + fileSeparator + "IdeaProjects" + fileSeparator + "first project" + fileSeparator + "library.txt";

        File file = new File(fileWay);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] byteArray = new byte[(int) file.length()];
        try {
            fis.read(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String data = new String(byteArray);
        String[] stringArray = data.split("\r\n");

        String[] arrayData = new String[4];
        System.out.print("введите известные данные\n");
        System.out.println("введите имя автора" + " если имя не известно оставьте пробел' '\n");
        String sBname = new Scanner(System.in).nextLine();
        if (!sBname.equals(" ")) truuOption += 1;
        arrayData[0] = sBname;
        System.out.println("введите название книги" + " если название не известно оставьте пробел' '\n");
        String sBtitle = new Scanner(System.in).nextLine();
        if (!sBtitle.equals(" ")) truuOption += 1;
        arrayData[1] = sBtitle;
        System.out.println("введите жанр книги" + " если жанр не известен оставьте пробел' '\n");
        String sBgenre = new Scanner(System.in).nextLine();
        if (!sBgenre.equals(" ")) truuOption += 1;
        arrayData[2] = sBgenre;
        System.out.println("введите выбранную полку" + " если полка не известна оставьте пробел' '\n");
        String sBnumberTable = new Scanner(System.in).nextLine();
        if (!sBnumberTable.equals(" ")) truuOption += 1;
        arrayData[3] = sBnumberTable;

        String testPolygon = new String();
        File fileA = new File(fileWay);
        Scanner scanner = null;
        try {
            scanner = new Scanner(fileA);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            testPolygon += scanner.nextLine() + "\n";
        }

        scanner.close();
        String[] numLines = testPolygon.split("\n");
        for (int i = 0; i < numLines.length; i++) {
            Integer timeEquals = 0;
            String[] timeNumLines = numLines[i].split(";;;");

            for (int b = 0; b < timeNumLines.length; b++) {
                if (timeNumLines[b].equals(arrayData[b])) timeEquals += 1;
                if ((b == 3) && (timeEquals.equals(truuOption))) {
                    howMuchNum += i + ",";
                }
            }


        }

        System.out.print(howMuchNum);
    }

    public String returning = howMuchNum;


}

class ReadListOfBook {
    String startdiplayInfo;

    ReadListOfBook(String startdiplay) throws FileNotFoundException {
        String fileSeparator = File.separator;
        String fileWay = "C:" + fileSeparator + "IdeaProjects" + fileSeparator + "first project" + fileSeparator + "library.txt";
        File file = new File(fileWay);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            System.out.print(scanner.nextLine());
            System.out.print("\n");
        }
        scanner.close();
    }

    void bookInfo() {
        System.out.print(startdiplayInfo);
    }


}

class AddBook {
    AddBook(String startABDisplay) throws IOException {
        String fileSeparator = File.separator;
        String fileWay = "C:" + fileSeparator + "IdeaProjects" + fileSeparator + "first project" + fileSeparator + "library.txt";

        System.out.println("введите имя автора\n");
        String ABname = new Scanner(System.in).nextLine();

        System.out.println("введите название книги\n");
        String ABtitle = new Scanner(System.in).nextLine();

        System.out.println("введите жанр книги\n");
        String ABgenre = new Scanner(System.in).nextLine();

        System.out.println("введите выбранную полку\n");
        String ABnumberTable = new Scanner(System.in).nextLine();

        String timeName = ABname + ";;;" + ABtitle + ";;;" + ABnumberTable + ";;;" + ABgenre;

        Writer output;
        output = new BufferedWriter(new FileWriter(fileWay, true));
        output.append("\n").append(timeName);
        output.close();
    }
}

class ScanScanBook {
    String asdFast;
    ScanListOfBook ssbFinally = new ScanListOfBook();


    public ScanScanBook(String startSSB) throws FileNotFoundException {
        int timeNum = 0;
        asdFast = ssbFinally.howMuchNum;


        String fileSeparator = File.separator;
        String fileWay = "C:" + fileSeparator + "IdeaProjects" + fileSeparator + "first project" + fileSeparator + "library.txt";

        String testPolygon = "";
        File fileB = new File(fileWay);
        Scanner scanner = new Scanner(fileB);
        while (scanner.hasNextLine()) {
            testPolygon += scanner.nextLine() + "\n";
            timeNum += 1;

        }
        scanner.close();
        String[] arrayNumber = asdFast.split(",");
        String[] finalScanScamBook = testPolygon.split("\n");
        System.out.print("\n");

        for (int i = 0; i < arrayNumber.length; i++) {
            for (int k = 0; k < finalScanScamBook.length; k++) {
                String timeK = Integer.toString(k);
                if (arrayNumber[i].equals(timeK)) {

                    System.out.print(finalScanScamBook[k] + "\n");
                }
            }
        }
    }
}

class DeleteBook {
    String asdFast;
    ScanListOfBook ssbFinally = new ScanListOfBook();


    public DeleteBook(String startSSB) throws IOException {
        String deleteLine = "";
        asdFast = ssbFinally.howMuchNum;
        int timeNum = 0;

        String fileSeparator = File.separator;
        String fileWay = "C:" + fileSeparator + "IdeaProjects" + fileSeparator + "first project" + fileSeparator + "library.txt";

        String testPolygon = "";
        File fileB = new File(fileWay);
        Scanner scanner = new Scanner(fileB);
        while (scanner.hasNextLine()) {
            testPolygon += scanner.nextLine() + "\n";
            timeNum += 1;

        }
        scanner.close();
        String[] arrayNumber = asdFast.split(",");
        String[] finalScanScamBook = testPolygon.split("\n");
        System.out.print(Arrays.toString(finalScanScamBook) + "array word");
        System.out.print(Arrays.toString(arrayNumber) + "array number\n");

        for (int i = 0; i < arrayNumber.length; i++) {
            for (int k = 0; k < finalScanScamBook.length; k++) {
                String timeK = Integer.toString(k);
                if (arrayNumber[i].equals(timeK)) {

                    System.out.print(finalScanScamBook[k] + "\n");
                }
            }
        }

        for (int timeCB = 1; timeCB < 10; timeCB++) {
            System.out.print("напишите нужный номер по результатам поиска\n ");
            Scanner inINCCB = new Scanner(System.in);
            String addComandInMain = inINCCB.nextLine();
            int timeNUMBER = 0;

            try {
                timeNUMBER = new Integer(addComandInMain);
                System.out.println(timeNUMBER);
            } catch (NumberFormatException e) {
                System.err.println("Неправильный формат строки!");
            }

            String testPoly = "";
            int timeDelete = 0;
            File fileC = new File(fileWay);
            Scanner scann = new Scanner(fileB);


            while (scann.hasNext()) {

                if (timeDelete == timeNUMBER) {
                    deleteLine += scann.nextLine();
                } else {
                    testPoly += scann.nextLine() + "\n";
                }
                timeDelete += 1;
            }

            File doomedFile = new File(fileWay, "library.txt");
            doomedFile.delete();

            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(fileWay)))) {
                writer.write(testPoly);
                writer.close();
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            scanner.close();


        }

    }
}


class FailWAY {

}











