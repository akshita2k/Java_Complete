package com.company;
import java.util.*;

class Rectangle {
    int length;
    int breadth;

    public int area () {
        return length*breadth;
    }

    public int perimeter () {
        return 2*(length+breadth);
    }
}

public class RectangleMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Rectangle r = new Rectangle();

        r.length = sc.nextInt();
        r.breadth = sc.nextInt();

        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
