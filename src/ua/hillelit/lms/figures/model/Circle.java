package ua.hillelit.lms.figures.model;

import ua.hillelit.lms.figures.api.FigureAreable;

public class Circle implements FigureAreable {

    private double radius;
    private final double PI = 3.1415926536;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * (radius * radius);
    }

    @Override
    public String getName() {
        return FigureAreable.super.getName();
    }

}
