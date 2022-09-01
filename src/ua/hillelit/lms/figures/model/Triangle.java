package ua.hillelit.lms.figures.model;

import ua.hillelit.lms.figures.api.FigureAreable;

public class Triangle implements FigureAreable {

    private double sideLength;
    private double height;

    public Triangle(double sideLength, double height) {
        this.sideLength = sideLength;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * sideLength * height;
    }

    @Override
    public String getName() {
        return FigureAreable.super.getName();
    }

}
