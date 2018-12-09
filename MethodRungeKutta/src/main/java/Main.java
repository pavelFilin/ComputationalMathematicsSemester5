// Java program to implement Runge Kutta method


import java.util.List;

public class Main {
    public static void main(String args[]) {
        Differential d2 = new Differential();
        double x0 = 0, y = 0, x = 0, h = 0.1;
        for (int i = 0; i < 10; i++) {
            System.out.println("in " + x + " value of y at x is : "
                    + d2.rungeKutta(x0, y, x, h));
            x += 0.1;
        }


        x0 = 0;
        y = 0;
        x = 0;
        h = 0.1;

        double[][] result = new double[2][10];
        double[] q = new double[10];
        double[] q1 = new double[10];
        double[] dq2 = new double[10];


        for (double i = 0, xd=0; i < 0.3;xd++, i=i+0.1) {
            result[0][(int)xd] = i;
            result[1][(int)xd] = d2.rungeKutta(x0, y, i, h);
        }

        q[0] = 0.1 * d2.dydx(0,0);
        q1[0] = 0.1 * d2.dydx(0,0);
        q2[0] = 0.1 * d2.dydx(0,0);

        for (int i = 0; i < 3; i++) {

        }

        for (int i = 3; i < result.length; i++) {

        }


        System.out.println("\t i \t x \ty \tq0 \tq1 \tdq2");
        for (int i = 0; i < 10; i++) {
            System.out.print("\n\t" + i+ "\t" + result[0][i] + " \t "+ result[1][i] + "\t1  \t1 \t1 ");

        }

    }
}
