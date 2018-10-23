package ru.feeleen.bll;

public class BisectionMethod {
    double a = -Double.MAX_VALUE;
    double b = Double.MAX_VALUE;
    double c = 0;
    double fa = 0;
    double fb = 0;
    double fc = 0;

    public double getX(double e) {
        int count = 0;

        do {
            count++;
            System.out.println("[" + a + ";" + b + "]");
            c = (a +b) / 2;
            fa = formula(a);
            fb = formula(b);
            fc = formula(c);

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

    public double formula(double x) {
        return (1 / (1 + (x * x))) - x;
    }
}
