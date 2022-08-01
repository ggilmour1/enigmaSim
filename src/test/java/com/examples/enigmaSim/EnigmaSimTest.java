package com.examples.enigmaSim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnigmaSimTest {

    @Test
    void inToPlugboard() {
    }

    @Test
    void outToPlugboard() {
    }

    @Test
    void inToRotor1_inputA_returnL() throws Exception {
        String chr = EnigmaSim.inToRotor1("A");
        assertEquals("L", chr);
    }

    @Test
    void inToRotor1_inputY_returnD() throws Exception {
        String chr = EnigmaSim.inToRotor1("Y");
        assertEquals("D", chr);
    }

    @Test
    void outFromRotor1_inputL_returnK() throws Exception {
        String chr = EnigmaSim.outFromRotor1("L");
        assertEquals("K", chr);
    }

    @Test
    void outFromRotor1_inputZ_returnW() throws Exception {
        String chr = EnigmaSim.outFromRotor1("Z");
        assertEquals("W", chr);
    }

    @Test
    void inToRotor2() {
    }

    @Test
    void outFromRotor2() {
    }

    @Test
    void inToRotor3() {
    }

    @Test
    void outFromRotor3() {
    }

    @Test
    void getReflectedChar_inputA_returnE() throws Exception {
        String chr = EnigmaSim.getReflectedChar("A");
        assertEquals("E", chr);
    }

    @Test
    void getReflectedChar_inputE_returnA() throws Exception {
        String chr = EnigmaSim.getReflectedChar("E");
        assertEquals("A", chr);
    }

    @Test
    void plugBoard_inputN_returnA() throws Exception {
        String chr = EnigmaSim.plugBoard("N");
        assertEquals("A", chr);
    }

    @Test
    void plugBoard_inputA_returnN() throws Exception {
        String chr = EnigmaSim.plugBoard("A");
        assertEquals("N", chr);
    }

    @Test
    void getIndex_inputA_returns0() throws Exception {
        int chr = EnigmaSim.getIndex("A");
        assertEquals(0, chr);
    }

    @Test
    void getIndex_inputD_returns3() throws Exception {
        int chr = EnigmaSim.getIndex("D");
        assertEquals(3, chr);
    }

    @Test
    void getIndex_inputJ_returns10() throws Exception {
        int chr = EnigmaSim.getIndex("J");
        assertEquals(9, chr);
    }

    @Test
    void getIndex_inputW_returns22() throws Exception {
        int chr = EnigmaSim.getIndex("W");
        assertEquals(22, chr);
    }
}