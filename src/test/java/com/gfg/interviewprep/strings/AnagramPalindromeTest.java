package com.gfg.interviewprep.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramPalindromeTest {

    AnagramPalindrome a;
    @BeforeEach
    void setUp()
    {
        a = new AnagramPalindrome();
    }

    @Test
    void isAnagramPalindrome() throws Exception
    {
        String s = "geeksogeeksde";
        assertAll("Anagram Plaindrome" , () -> assertEquals(true,a.isAnagramPalindrome(s)));
    }
}