package ru.filin.methods;

import ru.filin.Formula;

public class TrapezoidalRule {
    public static double getAnswer(double a, double b, Formula formula, double h) {
        double result = 0;

        for (double i = a; i <= b; i += h) {
            result += 0.5 * (formula.getY(i) + formula.getY(i + h)) * h;
        }
        return result;
    }
}
