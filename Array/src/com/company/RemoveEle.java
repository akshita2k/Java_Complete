package com.company;

import java.util.Scanner;

public class RemoveEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        int val = sc.nextInt();
        int b[] = new int [n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int i=0;
        for (int j=0; j<a.length; j++) {
            if (a[j] != val) {
                a[i]= a[j];
                i++;
            }
        }

        for (int j=0; j<n; j++) {
            System.out.println(a[i]);
        }
    }
}
