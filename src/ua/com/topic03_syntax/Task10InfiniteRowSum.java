package ua.com.topic03_syntax;

/**
 * Created by Rustam on 03.06.2019
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task10InfiniteRowSum {

    public static void main(String[] args) {
        double esp = inputEPS();
        int divider = 1;
        double result = 0;
        while (1/divider > esp){
            result += (double) 1/divider;
            divider*=2;
        }
        System.out.println("The sum of an infinite row is: " + result);

    }

    static double inputEPS() {
        double eps = 0;
        System.out.print("Enter value of eps:");
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            eps = Double.parseDouble(bReader.readLine());
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return eps;
    }
}
