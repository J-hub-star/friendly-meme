package com.gfg.interviewprep.sorting;

import java.util.ArrayList;
import java.util.List;

public class BinaryArray
{
    public void sort(int[] A, int N)
    {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0;i <A.length;i++)
        {
            if( A[i] != 0 && A[i] != 1){throw new RuntimeException();}
            if(A[i] == 0){arr.add(A[i]);}
        }
        while(A.length != arr.size()){arr.add(1);}

        System.out.println(arr.toString());

    }

    public static void main(String[] args) {
        BinaryArray ba = new BinaryArray();
        int[] A = {1,0,0,1,0,11};
        int N = A.length;
        ba.sort(A,N);

    }
}
