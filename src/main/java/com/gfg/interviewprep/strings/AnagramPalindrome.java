package com.gfg.interviewprep.strings;

public class AnagramPalindrome
{
    public boolean  isAnagramPalindrome(String a)
    {
        int[] count_char = new int[128];
        for(int i =0;i<a.length();i++)
        {
            count_char[a.charAt(i)]++;
        }
        int count =0;
        for(int i=0;i<a.length();i++)
        {
            count += count_char[i]%2;
        }

        System.out.println(count);
        return (count<=1);
    }
}
