package com.company;

public class FindXinKwin {
    static int FindXinK (int n, int [] arr, int x, int k) {
        int i;
        int count =0;
        for (i=0; i<n; i=i+k) {
            for (int j =0; j<k; j++) {
                if((i+j)<n && arr[i+j] == k){
                    count++;
                    break;
                }
                if (j==k) {
                    return 0;
                }
                if (i+j>=n) {
                    return 0;
                }
            }
        }
        if (i>=n) {
            return 0;
        }
        else {
            return count;
        }
    }

    public static void main(String[] args) {

    }
}
