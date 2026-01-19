package PracticaArreglos;

import java.util.Scanner;

public class IOManager {

    static Scanner scanner = new Scanner(System.in);

    public static Object read() {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e1) {
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e2) {
                return input;
            }
        }
    }

        

    public static void write(Object var) {
        System.out.println(var);
    }
}
