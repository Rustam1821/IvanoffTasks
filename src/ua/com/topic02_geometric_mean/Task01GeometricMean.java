package ua.com.topic02_geometric_mean;

import java.util.Scanner;

/**
 * Реализовать алгоритм и программу, в которой вводится n чисел и определяется
 * их среднее геометрическое – корень в n-й степени из их произведения.
 */
public class Task01GeometricMean {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] numbers = dataReceiving();
        System.out.println("The geometric mean of your numbers is: " + calculator(numbers));
    }

    /**
     * Calculator double.
     *
     * @param numbers the numbers
     * @return the double
     */
    static double calculator(final int[] numbers) {
        double result = 1;
        for (int i : numbers) {
            result *= i;
        }

        result = Math.pow(result, (1 / (double) numbers.length));
        return result;
    }

    /**
     * @return data entered
     * @throws ArithmeticException if data is invalid
     */
    private static int[] dataReceiving() throws ArithmeticException {

        System.out.println("Enter number of integers for geometric mean:");
        Scanner scanner = new Scanner(System.in);
        int numbersQuantity = scanner.nextInt();
        if (numbersQuantity < 2) {
            throw new ArithmeticException("The numbers quantity must be greater than 1");
        }

        System.out.println("Enter " + numbersQuantity + " integers: ");
        int[] numbers = new int[numbersQuantity];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 0) {
                throw new ArithmeticException("The numbers must be positive");
            }
        }
        scanner.close();
        return numbers;
    }
}
