package ua.com.java_tasks.c_syntax.rounding;

import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        System.out.println("Enter a fractional number");
        System.out.println("I've round it: " + roundIt(inputting()));
    }

    private static double inputting(){
        Scanner scanner = new Scanner(System.in);
        double inputNumber = scanner.nextDouble();
        scanner.close();
        return inputNumber;
    }

    static double roundIt(double input){
        if (isRoundUp(input)){
            input = (int)input + 1;
        }
        else {
            input = (int) input;
        }
        return input;
    }

    private static boolean isRoundUp(double input){
        return input%1 > 0.4;
    }
}
