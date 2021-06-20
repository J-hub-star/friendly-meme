package com.gfg.interviewprep.sorting;

public class BubbleSort
{
    public void bubbleSort(int[] arr, int n)
    {
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int length = arr.length;
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr,length);
    }
}
