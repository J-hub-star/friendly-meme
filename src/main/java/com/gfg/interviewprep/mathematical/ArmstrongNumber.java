package com.gfg.interviewprep.mathematical;

public class ArmstrongNumber
{
    public void isArmstrongNumber(int n)
    {
        int i = n;
        int cubes = 0;
        while(i != 0)
        {
            int j = i%10;
            i /= 10;
            //System.out.println(j);
            cubes = cubes + (j*j*j);
        }
        if(cubes  == n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber an = new ArmstrongNumber();
        an.isArmstrongNumber(173);
    }
}
