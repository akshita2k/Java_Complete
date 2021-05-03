package com.company;
import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /*int b=0;
        do {
            System.out.println(b);
            b++;
        } while (b<5);*/
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int i =0;
        do {
            System.out.println(i);
            i++;
        } while (i<a);
    }
}
