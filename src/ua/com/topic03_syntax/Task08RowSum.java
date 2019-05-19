package ua.com.topic03_syntax;

import java.util.Scanner;

public class Task08RowSum {
    private static int inputting (){
        int n;
        System.out.println("Enter n:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
    }
    static double sumRowCalculation1Variant(int n){
        double sum;
        for (int i = 1; i <= n; i++){
            sum += 1/i;
        }
        return sum;
    }

        static double sumRowCalculation2Variant(int n) {
        double sum;
        for (int i = n; i != 0; i--) {
            sum += 1 / i;
        }
        return sum;
    }
}
