package com.gfg.interviewprep.mathematical;

public class ArithmeticProgression
{
    public void getTheNthTerm(int a1,int a2, int n)
    {
        int diff = a2-a1;
        int termPointer = 2;
        while(termPointer != n)
        {
            a2 = a2+diff;
            System.out.println(a2);
            termPointer++;
        }

    }

    public static void main(String[] args) {
        ArithmeticProgression ap = new ArithmeticProgression();
        ap.getTheNthTerm(2,3,4);
    }
}
