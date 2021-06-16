package com.gfg.interviewprep.search;

public class Concurrence
{
    public int concurrent(int[] arr,int x)
    {
        int result = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == x){result++;}
        }
        return result;
    }
}
