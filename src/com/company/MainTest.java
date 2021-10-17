package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void AddBookTest() {
        Book a1 = new Book("aa", "bb", "cc", "dd");
        Book a3 = new Book("aa", "bb", "cc", "dd");
        Library libTestOne = new Library();
        Library libTestTwo = new Library();
        libTestOne.AddBook(a1);
        libTestTwo.AddBook(a3);

        Assert.assertEquals(libTestTwo.lib.get(0).name,libTestOne.lib.get(0).name);
        Assert.assertEquals(libTestTwo.lib.get(0).author,libTestOne.lib.get(0).author);
        Assert.assertEquals(libTestTwo.lib.get(0).genre,libTestOne.lib.get(0).genre);
        Assert.assertEquals(libTestTwo.lib.get(0).kode,libTestOne.lib.get(0).kode);
    }
    @Test
    public void DelBookTest() {
        Book a1 = new Book("aa", "cc", "cc", "dd");
        Book a2 = new Book("aa", "bb", "cc", "dd");
        Book a3 = new Book("aa", "cc", "cc", "dd");
        Library libTestOne = new Library();
        libTestOne.AddBook(a1);
        libTestOne.AddBook(a2);
        libTestOne.DelBook(libTestOne, a1);
        Library libTestTwo = new Library();
        libTestTwo.AddBook(a2);

        Assert.assertEquals(libTestTwo.lib.get(0).name,libTestOne.lib.get(0).name);
        Assert.assertEquals(libTestTwo.lib.get(0).author,libTestOne.lib.get(0).author);
        Assert.assertEquals(libTestTwo.lib.get(0).genre,libTestOne.lib.get(0).genre);
        Assert.assertEquals(libTestTwo.lib.get(0).kode,libTestOne.lib.get(0).kode);
    }
    @Test
    public void scnBookTest() {
        Book b1 = new Book("aa", "bb", "cc", "dd");
        Book b2 = new Book("bb", "bb", "cc", "dd");
        Book b3 = new Book("aa", "bb", "cc", "dd");
        Book b4 = new Book("bb", "bb", "cc", "kk");
        Book b5 = new Book("dd", "dd", "dd", "dd");
        Book b6 = new Book("bb", "bb", "bb", "bb");
        Book b7 = new Book(" ", " ", " ", " ");
        Book btest = new Book("bb", "bb", "cc", "kk");

        Library libTestOne = new Library();
        Library testingPolygon = new Library();
        testingPolygon.AddBook(btest);
        libTestOne.AddBook(b1);
        libTestOne.AddBook(b2);
        libTestOne.AddBook(b3);
        libTestOne.AddBook(b4);
        libTestOne.AddBook(b5);
        libTestOne.AddBook(b6);
        libTestOne.AddBook(b7);
        libTestOne = libTestOne.ScnBook(btest, libTestOne);
        Library libTestTwo = new Library();
        libTestTwo.AddBook(btest);

        Assert.assertEquals(libTestTwo.lib.get(0).name,libTestOne.lib.get(0).name);
        Assert.assertEquals(libTestTwo.lib.get(0).author,libTestOne.lib.get(0).author);
        Assert.assertEquals(libTestTwo.lib.get(0).genre,libTestOne.lib.get(0).genre);
        Assert.assertEquals(libTestTwo.lib.get(0).kode,libTestOne.lib.get(0).kode);
    }


}