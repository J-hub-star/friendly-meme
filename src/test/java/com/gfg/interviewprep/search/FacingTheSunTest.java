package com.gfg.interviewprep.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacingTheSunTest {

    FacingTheSun f;

    @BeforeEach
    void setUp() {
        f = new FacingTheSun();
    }

    @Test
    void facingTheSunB() {
        int[] h = {7, 4, 8, 2, 9};
        int [] g = {2, 3, 4, 5};
        assertAll("Facing The Sun",
                ()->assertEquals(3,f.facingTheSunB(h)),
                ()->assertEquals(4,f.facingTheSunB(g)));
    }
}