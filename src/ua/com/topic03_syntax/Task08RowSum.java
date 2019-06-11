package ua.com.topic03_syntax;

import java.util.Scanner;

/**
 * Напишите программу, в которой вводится n и вычисляется следующая сумма.
 * y = 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n
 * Необходимо реализовать три варианта программы с тремя вариантами инструкций цикла.
 */
public class Task08RowSum {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int n = inputting();
        System.out.println(sumRowCalculation1Variant(n));
        System.out.println(sumRowCalculation2Variant(n));
        System.out.println(sumRowCalculation3Variant(n));

    }

    private static int inputting() {
        int n;
        System.out.println("Enter n:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
        return n;
    }

    /**
     * Sum row calculation 1 variant double.
     *
     * @param n the n
     * @return the double
     */
    protected static double sumRowCalculation1Variant(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / i;
        }
        return sum;
    }

    /**
     * Sum row calculation 2 variant double.
     *
     * @param n the n
     * @return the double
     */
    protected static double sumRowCalculation2Variant(int n) {
        double sum = 0;
        for (int i = n; i != 0; i--) {
            sum += (double) 1 / i;
        }
        return sum;
    }

    /**
     * Sum row calculation 3 variant double.
     *
     * @param n the n
     * @return the double
     */
    protected static double sumRowCalculation3Variant(int n) {
        double sum = 0;
        while (n > 0) {
            sum += (double) 1 / n;
            n--;
        }
        return sum;
    }
}
