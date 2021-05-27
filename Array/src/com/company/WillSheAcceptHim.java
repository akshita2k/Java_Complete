package com.company;
import java.util.*;
import java.lang.String;

public class WillSheAcceptHim {
    static boolean subsequence(String s1, String s2) {
        Stack<Character> stack = new Stack<>();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for(int i=chars1.length-1;i>=0;i--) {
            stack.push(chars1[i]);
        }
        if(stack.isEmpty()) return true;

        for(int i=0;i<chars2.length;i++){
            if(stack.isEmpty()) break;
            if(chars2[i]==stack.peek()){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result;
        for (int i=0; i<n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            result = (subsequence(s1,s2));
            if (result == true) {
                System.out.println("Love you too");
            }
            else {
                System.out.println("We are friends");
            }
        }

    }
}
