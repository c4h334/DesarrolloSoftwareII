package Excepciones;

public class Main {
    public static void main(String[] args) {
        /*
         * int result = 10 / 0;
         * System.out.println(result);
         * System.out.println("Pudo terminar");
         * 
         * recursive();
         * Exception e = new Exception();
         * 
         * String mensaje = "algún mensaje de error";
         * Exception e = new Exception(mensaje);
         * String mensaje2 = e.getMessage();
         * e.printStackTrace();
         * 
         * try {
         * FileReader file = new FileReader("nonexistent.txt");
         * } catch (Exception e) {
         * 
         * }
         * 
         * int answer = 11 / 0;
         * 
         * 
         * int[] countsOfMoose = new int[3];
         * System.out.println(countsOfMoose[-1]);
         * 
         * 
         * String type = "moose";
         * Object obj = type;
         * Integer number = (Integer) obj; // ClassCastException
         * 
         * Integer.parseInt("abc");
         * 
         * 
         * String file = "Hola";
         * try {
         * System.out.println(file.charAt(0));
         * } catch (Exception e) {
         * System.out.println("Baboso, está vacío");
         * }
         * 
         * 
         * String file = null;
         * 
         * if (file != null) {
         * System.out.println(file.charAt(0));
         * } // Para no depender de try-catch
         */

    }

    public static void recursive() {
        recursive();
    }

    public static void visitManatees() {
        try {
            System.out.println("Manatees visited");
        } catch (NumberFormatException e1) {
            System.out.println(e1);
        } catch (IllegalArgumentException e2) {
            System.out.println(e2);
        }
    }
}