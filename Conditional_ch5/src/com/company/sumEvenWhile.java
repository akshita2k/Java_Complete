package com.company;
import java.util.Scanner;


public class sumEvenWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Number:");
        int num = sc.nextInt();
        int sum =0;
        int i=0;
        while (i<num-1) {
            sum = sum + (2*num);
            i++;
        }
        System.out.println(sum);
    }
}
