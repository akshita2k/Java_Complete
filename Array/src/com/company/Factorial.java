package com.company;
import java.util.*;

public class Factorial {
    static int  factorial(int n) {
        int fact;
        // can be done in two ways
        // 1. For loop
        // 2. Recursion
        /* fact = 1;
        for (int i=1; i<=n; i++) {
            fact= fact*n;
        }
        return fact */

        if (n==0 || n==1) {
            return 1;
        }
        else {
            fact= n * factorial(n-1);
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        System.out.println(factorial(fact));
    }
}
