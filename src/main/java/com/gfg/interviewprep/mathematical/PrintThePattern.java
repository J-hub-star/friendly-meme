package com.gfg.interviewprep.mathematical;

public class PrintThePattern
{

    private void patternHelper(int n,int printable_number)
    {
        for(int i = printable_number;i>0;i--)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(i);
            }

        }
        System.out.println();
    }

    public void patternGenerator(int n)
    {
        int numberMax = n;
        while(n != 0)
        {
            patternHelper(n,numberMax);
            n--;
        }

    }

    public static void main(String[] args) {
        PrintThePattern ptp = new PrintThePattern();
        ptp.patternGenerator(3);
    }
}
