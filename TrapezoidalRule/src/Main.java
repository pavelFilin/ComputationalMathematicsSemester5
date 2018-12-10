public class Main {
    public static void main(String[] args) {
        double a = 0;
        double b = Math.PI;

        int n = 30;

        double result = 0;

        double x = a;
        double dx = (a + b) / n;

        for (int i = 0; i <= n - 1; i++) {
            double temp = 0.5 * (f(x) * f(x + dx) * dx);
            System.out.println(temp);
            x += dx;
            result += temp;
        }

        System.out.println("result = " + result);
    }

    public static double f(double x) {
        return (1 / (3 + 2 * Math.cos(x)));
    }

}
