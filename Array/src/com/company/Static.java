package com.company;
import java.util.*;

public class Static {
    public class JavaStaticInitializerBlock {
        static Scanner sc = new Scanner(System.in);
        static int B = sc.nextInt();
        static int H = sc.nextInt();
        static boolean flag;
        static {
            try {
                if (B > 0 && H > 0) {
                    flag = true;
                } else {
                    throw new Exception("Breadth and height must be positive");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int B = sc.nextInt();
         int H = sc.nextInt();
         boolean flag= false;
        {
            try {
                if (B > 0 && H > 0) {
                    flag = true;
                } else {
                    throw new Exception("Breadth and height must be positive");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}

