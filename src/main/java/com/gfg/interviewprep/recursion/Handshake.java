package com.gfg.interviewprep.recursion;

public class Handshake
{
    public static int handshakeN(int N)
    {
        return (N * (N - 1)) / 2;
    }


    public static void main(String[] args) {
        Handshake h = new Handshake();
        System.out.println(handshakeN(4));
    }
}
