package com.company;
import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        /*for (int i=0; i<10; i++) {
            System.out.println(i);
        }*/
        System.out.print("Enter the number: ");
        int a= sc.nextInt();
        for (int i =0; i<=a; i++) {
            System.out.print((2*i)+1);
        }
        for (int i =a; i>=0; i--) {
            System.out.print((2*i)+1);
        }
    }
}
