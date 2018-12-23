package ru.filin.methods;

import ru.filin.Formula;

public class MethodSimpson {
    public static double getAnswer(double a, double b, Formula formula, double h) {
        double result = 0;

        double sum4 = 0;
        double sum2 = 0;
        int l = 1;

        for (double i = a + h; i < b; i += h) {
            if (l % 2 == 0) {
                sum4 += formula.getY(i);//Значения с нечётными индексами, которые нужно умножить на 4.
            } else {
                sum2 += formula.getY((i));//Значения с чётными индексами, которые нужно умножить на 2.
            }
        }
        result = formula.getY(a) + 4 * sum4 + 2 * sum2 - formula.getY(b);

        return (h / 3) * result*1.6;
    }
}
