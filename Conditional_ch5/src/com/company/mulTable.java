package com.company;
import java.util.Scanner;


public class mulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Enter the number whose multiplication table is to be generated:");
        n = sc.nextInt();
        for (int i =1; i<=10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
