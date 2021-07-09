package com.gfg.interviewprep.mathematical;

import java.util.LinkedList;
import java.util.Queue;

public class JumpingNumbers
{
    public int jumpingNumberCheck(long x)
    {

        return 0;
    }

    public void isJumpingNumber(long x, int num) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(num);

        // Do BFS starting from i
        while (!q.isEmpty()) {
            num = q.peek();
            q.poll();
            if (num <= x) {
                System.out.print(num + " ");
                int last_digit = num % 10;

                // If last digit is 0, append next digit only
                if (last_digit == 0) {
                    q.add((num * 10) + (last_digit + 1));
                }

                // If last digit is 9, append previous digit only
                else if (last_digit == 9) {
                    q.add((num * 10) + (last_digit - 1));
                }

                // If last digit is neighter 0 nor 9, append both
                // previous and next digits
                else {
                    q.add((num * 10) + (last_digit - 1));
                    q.add((num * 10) + (last_digit + 1));
                }
            }
        }
    }


    public static void main(String[] args) {
        JumpingNumbers jn = new JumpingNumbers();
        //System.out.println(jn.isJumpingNumber(4343456));
    }
}
