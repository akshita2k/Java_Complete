package com.company;
import java.util.Scanner;
public class sumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum =0;
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            sum = sum + (2*i);
        }
        System.out.println(sum);
    }
}
