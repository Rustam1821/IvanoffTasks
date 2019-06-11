package ua.com.topic03_syntax;

import java.util.Scanner;

/**
 * Created by Rustam on 09.06.2019
 * <p>
 * Изменить программу двоичного представления числа так,
 * чтобы не выводились нули вначале. Использовать булеву
 * переменную для индикации того, первый ли это ноль.
 */
public class Task12BinaryNotation {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        convertToBinaryForm(b);
    }

    /**
     * Convert to binary form string.
     *
     * @param b the b
     * @return the string
     */
    protected static String convertToBinaryForm(int b) {
        String result ="";
        boolean flag = true;
        for (int i = 31; i >= 0; i--) {
            byte number = (byte) (1 & (b >> i));
            if (number == 0 && flag) {
                continue;
            } else {
                result+=number;
                flag = false;
            }
        }
        return result;
    }
}

