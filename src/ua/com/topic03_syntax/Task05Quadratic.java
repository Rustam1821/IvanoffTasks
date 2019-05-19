package ua.com.topic03_syntax;

/**
 * Разработайте программу, которая реализует алгоритм решения квадратного уравнения.
 * Алгоритм должен учитывать все возможные данные
 */
public class Task05Quadratic {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(printResult(solution(5, 0, 0)));
        System.out.println(printResult(solution(4, 0, -3)));
        System.out.println(printResult(solution(4, 0, 36)));
        System.out.println(printResult(solution(4, -7, 0)));
        System.out.println(printResult(solution(3, -14, -5)));
        System.out.print(printResult(solution(1, -10, 21)));
    }

    /**
     * Solution double [ ].
     *
     * @param a the a
     * @param b the b
     * @param c the c
     * @return the double [ ]
     */
    static double[] solution(final double a, final double b, final double c) {
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

    /**
     * Print result string.
     *
     * @param roots the roots
     * @return the string
     */
    static String printResult(final double[] roots) {
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
