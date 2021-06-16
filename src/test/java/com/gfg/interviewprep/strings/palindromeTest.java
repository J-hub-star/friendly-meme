package com.gfg.interviewprep.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class palindromeTest {

    palindrome pa;
    @BeforeEach
    void setUp()
    {
        pa = new palindrome();
    }

    @Test
    void checkPalindrome() throws Exception
    {
        String s = "geeks";
        assertAll("palindrome",() -> assertEquals(false,pa.checkPalindrome(s)));
    }
}