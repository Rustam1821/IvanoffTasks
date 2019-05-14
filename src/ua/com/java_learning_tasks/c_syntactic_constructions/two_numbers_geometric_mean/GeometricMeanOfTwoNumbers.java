package ua.com.java_learning_tasks.c_syntactic_constructions.two_numbers_geometric_mean;

import java.util.Scanner;

/**
 * Реализовать алгоритм и программу, в которой вводится два числа
 * и определяется их среднее геометрическое – квадратный корень
 * из их произведения
 */
public class GeometricMeanOfTwoNumbers {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter two positive numbers greater than 0");
        int[] twoNumbers = input();
        double result = calculateGeometricMean(twoNumbers);
        System.out.println("The geometric meanin of your numbers is: " + result);
    }

    /**
     * Input int [ ].
     *
     * @return the int [ ]
     */
    static int[] input() {
        Scanner scanner = new Scanner(System.in);
        int[] twoNumbers = {scanner.nextInt(), scanner.nextInt()};
        scanner.close();
        return twoNumbers;
    }


    /**
     * Calculate Geometric Mean
     * @param twoNumbers
     * @return result
     */
    public static double calculateGeometricMean(int[] twoNumbers) {
        double result = 1;
        for (int i : twoNumbers) {
            if (i <= 0) {
                throw new ArithmeticException(i + " is not valid number");
            }
            result *= i;
        }
        return Math.sqrt(result);
    }
}
