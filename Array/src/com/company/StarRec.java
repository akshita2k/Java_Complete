package com.company;
import java.util.*;

public class StarRec {
    static void pattern (int n) {
        if (n>0) {
            pattern(n-1);
            for (int i=0; i<n; i++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
