package ru.feeleen.bll;

import com.sun.istack.internal.NotNull;

public class NewtonMethod implements Solver {
    double a = -10;
    double b = +10;
    double c0 = 0;
    private Formula formula;

    public NewtonMethod(@NotNull Formula formula) {
        this.formula = formula;
    }

    public double getX(double e) {
        int count = 0;
        c0 = a;
        double c = a;
        do {
            count++;
            c0 = c;
            c = c0 - formula.solve(c0) / proiz(c0);
            if (c0< c) {
                System.out.println("[" + c0 + "; " + c + "]");
            } else {
                System.out.println("[" + c + "; " + c0 + "]");
            }
        } while (Math.abs(c0 - c) > e);

        System.out.println(count);
        return (c0 + c) / 2;
    }

    public double proiz(double x) {
        return -((2 * x) / (1 + x * x)) - 1;
    }

}
