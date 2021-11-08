package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Book b1 = new Book("aa", "bb", "cc", "dd");
        Book b2 = new Book("bb", "bb", "cc", "dd");
        Book b3 = new Book("aa", "bb", "cc", "dd");
        Book b4 = new Book("bb", "bb", "cc", "kk");
        Book b5 = new Book("dd", "dd", "dd", "dd");
        Book b6 = new Book("bb", "bb", "bb", "bb");
        Book b7 = new Book(" ", " ", " ", " ");
        Book testReplaced = new Book("test", "test", "test", "test");
        Book testScan = new Book("aa", "bb", "cc", null);
        Library bolvanchik = new Library();
        String testReplaceKode = "new's kode ";

        b1.ReplaceKode(testReplaceKode,"this is new Shelf  ");
        b7.ReplaceBook();

        bolvanchik.AddBook(b1);
        bolvanchik.AddBook(b2);
        bolvanchik.AddBook(b3);
        bolvanchik.AddBook(b4);
        bolvanchik.AddBook(b5);
        bolvanchik.AddBook(b6);
        bolvanchik.AddBook(b7);

        bolvanchik.AddBook(testReplaced);
        bolvanchik.ReaBook(bolvanchik);

        bolvanchik.DelBook(bolvanchik, testReplaced);

        bolvanchik.ReaBook(bolvanchik);
        bolvanchik.ScnBook(testScan, bolvanchik);
        bolvanchik.ReaBook(bolvanchik);

        Library testScanAllBook = bolvanchik.ScnBook(testScan, bolvanchik);
        testScanAllBook.ReaBook(testScanAllBook);


    }
}


class Library {
    ArrayList<Book> lib;

    public Library() {
        this.lib = new ArrayList<>();
    }

    public void AddBook(Book addBook) {                                             // ADD fin
        this.lib.add(addBook);
    }

    public Library ScnBook(Book object, Library libScnBook) {                      // SCN
        Library result = new Library();
        for (int i = 0; i < libScnBook.lib.size(); i++) {
            if (libScnBook.lib.get(i).equals(object)) {
                result.lib.add(libScnBook.lib.get(i));
            }
        }
        return result;
    }

    public void DelBook(Library delBookInLib, Book object) {              // DEL fin
        int time = 0;
        for (int i = 0; i < delBookInLib.lib.size(); i++) {
            if (time == 1) break;
            if (delBookInLib.lib.get(i).equals(object)) {

                delBookInLib.lib.remove(delBookInLib.lib.get(i));
                time++;

            }
        }
    }

    public void ReaBook(Library rbBook) {                           //REA fin
        for (int i = 0; i < rbBook.lib.size(); i++) {
            System.out.print(rbBook.lib.get(i).name + " ");
            System.out.print(rbBook.lib.get(i).author + " ");
            System.out.print(rbBook.lib.get(i).genre + " ");
            System.out.print(rbBook.lib.get(i).kode + "\n");
            rbBook.lib.get(i).toString();
        }
    }
    public void NewShlfBook(Library rbBook) {                           //Shelf  fin

    }

}

class Book {
    String name;
    String author;
    String genre;
    String kode;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            if (this.name == ((Book) obj).name) {
                if ((((this.author == ((Book) obj).author)) || ((Book) obj).author == null)) {
                    if ((((this.genre == ((Book) obj).genre)) || ((Book) obj).genre == null)) {
                        if ((((this.kode == ((Book) obj).kode)) || ((Book) obj).kode == null)) {
                            System.out.print("nice try \n");
                            return true;
                        }
                    }
                }
            }
        }
    //    System.out.print("bad try \n");
        return super.equals(obj);
    }
    public Book(String name, String author, String genre, String kode) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.kode = kode;
    }

    public void ReplaceKode(String testRB,String replaceKodeStr ) {
        Scanner in = new Scanner(System.in);
        System.out.print("new shelf for this book");
        String scan = in.nextLine();
        kode = scan;
    }

    public void ReplaceBook() {
        name = "This";
        author = "IS";
        genre = "new";
        kode = "BOOOOOOOOOOOOOOOOK";
    }
}

             /*
              if (delBookInLib.lib.get(i).name.equals(object.name)) {
                if (delBookInLib.lib.get(i).author.equals(object.author)) {
                    if (delBookInLib.lib.get(i).genre.equals(object.genre)) {
                        if (delBookInLib.lib.get(i).kode.equals(object.kode)) {
                            result.lib.remove(delBookInLib.lib.get(i));
                            time ++;
                        }
                    }
                }
            }

                if ((libScnBook.lib.get(i).name.equals(object.name)) || (object.name == null)) {
                if ((libScnBook.lib.get(i).author.equals(object.author)) || (object.author == null)) {
                    if ((libScnBook.lib.get(i).genre.equals(object.genre)) || (object.genre == null)) {
                        if ((libScnBook.lib.get(i).kode.equals(object.kode)) || (object.kode == null)) {
                            result.lib.add(libScnBook.lib.get(i));

                        }
                    }
                }
            }




class Min{
    public static void main(String[] args){
        Tovar cheese = new Tovar(100, "cheese");
        Tovar bread = new Tovar(20, "Bread");

        cheese.IzmenenieCeni();

        Sklad sklad = new Sklad();
        sklad.DobavitTovar (cheese, 10);
        sklad.DobavitTovar (bread, 20);

        Map<Tovar,Integer> cheeseAmount = sklad.TovarByTovarAndKolichestvo ("cheese");

        System.out.println(cheeseAmount.toString());

    }

}

class Tovar {
    int cena;
    String nazvanie;

    public Tovar(int nachlnayaCena, String nazvanie) {
        this.cena = nachlnayaCena;
        this.nazvanie = nazvanie;
    }

    public void IzmenenieCeni() {
        cena += 10;
    }
}

class Sclad {
    Map<Tovar, Integer> tovar;

    public void sklad() {
        this.tovar = new HashMap<>();
    }

    public void DobavitTovar(Tovar dobavitTovar, int kolichestvo) {
        tovar.put(dobavitTovar, kolichestvo);
    }

    public List<Tovar> findTovarByNazvanie(String nazvanie) {
        List<Tovar> result = new ArrayList<>();
        for (Map.Entry<Tovar, Integer> item : this.tovar) {
            if (item.getKey().nazvanie.equals(nazvanie)) {
                result.add(item.getKey());
            }
        }
        return result;
    }

    public Map<Tovar, Integer> TovarByTovarAndKolichestvo(String nazvanie) {
        Map<Tovar, Integer> result = new HashMap<>();
        for (Map.Entry<Tovar, Integer> item : this.tovar) {
            Tovar time = item.getKey();
            if ((time.nazvanie.equals(nazvanie)) {
                result.put(time, item.getValue());
            }

        }
        return result;
    }
}
    */