package com.gfg.interviewprep.mathematical;

import java.util.ArrayList;
import java.util.List;

public class GeometricProgression
{
    public void getTheNthTerm(int a, int r,int N)
    {
        int element = a*(int)Math.pow(r,N-1);
        System.out.println(element);

    }

    public static void main(String[] args) {
        GeometricProgression gp = new GeometricProgression();
        gp.getTheNthTerm(2,2,4);
    }
}
