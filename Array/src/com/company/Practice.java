package com.company;
import java.util.Scanner;

public class Practice {
    public static String result(int n, int m, int a[][]) {
        int count =0;
        int sum1=0;
        int sum2=0;
        if(n%2!=0) {
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    sum1 = sum1+ a[i][j];
                    sum2 = sum2 + a[(n-1)-i][j];
                }
                if(sum1==sum2) {
                    count = count+1;
                }
            }
        }
        else {
            int row = n;
            for (int i = 0; i < n; i++) {
                while (n != (row / 2) + 1) {
                    for (int j = 0; j < m; j++) {
                        sum1 = sum1 + a[i][j];
                        sum2 = sum2 + a[(n - 1) - i][j];
                    }
                    if (sum1 == sum2) {
                        count = count+1;
                    }
                }
            }
        }

        String result;
        if (count != n/2) {
            result = "YES";
        }
        else {
            result ="NO";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]a = new int [n][m];
            for (int k=0; k<n; k++) {
                for (int l=0; l<n; l++) {
                    a[k][l] = sc.nextInt();
                }
            }
            System.out.println(result(n,m,a));
        }
    }
}
