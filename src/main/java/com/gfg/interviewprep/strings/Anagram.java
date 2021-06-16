package com.gfg.interviewprep.strings;

import java.util.HashMap;
import java.util.HashSet;

public class Anagram
{
    public boolean isAnagram(String a,String b)
    {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i <a.length();i++)
        {
            try{
                set.add(a.charAt(i));

            }catch(RuntimeException e)
            {
                System.out.println(e.getMessage());
            }
        }
        for(int j = 0; j < b.length();j++)
        {
            if(!set.contains(b.charAt(j))){return false;};
        }

        return true;
    }
}
