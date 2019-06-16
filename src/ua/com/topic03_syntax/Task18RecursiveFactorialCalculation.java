package ua.com.topic03_syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rustam on 16.06.2019
 * Реализовать программу вычисления факториала с помощью
 * рекурсивной функции. Осуществить тестирование функции.
 */
public class Task18RecursiveFactorialCalculation {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int input = inputting();
        long factorial = recursiveFact(input);
        printResult(factorial);
    }


    private static int inputting() {
        System.out.print("Enter a number: ");
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        try {
            result = Integer.parseInt(bReader.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    /**
     * Recursive fact long.
     *
     * @param n the n
     * @return the long
     */
    protected static long recursiveFact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return recursiveFact(n - 1) * n;
        }

    }

    private static void printResult(long n) {
        System.out.println("The result is: " + n);
    }
}
