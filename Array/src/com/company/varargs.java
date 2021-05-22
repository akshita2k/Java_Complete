package com.company;

public class varargs {
    /*static int sum(int a, int b) {
        return (a+b);
    }
    static int sum(int a, int b, int c) {
        return (a+b+c);
    }*/
    static int sum(int ...arr) {
        int res =0;
        for (int a: arr) {
            res += a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varAgrs tutorial");
        //System.out.println(sum(4,5));
        System.out.println(sum(4,5,6));
    }
}
