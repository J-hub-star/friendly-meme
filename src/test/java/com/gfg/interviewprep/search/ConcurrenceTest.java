package com.gfg.interviewprep.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcurrenceTest {
    Concurrence c;

    @BeforeEach
    void setUp() {
        c = new Concurrence();
    }

    @Test
    void concurrent() {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        assertAll("Con",()->assertEquals(4,c.concurrent(arr,2)));
    }
}