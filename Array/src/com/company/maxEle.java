package com.company;
import java.util.Scanner;

public class maxEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int [] a = new int [100];
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
    }
}
