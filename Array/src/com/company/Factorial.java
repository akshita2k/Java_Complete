package com.company;
import java.util.*;

public class Factorial {
    static int  factorial(int n) {
        int fact;
        // This can be done in two ways
        // 1. Iterative
        // 2. Recursion
        /* fact = 1;
        if (n==0||n==1) {
            return 1;
        }
        else {
            prod=1;
            for (int i=1; i<=n; i++) {
                prod *= i;
        }
        return fact */

        if (n==0 || n==1) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        System.out.println(factorial(fact));
    }
}
