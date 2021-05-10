package com.company;
import java.util.Scanner;

public class sortArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int bool =0;
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] a = new int[100];
        System.out.println("Enter the elements of the array:");
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if(a[i] < a[j]) {
                    bool = 0;
                }
                else {
                    bool =1;
                }
            }
        }
        if (bool == 0) {
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not sorted");
        }
    }
}
