package com.gfg.interviewprep.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    LinearSearch ls;

    @BeforeEach
    void setUp() {
        ls = new LinearSearch();

    }

    @Test
    void linearSearch() {
        int[] arr = {9, 7, 2, 16, 4};
        assertAll("Linear Search",() -> assertEquals(3,ls.linearSearch(arr,16)));
    }
}