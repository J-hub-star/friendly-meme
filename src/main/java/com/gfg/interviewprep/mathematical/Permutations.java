package com.gfg.interviewprep.mathematical;

public class Permutations
{
    private static int fact(int x)
    {
        if(x == 1 || x == 0){return 1;}
        else{return x * fact(x-1);}
    }

    public static void computeNPR(int n,int r)
    {
        int d = n-r;
        int num = fact(n);
        int den = fact(d);
        int result = num/den;
        System.out.println(result);

    }

    public static void main(String[] args) {
        computeNPR(3,3);
    }
}
