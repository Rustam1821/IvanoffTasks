package ua.com.topic03_syntax;

/**
 * Символы с заданными кодами.
 * Выведите на экран символы, коды которых находятся в диапазоне от 1072 до 1120
 */
public class Task07SymbolsByCode {
    private static final char START = 1072;
    private static final char END = 1120;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.print(printRow());
    }

    /**
     * Print row string.
     *
     * @return the string
     */
    static String printRow() {
        StringBuilder stringBuilder = new StringBuilder();
        for (char i = START; i <= END; i++) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }

}
