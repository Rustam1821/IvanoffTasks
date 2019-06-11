package ua.com.topic03_syntax;

import java.util.Scanner;

/**
 * Напишите программу, которая считывает x и вычисляет y, используя инструкцию if.
 * x < 0 -> y = -1
 * x = 0 -> y = 0
 * x > 0 -> y = 1
 */
public class Task03UsingIf {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int x = readX();
        int y = computeY(x);
        System.out.println("'y' equals: " + y);
    }

    /**
     * Read x int.
     *
     * @return the int
     */
    public static int readX() {
        System.out.println("Enter 'x'");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }

    /**
     * Compute y int.
     *
     * @param x the x
     * @return the int
     */
    protected static int computeY(final int x) {
        int y = 0;
        if (x < 0) {
            y = -1;
        } else if (x > 0) {
            y = 1;
        }
        return y;
    }
}
