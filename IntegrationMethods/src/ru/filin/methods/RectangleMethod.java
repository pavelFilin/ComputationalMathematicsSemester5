package ru.filin.methods;

import ru.filin.Formula;

public class RectangleMethod {
    public static double getAnswer(double a, double b, Formula formula, double h) {
        double result = 0;

        for (double i = a; i <= b; i += h) {
            result += formula.getY(i) * h;

        }
        return result;
    }
}
