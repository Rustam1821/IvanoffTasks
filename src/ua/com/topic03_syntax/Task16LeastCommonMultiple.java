package ua.com.topic03_syntax;

import java.util.Scanner;

/**
 * Created by Rustam on 13.06.2019
 * Реализовать и протестировать функцию, которая вычисляет
 * наименьшее общее кратное двух чисел путем деления
 * произведения чисел на наибольший общий делитель.
 */
public class Task16LeastCommonMultiple {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        int x = inputting();
        System.out.print("Enter y: ");
        int y = inputting();
        System.out.print("The least common multiple for " + x + " and " + y + " is: ");
        System.out.println(findLeastCommonMultiple(x, y));
    }

    private static int findGreatestCommonDivisor(int x, int y) {
        int max = Math.max(x, y);
        int min = x * y / max;
        while (true) {
            if (max % min == 0) {
                return min;
            } else {
                int temp = min;
                min = max % min;
                max = temp;
            }
        }
    }

    /**
     * Find least common multiple int.
     *
     * @param x the x
     * @param y the y
     * @return the int
     */
    protected static int findLeastCommonMultiple(int x, int y) {
        return x * y / findGreatestCommonDivisor(x, y);
    }

    private static int inputting() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
