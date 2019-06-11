package ua.com.topic03_syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rustam on 10.06.2019
 * <p>
 * Написать программу инвертированного двоичного представления числа так:
 * в обратном порядке, слева – младшие биты, а справа – старшие.
 */
public class Task13BinaryReverse {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int number = inputting();
        String binaryForm = Integer.toBinaryString(number);
        System.out.println(reverse(binaryForm));
    }

    /**
     * Inputting int.
     *
     * @return the int
     */
    private static int inputting() {
        int number = 0;
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            number = Integer.parseInt(bReader.readLine());
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }

    /**
     * Reverse string.
     *
     * @param binaryForm the binary form
     * @return the string
     */
    protected static String reverse(String binaryForm) {
        int binaryFormInt = Integer.parseInt(binaryForm);
        StringBuilder result = new StringBuilder();
        while (binaryFormInt > 0) {
            result.append(binaryFormInt % 10);
            binaryFormInt /= 10;
        }
        return result.toString();
    }
}
