package ua.com.topic03_syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rustam on 05.06.2019
 * Ввести значение n (от 0 до 10) и вывести значения степеней числа 8 до n включительно.
 * Реализовать два подхода – с использованием арифметических и побитовых операций.
 */
public class Task11PowersOfEight {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        System.out.print("Enter grade for 8: ");
        int exp = inputting();
        System.out.println("Eight raised to the " + exp + "-th power equals:");
        System.out.println("Using bitwise operation: " + exponentiationUsingBitwise(exp));
        System.out.println("Using arithmetic operation: " + exponentiationUsingArithmetic(exp));
    }

    /**
     * Inputting int.
     *
     * @return the int
     * @throws IOException the io exception
     */
    private static int inputting() throws IOException {
        int number = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(reader.readLine());
        reader.close();
        return number;
    }

    /**
     * Exponentiation using bitwise int.
     *
     * @param exp the exp
     * @return the int
     */

    static int exponentiationUsingBitwise(final int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result <<= 3;
        }
        return result;
    }

    /**
     * Exponentiation using arithmetic int.
     *
     * @param exp the exp
     * @return the int
     */
    static int exponentiationUsingArithmetic(final int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= 8;
        }
        return result;
    }
}
