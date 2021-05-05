package com.company;
import java.util.Scanner;


public class mulTableRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (int i=10; i>0; i--) {
            System.out.printf("%d * %d = %d", n, i, (n*i));
            System.out.println();
        }
    }
}
