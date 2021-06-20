package com.gfg.interviewprep.sorting;

public class ArraySorted
{
    public boolean checkIfSorted(int[] arr, int N)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if( N-1 >= i+1)
            {
                if(arr[i] > arr[i+1]){return false;}
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2 ,2, 2, 2, 2};
        ArraySorted as = new ArraySorted();
        int N = arr.length;
        System.out.println(as.checkIfSorted(arr,N));
    }
}
