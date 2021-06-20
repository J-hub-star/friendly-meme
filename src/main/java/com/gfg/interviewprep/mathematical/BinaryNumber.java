package com.gfg.interviewprep.mathematical;

public class BinaryNumber
{
    public void convertBinaryToDecimal(int binary)
    {
        int count = 0;
        int decimal = 0;
        while(binary != 0)
        {
            int digit = binary%10;
            if(digit != 0)
            {
                decimal = (int) ((int) decimal + Math.pow(2,count));
            }
            count++;
            binary /= 10;

        }

        System.out.println(decimal);
    }

    public static void main(String[] args) {
        BinaryNumber bn = new BinaryNumber();
        bn.convertBinaryToDecimal(100100);
    }
}
