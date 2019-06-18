package ua.com.topic03_syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rustam on 16.06.2019
 * Реализовать программу поиска чисел Фибоначчи:
 * F(1) = F(2) = 1; F(n) = F(n - 2) + F(n - 1)
 * Поиск n-го числа Фибоначчи осуществлять в отдельной функции.
 * В функции main() осуществить ввод номера числа и вывод
 * всех чисел Фибоначчи до введенного номера включительно.
 * Реализовать два варианта - с использованием цикла и с использованием рекурсии.
 */
public class Task20FibonacciNumbers {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int number = inputting();
        System.out.println("result Variant_1: " + buildFibonacciLoop(number));
        System.out.println("result Variant_2: " + buildFibonacciRecursive(number));
    }

    private static int inputting() {
        System.out.print("Enter a number: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        try {
            result = Integer.parseInt(reader.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    /**
     * Build fibonacci.
     *
     * @param n the n
     * @return the string
     */
    protected static String buildFibonacciLoop(int n) {
        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append(1);
        long first = 0;
        long second = 1;
        while (true) {
            long result = first + second;
            strBuilder.append(" " + result);
            first = second;
            second = result;
            if (result >= n) {
                break;
            }
        }
        return strBuilder.toString();
    }

    /**
     * Calculate fibonacci recursive int.
     *
     * @param n the n
     * @return the int
     */
    protected static int calculateFibonacciRecursive(int n) {
        if (n ==0 || n == 1) {
            return 1;
        } else {
            return calculateFibonacciRecursive(n - 2) + calculateFibonacciRecursive(n - 1);
        }
    }

    /**
     * Build fibonacci recursive string.
     *
     * @param n the n
     * @return the string
     */
    protected static String buildFibonacciRecursive (int n){
            StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            strBuilder.append(calculateFibonacciRecursive(i) + " ");
        }
            return strBuilder.toString().trim();
    }

}
