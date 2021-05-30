package com.company;
import java.util.*;

class Square {
    int side;

    public int area (int side) {
        return side*side;
    }

    public int perimeter (int side) {
        return 4*side;
    }
}
public class SquareMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Square s = new Square();
        int side = sc.nextInt();
        System.out.println(s.area(side));
        System.out.println(s.perimeter(side));
    }
}
