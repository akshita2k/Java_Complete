package com.company;
import java.util.*;

class Circle {
    float radius;

    public double area() {
        double area = 3.14*radius*radius;
        return area;
    }

    public double perimeter() {
        double peri = 2*3.14*radius;
        return peri;
    }
}

public class CircleMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        c.radius = sc.nextFloat();

        System.out.println(c.perimeter());
        System.out.println(c.area());
    }
}
