package ua.com.topic03_syntax;

import java.util.Scanner;

/**
 * Написать программу, которая считывает значения с плавающей точкой и печатает округленные значения.
 * Не использовать стандартную функцию округления.
 * Использовать приведение типов.
 */
public class Task02Rounding {

    public static void main(String[] args) {
        System.out.println("Enter a fractional number");
        System.out.println("I've round it: " + roundIt(inputting()));
    }

    private static double inputting() {
        Scanner scanner = new Scanner(System.in);
        double inputNumber = scanner.nextDouble();
        scanner.close();
        return inputNumber;
    }

    /**
     * Round it double.
     * Accepts e real number and returns rounded one.
     *
     * @param number the input
     * @return the double
     */
    protected static double roundIt(double number) {
        if (isRoundUp(number)) {
            number = (int) number + 1;
        } else {
            number = (int) number;
        }
        return number;
    }

    private static boolean isRoundUp(final double input) {
        return (input % 1 >= 0.5);
    }
}
