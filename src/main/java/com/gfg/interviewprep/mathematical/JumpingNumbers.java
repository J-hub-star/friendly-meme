package com.gfg.interviewprep.mathematical;

public class JumpingNumbers
{
    public boolean jumpingNumberCheck(int x)
    {

        return false;
    }

    public boolean isJumpingNumber(int x)
    {
        int digit = 0;
        boolean isFirst = true;
        while( x != 0)
        {
            if(isFirst == false)
            {
                int digit2 = x % 10;
                if(digit != digit2){return false;}
            }
            else if(isFirst == true){isFirst = false;}
            x /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        JumpingNumbers jn = new JumpingNumbers();
        System.out.println(jn.isJumpingNumber(10));
    }
}
