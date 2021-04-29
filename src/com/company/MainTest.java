package com.company;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testAdd() {
        assertEquals("a;;;b;;;c;;;d\nk;;;l;;;m;;;d\nd;;;u;;;b;;;m\nz;;;o;;;p;;;p\na;;;w;;;m;;;d\na;;;a;;;a;;;a",
                Main.getProblem("Add",
                        "a;;;b;;;c;;;d\nk;;;l;;;m;;;d\nd;;;u;;;b;;;m\nz;;;o;;;p;;;p\na;;;w;;;m;;;d",
                        "a;;;a;;;a;;;a",""));
    }
    @Test
    public void testRea() {
        assertEquals("a;;;b;;;c;;;d\nk;;;l;;;m;;;d\nd;;;u;;;b;;;m\nz;;;o;;;p;;;p\na;;;w;;;m;;;d",
                Main.getProblem("Rea",
                        "a;;;b;;;c;;;d\nk;;;l;;;m;;;d\nd;;;u;;;b;;;m\nz;;;o;;;p;;;p\na;;;w;;;m;;;d",
                        "a;;;a;;;a;;;a",""));
    }
    @Test
    public void testChg() {
        assertEquals("a;;;a;;;a;;;a\nk;;;l;;;m;;;d\nd;;;u;;;b;;;m\nz;;;o;;;p;;;p\na;;;w;;;m;;;d",
                Main.getProblem("Chg",
                        "a;;;b;;;c;;;d\nk;;;l;;;m;;;d\nd;;;u;;;b;;;m\nz;;;o;;;p;;;p\na;;;w;;;m;;;d",
                        "a;;;b;;;c;;;d",
                        "a;;;a;;;a;;;a"));
    }
    @Test
    public void testDel() {
        assertEquals("a;;;b;;;c;;;d\nd;;;u;;;b;;;m\nz;;;o;;;p;;;p\na;;;w;;;m;;;d",
                Main.getProblem("Del",
                        "a;;;b;;;c;;;d\nk;;;l;;;m;;;d\nd;;;u;;;b;;;m\nz;;;o;;;p;;;p\na;;;w;;;m;;;d",
                        "k;;;l;;;m;;;d",
                        ""));
    }



    @Test
    public void testScn()   {
        assertEquals("k;;;l;;;m;;;d\nk;;;l;;;m;;;d",
            Main.getProblem("Scn",
                    "a;;;b;;;c;;;d\nk;;;l;;;m;;;d\nd;;;u;;;b;;;m\nz;;;o;;;p;;;p\na;;;w;;;m;;;d\nk;;;l;;;m;;;d",
                    "k;;;l;;;m;;;d",""));
}




}
