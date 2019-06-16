package ua.com.topic03_syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rustam on 16.06.2019
 * Реализовать программу поиска простых чисел.
 * Проверку, является ли число простым, осуществлять в отдельной
 * функции, которая принимает целое число и возвращает результат
 * типа boolean. В функции main() осуществить ввод необходимого
 * диапазона и вывод всех простых чисел в этом диапазоне.
 */
public class Task19PrimeNumbers {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] numbers = initiateNumbers();
            for (int i = 0; i < numbers.length; i++) {
                if (isPrime(numbers[i])) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }

    private static int[] initiateNumbers() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int start = 0;
        int end = 0;
        while (end <= start) {
            System.out.println("Enter the start and the end: ");
            try {
                start = Integer.parseInt(bufferedReader.readLine());
                end = Integer.parseInt(bufferedReader.readLine());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int[] numbers = new int[end - start + 1];
        for (
                int i = 0;
                i < numbers.length; i++)

        {
            numbers[i] = start++;
        }
        return numbers;
    }

    /**
     * Is prime boolean.
     *
     * @param n the n
     * @return the boolean
     */
    protected static boolean isPrime(int n) {
        boolean primeNumber = true;
        if (n < 2 || (n > 2 && n % 2 == 0)) {
            primeNumber = false;
        } else if (n > 2) {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    primeNumber = false;
                    break;
                }
            }
        }
        return primeNumber;
    }
}
