package com.gfg.interviewprep.mathematical;

public class ReverseDigits {

    public void reverseDigits(int n)
    {
        int digits = 0;
        while(n != 0)
        {
            int digit = n%10;
            digits = (digits*10)+digit;
            n /= 10;
        }
        System.out.println(digits);
    }

    public static void main(String[] args) {
        ReverseDigits rd = new ReverseDigits();
        rd.reverseDigits(127);
    }
}
