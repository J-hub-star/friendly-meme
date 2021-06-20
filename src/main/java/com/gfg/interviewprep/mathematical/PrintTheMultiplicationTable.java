package com.gfg.interviewprep.mathematical;

public class PrintTheMultiplicationTable
{
    public void printTheTable(int n)
    {
        for(int i = 1; i <=10;i++)
        {
            System.out.println(n*i);
        }
    }

    public static void main(String[] args) {
        PrintTheMultiplicationTable t = new PrintTheMultiplicationTable();
        t.printTheTable(9);
    }
}
