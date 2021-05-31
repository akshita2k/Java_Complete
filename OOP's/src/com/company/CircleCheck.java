package com.company;

class CircleMod {
    private float radius;
    private float area;
    private float peri;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setPeri(float peri) {
        this.peri = peri;
    }

    public float getRadius() {
        return radius;
    }

    public float getArea () {
        if (area != 3.14*radius*radius) {
            System.out.println("Error, wrong area w.r.t radius");
        }
        return area;
    }

    public float getPeri() {
        if (peri != 2*3.14*radius) {
            System.out.println("Error, worng perimeter w.r.t. radius");
        }
        return peri;
    }
}
public class CircleCheck {
    public static void main(String[] args) {
        CircleMod c = new CircleMod ();
        c.setRadius(1);
        c.setPeri((float) 3.41);
        c.setArea((float) 3.14);
        System.out.println("Radius = " +c.getRadius());
        System.out.println("Area = " +c.getArea());
        System.out.println("Perimeter = " +c.getPeri());
    }
}
