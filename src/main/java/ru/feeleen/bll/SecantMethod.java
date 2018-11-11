package ru.feeleen.bll;

import com.sun.istack.internal.NotNull;

public class SecantMethod implements Solver{

    double a = -10;
    double b = +10;
//    double a = -Double.MAX_VALUE;
//    double b = Double.MAX_VALUE;

    private Formula formula;
    public SecantMethod(@NotNull Formula formula) {
        this.formula = formula;
    }

    public double getX(double e) {
       double fa = 0;
       double fb = 0;
       double fc = 0;
        int count = 0;

        do {
                double c = -(formula.solve(a)*(b-a))/(formula.solve(b)-formula.solve(a)) + a;
            count++;
            System.out.println("[" + a + ";" + b + "]");
            fa = formula.solve(a);
            fb = formula.solve(b);
            fc = formula.solve(c);

            if (fa * fc < 0) {
                b = c;
            }

            if (fb * fc < 0) {
                a = c;
            }
        }
        while (Math.abs(a - b) > e);

        System.out.println("count of iterate " + count);
        return (a+b)/2;
    }
}
