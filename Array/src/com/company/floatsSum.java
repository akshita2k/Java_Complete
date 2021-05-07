package com.company;
import java.util.Scanner;

public class floatsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float [] fl = new float [5];
        float sum =0.0f;
        System.out.println("Enter the 5 float nums:");
        for (int i =0; i<5; i++) {
            fl[i] = sc.nextFloat();
            sum = sum + fl[i];
        }
        System.out.println(sum);
    }
}
