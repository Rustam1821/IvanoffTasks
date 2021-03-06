package ua.com.topic03_syntax;

/**
 * Created by Rustam on 03.06.2019
 * Ввести значение eps и найти сумму ряда
 *
 * y = 1 + 1/2 + 1/4 + 1/8 + 1/16 + ...
 *
 * Добавлять слагаемые до тех пор, пока очередное слагаемое не станет меньше eps.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task10InfiniteRowSum {

    public static void main(String[] args) {
        double esp = inputEPS();
        double result = calculateInfiniteRowSum(esp);
        System.out.println("The sum of an infinite row is: " + result);
    }

    private static double inputEPS() {
        double eps = 0;
        System.out.print("Enter value of eps: ");
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            eps = Double.parseDouble(bReader.readLine());
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return eps;
    }

    protected static double calculateInfiniteRowSum(double esp) {
        int divider = 1;
        double result = 0;
        while (1.0 / divider > esp) {
            result += 1.0 / divider;
            divider *= 2;
        }
        return result;
    }

}
