package com.gfg.interviewprep.search;

public class FacingTheSun
{
    public int facingTheSunB(int[] arr)
    {
        int result = 1;
        for(int i = 0; i<arr.length;i++)
        {
            try{
            if( arr[i+1] >= arr[i]){result++;}}catch (RuntimeException e){}
        }
        return result;
    }
}
