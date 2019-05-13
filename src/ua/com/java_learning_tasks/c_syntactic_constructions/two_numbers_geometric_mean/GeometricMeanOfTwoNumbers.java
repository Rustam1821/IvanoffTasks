package ua.com.java_learning_tasks.c_syntactic_constructions.two_numbers_geometric_mean;

import java.util.Scanner;

public class GeometricMeanOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two positive numbers greater than 0");
        int[] twoNumbers = input();
        double result = calculate(twoNumbers);
        System.out.println("The geometric meanin of your numbers is: " + result);
    }

    static int[] input() {
        Scanner scanner = new Scanner(System.in);
        int[] twoNumbers = {scanner.nextInt(), scanner.nextInt()};
        scanner.close();
        return twoNumbers;
    }

    static double calculate(int[] twoNumbers) {
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
