package ua.hillelit.lms.figures;

import ua.hillelit.lms.figures.api.FigureAreable;
import ua.hillelit.lms.figures.model.Circle;
import ua.hillelit.lms.figures.model.Square;
import ua.hillelit.lms.figures.model.Triangle;

public class Main {
    public static void main(String[] args) {

        FigureAreable[] figureArr = new FigureAreable[3];

        figureArr[0] = new Square(5.3);
        figureArr[1] = new Circle(5);
        figureArr[2] = new Triangle(6.5, 10);

        printArea(figureArr);

    }

    public static void printArea(FigureAreable[] figureArr) {

        double totalArea = 0;

        for (FigureAreable figure : figureArr) {
            totalArea += figure.area();
            System.out.println(figure.getName() + " area: " + figure.area());
        }

        System.out.println("\nTotal area: " + totalArea);
    }

}
