package com.gfg.interviewprep.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintPattern
{
    public void pattern(int n)
    {

        // Base case (When n becomes 0 or
        // negative)
        if (n == 0 || n < 0) {

            System.out.print(n + " ");

            return;
        }

        // First print decreasing order
        System.out.print(n + " ");

        pattern(n - 5);

        // Then print increasing order
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        PrintPattern pp = new PrintPattern();
        int n = 16;
        pp.pattern(n);
    }
}
