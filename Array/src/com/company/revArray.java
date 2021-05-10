package com.company;
import java.util.Scanner;


public class revArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] a = new int [10];
        System.out.println("Input the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the values in the array:");
        for (int i=0; i<n; i++) {
                a[i]= sc.nextInt();
        }
        System.out.print("Your array is: ");
        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("The reversed array is: ");
        for (int i=n; i>0; i-- ) {
            System.out.print(a[i] + " ");
        }
    }
}
