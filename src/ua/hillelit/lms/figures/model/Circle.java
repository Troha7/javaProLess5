package ua.hillelit.lms.figures.model;

import ua.hillelit.lms.figures.api.FigureAreable;

public class Circle implements FigureAreable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return FigureAreable.super.getName();
    }

}
