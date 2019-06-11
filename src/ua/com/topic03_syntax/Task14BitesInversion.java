package ua.com.topic03_syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rustam on 11.06.2019
 */
public class Task14BitesInversion {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int inputtedNumber = inputting();
        String invertedNumber = invertBites(inputtedNumber);
        System.out.println("Inverted number in binary form: " + invertedNumber);
        int invertedNumberDecimal = convertToDecimal(invertedNumber);
        System.out.println("Inverted number in decimal form: " + invertedNumberDecimal);
    }

    private static int inputting(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        try{
            number = Integer.parseInt(reader.readLine());
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return number;
    }

    /**
     * Invert bites string.
     *
     * @param number the number
     * @return the string
     */
    protected static String invertBites(int number){
        String numberBinaryForm = Integer.toBinaryString(number);
        char [] bytes = numberBinaryForm.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        for (int i = bytes.length - 1; i >= 0; i--) {
            strBuilder.append(bytes[i]);
        }
        return strBuilder.toString();
    }

    /**
     * Convert to decimal int.
     *
     * @param binaryNumber the binary number
     * @return the int
     */
    protected static int convertToDecimal(String binaryNumber){
        String [] bytes = binaryNumber.split("");
        int result = 0;
        for (byte i = (byte) (bytes.length - 1); i >= 0; i--) {
            result += Integer.parseInt(bytes[i])*Math.pow(2,(byte)(bytes.length-1-i));
        }
        return result;
    }
}
