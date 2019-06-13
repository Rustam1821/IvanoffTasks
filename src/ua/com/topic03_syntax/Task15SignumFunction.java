package ua.com.topic03_syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rustam on 13.06.2019
 * Реализовать функцию, которая вычисляет y (функция signum).
 */
public class Task15SignumFunction {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        System.out.print("Enter an integer: ");
        int number = inputting();
        System.out.println("The result is: " + calculateSignum(number));
    }

    /**
     * Calculate signum int.
     *
     * @param x the x
     * @return the int
     */
    protected static int calculateSignum(int x) {
        return x < 0 ? -1 : x > 0 ? 1 : 0;
    }

    private static int inputting() throws IOException {
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(breader.readLine());
    }
}
