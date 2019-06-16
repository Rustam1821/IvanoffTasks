package ua.com.topic03_syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rustam on 16.06.2019
 * Реализовать программу, в которой вычисление факториала осуществляется
 * отдельной функцией. Факториал должен вычисляться с помощью цикла.
 * Осуществить тестирование функции. Предусмотреть отдельные функции
 * для ввода значения n, вычисления факториала и вывода результата.
 */
public class Task17FactorialCalculation {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int input = inputting();
        long factorial = calculateFactorial(input);
        printResult(factorial);
    }


    private static int inputting() {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        int inputtedNumber = 0;
        try {
            inputtedNumber = Integer.parseInt(bReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputtedNumber;
    }

    /**
     * Calculate factorial long.
     *
     * @param input the input
     * @return the long
     */
    protected static long calculateFactorial(int input) {
        long result = 1;
        for (int i = 1; i <= input; i++) {
            result *= i;
        }
        return result;
    }

    private static void printResult(long n) {
        System.out.println("The factorial is: " + n);
    }
}
