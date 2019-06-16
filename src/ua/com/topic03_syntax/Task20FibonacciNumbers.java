package ua.com.topic03_syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rustam on 16.06.2019
 */
public class Task20FibonacciNumbers {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int number = inputting();
        System.out.println(buildFibonacciLoop(number));
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

}
