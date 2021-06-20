package com.gfg.interviewprep.mathematical;

public class KthDigit {

    public void kThDigit(int a,int b,int k)
    {
        int number = (int)Math.pow(a,b);
        int count = 0;
        int result = 0;
        while(count < k)
        {
            result = number%10;
            number /=10;
            count ++;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        KthDigit kd = new KthDigit();
        kd.kThDigit(3,3,1);
    }
}
