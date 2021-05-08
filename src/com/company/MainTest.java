package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testAdd() {
        assertEquals("nameK titlK genrK shelK\n" +
                        "nameA titlA genrA shelA\n" +
                        "nameB titlB genrB shelB\n" +
                        "nameC titlC genrC shelC\n" +
                        "nameD titlD genrD shelD\n" +
                        "nameE titlE genrE shelE\n" +
                        "nameA titlA genrA shelV\n" +
                        "nameH titlH genrH shelH",
                Main.getProblem("Add",
                        "nameK titlK genrK shelK", ""));
    }

    @Test
    public void testRea() {
        assertEquals("nameA titlA genrA shelA\n" +
                        "nameB titlB genrB shelB\n" +
                        "nameC titlC genrC shelC\n" +
                        "nameD titlD genrD shelD\n" +
                        "nameE titlE genrE shelE\n" +
                        "nameA titlA genrA shelV\n" +
                        "nameH titlH genrH shelH",
                Main.getProblem("Rea",
                        "",
                        ""));
    }

    @Test
    public void testChg() {
        assertEquals(
                "nameA titlA genrA shelA\n" +
                        "nameB titlB genrB shelB\n" +
                        "nameC titlC genrC shelC\n" +
                        "nameD titlD genrD shelD\n" +
                        "nameE titlE genrE shelE\n" +
                        "nameA titlA genrA shelA\n" +   // nameA titlA genrA shelV
                        "nameH titlH genrH shelH",
                Main.getProblem("Chg",
                        "nameA;;;titlA;;;genrA;;;shelV",
                        "nameA titlA genrA shelA"));
        assertEquals(
                "nameMONEY titlMONEY genrMONEY shelMONEY\n" +   // nameA titlA genrA shelA
                        "nameB titlB genrB shelB\n" +
                        "nameC titlC genrC shelC\n" +
                        "nameD titlD genrD shelD\n" +
                        "nameE titlE genrE shelE\n" +
                        "nameA titlA genrA shelV\n" +
                        "nameH titlH genrH shelH",
                Main.getProblem("Chg",
                        "nameA;;;titlA;;;genrA;;;shelA",
                        "nameMONEY titlMONEY genrMONEY shelMONEY"));
        assertEquals(
                "nameA titlA genrA shelA\n" +
                        "nameB titlB genrB shelB\n" +
                        "nameC titlC genrC shelC\n" +
                        "nameD titlD genrD shelD\n" +
                        "nameE titlE genrE shelE\n" +
                        "nameA titlA genrA shelV\n" +
                        "nameA titlA genrA shelA",      // nameH titlH genrH shelH
                Main.getProblem("Chg",
                        "nameH;;;titlH;;;genrH;;;shelH",
                        "nameA titlA genrA shelA"));
    }


    @Test
    public void testDel() {
        assertEquals(
                "nameA titlA genrA shelA\n" +
                        "nameB titlB genrB shelB\n" +
                        "nameC titlC genrC shelC\n" +
                        "nameD titlD genrD shelD\n" +
                        "nameE titlE genrE shelE\n" +
                          // nameA titlA genrA shelV
                        "nameH titlH genrH shelH",
                Main.getProblem("Del",
                        "nameA;;;titlA;;;genrA;;;shelV",
                        ""));
        assertEquals(
                        // nameA titlA genrA shelA
                "nameB titlB genrB shelB\n" +
                        "nameC titlC genrC shelC\n" +
                        "nameD titlD genrD shelD\n" +
                        "nameE titlE genrE shelE\n" +
                        "nameA titlA genrA shelV\n" +
                        "nameH titlH genrH shelH",
                Main.getProblem("Del",
                        "nameA;;;titlA;;;genrA;;;shelA",
                        ""));
            }


    @Test
    public void testScn() {{
        assertEquals(

                        "nameA titlA genrA shelV",
                Main.getProblem("Scn",
                        "nameA;;;titlA;;;genrA;;;shelV",
                        ""));
        assertEquals(
                "nameA titlA genrA shelA\n" +
                        "nameA titlA genrA shelV",
                Main.getProblem("Scn",
                        "nameA;;;titlA;;;genrA;;; ",        // 3/4 chapter
                        ""));
        assertEquals(
                "nameA titlA genrA shelA\n" +
                        "nameB titlB genrB shelB\n" +
                        "nameC titlC genrC shelC\n" +
                        "nameD titlD genrD shelD\n" +
                        "nameE titlE genrE shelE\n" +
                        "nameA titlA genrA shelV\n" +
                        "nameH titlH genrH shelH",
                Main.getProblem("Scn",
                        " ;;; ;;; ;;; ", // all book
                        ""));
    }


    }


}
