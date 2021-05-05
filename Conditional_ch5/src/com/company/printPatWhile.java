package com.company;
import java.util.Scanner;

public class printPatWhile {
    public static void main(String[] args) {
        int n =4;
        while(n>0) {
            for (int j=0; j<n; j++) {
                System.out.print("*");
            }
            n--;
            System.out.print("\n");
        }
    }
}
