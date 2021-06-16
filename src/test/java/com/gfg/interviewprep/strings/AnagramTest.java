package com.gfg.interviewprep.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram a ;
    @BeforeEach
    void setUp()
    {
        a = new Anagram();
    }

    @Test
    void isAnagram()
    {
        String s = "geeks";
        String f = "skgj";
        assertAll("Anagram",()-> assertEquals(false,a.isAnagram(s,f)));
    }
}