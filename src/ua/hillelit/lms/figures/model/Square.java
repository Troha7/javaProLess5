package ua.hillelit.lms.figures.model;

import ua.hillelit.lms.figures.api.FigureAreable;

public class Square implements FigureAreable {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public String getName() {
        return FigureAreable.super.getName();
    }

}
