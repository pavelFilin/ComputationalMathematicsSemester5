package ru.filin;

import ru.filin.methods.MethodSimpson;
import ru.filin.methods.RectangleMethod;
import ru.filin.methods.TrapezoidalRule;

public class Main {


    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double getY(double x) {
                return (1 / (3 + 2 * Math.cos(x)));
            }
        };

        double a = 0;
        double b = Math.PI;

        int n = 30;


        double h = (a + b) / n;

        double res1 = TrapezoidalRule.getAnswer(a, b, formula, h);
        a=0;
        h = (a + b) / n;
        double res2 = RectangleMethod.getAnswer(a, b, formula, h);
        double res3 = MethodSimpson.getAnswer(a, b, formula, h);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }


}
