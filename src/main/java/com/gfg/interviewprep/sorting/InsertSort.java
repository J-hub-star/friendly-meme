package com.gfg.interviewprep.sorting;

public class InsertSort
{
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int i: arr)
        {
            System.out.println(i);

        }

    }

    public static void main(String[] args) {
        InsertSort is = new InsertSort();
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        is.sort(arr);
    }


}
