package com.company;

public class Circle implements Figure {

    private double r;


    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public String getName() {
        return "Okrag";
    }
}
