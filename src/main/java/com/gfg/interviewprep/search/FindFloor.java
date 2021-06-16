package com.gfg.interviewprep.search;

public class FindFloor
{
    public int findFloor(int[] arr, int x)
    {
        int n = arr.length;
        // If last element is smaller than x
        if (x >= arr[n - 1])
            return n - 1;

        // If first element is greater than x
        if (x < arr[0])
            return -1;

        // Linearly search for the first element
        // greater than x
        for (int i = 1; i < n; i++)
            if (arr[i] > x)
                return (i - 1);

        return -1;
    }

}
