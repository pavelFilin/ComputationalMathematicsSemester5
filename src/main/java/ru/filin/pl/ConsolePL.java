package ru.filin.pl;

import ru.feeleen.bll.Formula;
import ru.feeleen.bll.NewtonMethod;
import ru.feeleen.bll.SecantMethod;
import ru.feeleen.bll.Solver;

public class ConsolePL implements Runnable {
    Formula formula = new Formula() {
        public double solve(double x) {
            return (1 / (1 + (x * x))) - x;
        }
    };


    Solver solver = new NewtonMethod(formula);
    public void run() {
        System.out.println(solver.getX(0.001));
    }
}
