package com.gfg.interviewprep.mathematical;

public class ClosestNumber
{
    public int ClosestInt(int N, int M)
    {
        int q = N/M;

        int n1 = N*q;

        int n2 = (N * M) > 0 ? (M * (q + 1)) : (M * (q - 1));

        if (Math.abs(N - n1) < Math.abs(N - n2))
            return n1;

        // else n2 is the required closest number
        return n2;
    }
}
