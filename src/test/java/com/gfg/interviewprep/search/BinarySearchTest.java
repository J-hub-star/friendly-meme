package com.gfg.interviewprep.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    BinarySearch bs;

    @BeforeEach
    void setUp() {
        bs = new BinarySearch();
    }

    @Test
    void search() {
        int arr[] = { 2, 3, 4, 10, 40 };
        assertAll("Binary Search",()->assertEquals(4,bs.search(arr,40)));
    }
}