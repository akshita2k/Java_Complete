package com.company;
import java.util.Scanner;

public class minEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=0;
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int [] a = new int [100];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (a[i] < a[j]) {
                    min = a[i];
                }
                else {
                    min = a[j];
                }
            }
        }
        System.out.println(min);
    }
}
