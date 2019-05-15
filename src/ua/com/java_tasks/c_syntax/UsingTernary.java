package ua.com.java_tasks.c_syntax;

/**
 * Напишите программу, которая выполняет предыдущее задание.
 * с использованием условных операций.
 */
public class UsingTernary {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int x = UsingIf.readX();
        int y = computeY(x);
        System.out.println("'y' equals: " + y);
    }

    /**
     * Compute y int.
     *
     * @param x the x
     * @return the int
     */
    static int computeY(int x) {
        return (x < 0) ? -1 : (x > 0) ? 1 : 0;
    }
}
