// Java program to implement Runge Kutta method


import java.util.List;

public class Main {
    public static void main(String args[]) {
        Differential d2 = new Differential();
        double x0 = 0, y = 0, x = 0, h = 0.1;


        double[][] result = new double[2][11];
        double[] q = new double[11];
        double[] dq = new double[11];
        double[] dq2 = new double[11];

        int xd = 0;
        for (double i = 0; i < 0.3; xd++, i = i + 0.1) {
            result[0][xd] = i;
            result[1][xd] = d2.rungeKutta(x0, y, i, h);
        }

        for (int i = 0; i < 3; i++) {
            q[i] = 0.1 * d2.dydx(result[0][i], result[1][i]);
            q[i + 1] = 0.1 * d2.dydx(result[0][i + 1], result[1][i + 1]);
            dq[i] = q[i + 1] - q[i];
            dq2[i] = dq[i + 1] - dq[i];
        }

        xd = 3;
        for (double i = 0.3; i < 1; xd++, i = i + 0.1) {
            result[0][xd] = i;
            result[1][xd] = result[1][xd - 1] + q[xd - 1] + 0.5 * dq[xd - 1] + (5 / 12) * dq2[xd - 2];


            q[xd] = 0.1 * d2.dydx(result[0][xd], result[1][xd]);
            dq[xd - 1] = q[xd] - q[xd - 1];
            dq2[xd - 1] = dq[xd] - dq[xd - 1];
        }


        for (int i = 0; i < 11; i++) {

            if (i == 0) System.out.println("\ti\tx  \ty    \tq0     \tq1     \tdq2");
            System.out.println("\t" + i + "\t" + (Math.ceil(result[0][i] * 10)) / 10.0 + "\t " + ((int) (result[1][i] * 1000)) / 1000.0 + "\t" + ((int) (q[i] * 1000)) / 1000.0 + "\t" + ((int) (dq[i] * 10000)) / 10000.0 + "\t" + ((int) (dq2[i] * 10000)) / 10000.0);

        }

    }
}
