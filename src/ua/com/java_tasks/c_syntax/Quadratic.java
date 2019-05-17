package ua.com.java_tasks.c_syntax;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println(solution(5, 0, 0));
        System.out.println(solution(4, 0, -3));
        System.out.println(solution(4, 0, 36));
        System.out.println(solution(4, -7, 0));
        System.out.println(solution(3, -14, -5));
        System.out.println(solution(1, -10, 21));
    }

    static String solution(double a, double b, double c) {
        double determinant = Math.pow(b, 2) - 4 * a * c;
        String result;
        if (determinant < 0) {
            result = "There are no roots";
        } else if (determinant == 0) {
            result = "There is one root " + findRoots(a, b)[0];
        } else {
            result = "There are two roots: " + findRoots(a, b, determinant)[0]
                    + " and " + findRoots(a, b, determinant)[1];
        }
        return result;
    }

    private static double[] findRoots(double a, double b, double D) {
        double[] roots = new double[2];
        roots[0] = (-b + Math.sqrt(D)) / (2 * a);
        roots[1] = (-b - Math.sqrt(D)) / (2 * a);
        return roots;
    }

    private static double[] findRoots(double a, double b) {
        double[] roots = new double[2];
        roots[0] = (-b) / (2 * a);
        return roots;
    }
}
