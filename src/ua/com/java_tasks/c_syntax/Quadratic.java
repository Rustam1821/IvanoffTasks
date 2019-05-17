package ua.com.java_tasks.c_syntax;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println(printResult(solution(5, 0, 0)));
        System.out.println(printResult(solution(4, 0, -3)));
        System.out.println(printResult(solution(4, 0, 36)));
        System.out.println(printResult(solution(4, -7, 0)));
        System.out.println(printResult(solution(3, -14, -5)));
        System.out.println(printResult(solution(1, -10, 21)));
    }

    static double[] solution(double a, double b, double c) {
        double determinant = Math.pow(b, 2) - 4 * a * c;
        double[] roots;
        if (determinant < 0) {
            roots = new double[0];
        } else if (determinant == 0) {
            roots = new double[1];
            roots[0] = (-b) / (2 * a);
        } else {
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(determinant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(determinant)) / (2 * a);
        }
        return roots;
    }

    static String printResult(double[] roots) {
        String result;
        switch (roots.length) {
            case 0:
                result = "No solution";
                break;
            case 1:
                result = Double.toString(roots[0]);
                break;
            default:
                result = Double.toString(roots[0]) + " " + Double.toString(roots[1]);

        }
        return result;
    }
}
