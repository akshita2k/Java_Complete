package com.company;
import java.util.*;

public class Pattern {

    // method-1: Class
    static void pattern(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        pattern(n);
        // method-2
        /* for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        } */
    }
}
