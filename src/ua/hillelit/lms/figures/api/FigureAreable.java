package ua.hillelit.lms.figures.api;

public interface FigureAreable {

    double area();

    default String getName() {
        return getClass().getSimpleName();
    }

}
