package org.itstep.test;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void check1True() {
        boolean b = Pattern.matches(".", "a");
        assertTrue(b);
    }
    @Test
    void check1False(){
        boolean b = Pattern.matches(".", "bz");
        assertFalse(b);
    }
}