package ua.com.topic03_syntax;

import java.util.Scanner;

public class Task06UsingSwitch {
    public static void main(String[] args) {
        int n = inputting();
        System.out.println("The y is : " + switcher(n));
    }

    private static int inputting() {
        System.out.println("Enter integer n");
        Scanner scanner = new Scanner(System.in);
        int inputtedNumber = scanner.nextInt();
        scanner.close();
        return inputtedNumber;
    }

    protected static int switcher(int number) {
        int result;
        switch (number) {
            case 0:
                result = 2;
                break;
            case 1:
                result = 4;
                break;
            case 2:
                result = 5;
                break;
            case 3:
                result = 3;
                break;
            case 4:
                result = 1;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
