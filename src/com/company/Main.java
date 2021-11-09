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
        Book testReplacedBook = new Book("this", "is", "new", "BOOOOOOOOOOOOOOOOK");
        b1.ReplaceShelf("this is new Shelf  ");
        b7.ReplaceBook(testReplacedBook);

        bolvanchik.AddBook(b1);
        bolvanchik.AddBook(b2);
        bolvanchik.AddBook(b3);
        bolvanchik.AddBook(b4);
        bolvanchik.AddBook(b5);
        bolvanchik.AddBook(b6);
        bolvanchik.AddBook(b7);

        bolvanchik.AddBook(testReplaced);
        bolvanchik.ReaBook(bolvanchik);

        bolvanchik.DelBook(testReplaced);

        bolvanchik.ReaBook(bolvanchik);
        bolvanchik.ScnBook(testScan);
        bolvanchik.ReaBook(bolvanchik);
        Library testScanAllBook = bolvanchik.ScnBook(testScan);
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

    public Library ScnBook(Book object) {                      // SCN
        Library result = new Library();
        for (int i = 0; i < this.lib.size(); i++) {
            if (this.lib.get(i).equals(object)) {
                result.lib.add(this.lib.get(i));
            }
        }
        return result;
    }


    public void DelBook(Book object) {              // DEL fin
        int time = 0;
        for (int i = 0; i < this.lib.size(); i++) {
            if (time == 1) break;
            if (this.lib.get(i).equals(object)) {
                this.lib.remove(this.lib.get(i));
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
        }
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
        return super.equals(obj);
    }

    public Book(String name, String author, String genre, String kode) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.kode = kode;
    }

    public void ReplaceShelf(String replaceKodeStr) {
        this.kode = replaceKodeStr;
    }

    public void ReplaceBook(Book book) {
        this.name = book.name;
        this.author = book.author;
        this.genre = book.genre;
        this.kode = book.kode;
    }
}
