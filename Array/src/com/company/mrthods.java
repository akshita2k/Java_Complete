package com.company;
import java.util.Scanner;

public class mrthods {

    //Static methods
    static int logic (int x, int y) {
        int z ;

        // instead of repeating the same logic multiple times we use a method
        if (x>y) {
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return(z);
    }

    //object methods / non static methods
    int sum (int x, int y) {
        return x+y;
    }

    //main
    public static void main(String[] args) {

        //create an object to call the non-static methods
        mrthods obj = new mrthods();

        //declare var
        int a = 5;
        int b = 7;
        int c;

        //static method
        c= logic(a,b);

        //non-static method
        int d = obj.sum(a,b);

        //print o/p
        System.out.println(d);
        System.out.println(c);

    }

}
