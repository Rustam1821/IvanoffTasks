package ua.com.topic03_syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу, в которой вводятся n и k.
 * И вычисляется следующая сумма (одно слагаемое пропущено):
 *
 * y = 1 + 2 + 3 + ... + (k - 1) + (k + 1) + ... + n
 *
 * Необходимо реализовать два варианта программы –
 * с использованием инструкции continue и без нее.
 */

public class Task09SkippedAddendSum {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter k: ");
        int k = inputting();

        System.out.print("Enter n: ");
        int n = inputting();

        System.out.println("SkippedAddendSum by Version#1 is: " + calculateSumVer1(k, n));
        System.out.print("SkippedAddendSum by Version#2 is: " + calculateSumVer2(k, n));
    }

    /**
     * Inputting int.
     *
     * @return the int
     */
    static int inputting() {
        int number = 0;
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            number = Integer.parseInt(bReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }

    /**
     * Calculate sum ver 1 int.
     *
     * @param k the k
     * @param n the n
     * @return the int
     */
    static int calculateSumVer1(int k, int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i != k) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Calculate sum ver 2 int.
     *
     * @param k the k
     * @param n the n
     * @return the int
     */
    static int calculateSumVer2(int k, int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i == k) {
                continue;
            }
            else {
                sum += i;
            }
        }
        return sum;
    }
}
