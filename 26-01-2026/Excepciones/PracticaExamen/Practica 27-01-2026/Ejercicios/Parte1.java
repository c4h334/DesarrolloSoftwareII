import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args) {
        // exercise1();
        // exercise2();
        // exercise3();
        // exercise4();
        // exercise5();
        // exercise6();
        // exercise7();
        // exercise8();
        // exercise9();
        exercise10(3);
    }

    static void exercise1() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            print("Write a number");
            array[i] = (int) read();
        }

        printArray(array);
    }

    static void exercise2() {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            print("Write a number");
            array[i] = (int) read();
        }

        double positivesAverage = 0;
        int positivesAmount = 0;
        int negativesAmount = 0;
        int zerosAmount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positivesAverage += array[i];
                positivesAmount++;
            } else if (array[i] < 0) {
                negativesAmount++;
            } else {
                zerosAmount++;
            }
        }

        print("The average of positive numbers: " + (positivesAverage / positivesAmount) +
                "\nThe amount of negative numbers: " + negativesAmount +
                "\nThe amount of zeros: " + zerosAmount);
    }

    static void exercise3() {
        int[] array1 = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int[] array2 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array3.length; i++) {
            int j = i / 2;
            if (i % 2 == 0) {
                array3[i] = array1[j];
            } else {
                array3[i] = array2[j];
            }
        }

        printArray(array3);
    }

    static void exercise4() {
        int[] array1 = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23 };
        int[] array2 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24 };
        int[] array3 = new int[array1.length + array2.length];

        int k = 0;
        for (int i = 0; i < array1.length; i += 3) {

            for (int j = 0; j < 3; j++) {
                array3[k++] = array1[i + j];
            }

            for (int j = 0; j < 3; j++) {
                array3[k++] = array2[i + j];
            }
        }

        printArray(array3);
    }

    static void exercise5() {
        String[] array = { "arbol", "basura", "conejo", "leon", "elefante", "farmacia", "gato", "helado",
                "inteligencia", "jirafa" };
        boolean ordenado = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1].compareTo(array[i]) > 0) {
                print(array[i] + " > " + array[i + 1]);
            } else if (array[i + 1].compareTo(array[i]) < 0) {
                print(array[i] + " < " + array[i + 1]);
                ordenado = false;
                print("El arreglo NO está ordenado alfabéticamente");
                break;
            }

        }
        if (ordenado)
            print("El arreglo está ordenado alfabéticamente");
    }

    static void exercise6() {
        print("Write a word");
        String hilera = (String) read();
        int size = 0;

        for (int i = 0; i < hilera.length(); i++) {
            if (!(hilera.charAt(i) == ' ')) {
                size++;
            }
        }

        print("The word " + hilera + " has " + size + " letters");
    }

    static void exercise7() {
        print("Write a word");
        String hilera = (String) read();
        int amount = 0;

        for (int i = 0; i < hilera.length(); i++) {
            if (hilera.charAt(i) == 'a') {
                amount++;
            }
        }

        print("The word " + hilera + " has " + amount + " 'a''");
    }

    static void exercise8() {
        print("Escriba algo");
        String oracion = (String) read();
        oracion = oracion.toLowerCase();

        boolean palindromo = true;

        for (int i = 0; i < oracion.length(); i++) {

            for (int j = oracion.length() - 1 - i; j >= 0; j--) {

                if (oracion.charAt(i) == ' ' || oracion.charAt(j) == ' ') {
                    break;
                }

                if (oracion.charAt(i) != oracion.charAt(j)) {
                    palindromo = false;
                }
                break;
            }

            if (!palindromo) {
                break;
            }
        }

        if (palindromo) {
            print("La oración " + oracion + " es un palíndromo");
        } else {
            print("La oración " + oracion + " NO es un palíndromo");
        }
    }

    static void exercise9() {
        int matrizOriginal[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 1, 1, 1 }, { 2, 2, 2, 2 } };
        int matrizTranspuesta[][] = new int[4][4];

        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[0].length; j++) {
                matrizTranspuesta[i][j] = matrizOriginal[j][i];
            }
        }

        int sumaFilas = 0;
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[0].length; j++) {
                sumaFilas += matrizOriginal[i][j];
            }
        }

        int sumaColumnas = 0;
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[0].length; j++) {
                sumaColumnas += matrizTranspuesta[i][j];
            }
        }

        if (sumaFilas == sumaColumnas) {
            print(sumaFilas + " es igual a " + sumaColumnas);
        } else {
            print(sumaFilas + " NO es igual a " + sumaColumnas);
        }

    }

    static void exercise10(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (10 * Math.random() + 1);
            }
        }

        int sumaDP = 0;
        int sumaDI = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    sumaDP += matriz[i][j];
                }

                if (i + j == matriz.length - 1) {
                    sumaDI += matriz[i][j];
                }
            }
        }

        printMatrix(matriz);
        print("La suma de la diagonal principal es " + sumaDP + "\nLa suma de la diagonal inversa es " + sumaDI
                + "\nLa diferencia entre ambas es " + (sumaDP - sumaDI));
    }

    static void printArray(int[] array) {
        String printedArray = "";

        for (int i = 0; i < array.length; i++) {
            printedArray += array[i] + " ";
        }

        print(printedArray);
    }

    static void printMatrix(int[][] matrix) {
        String printedMatrix = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                printedMatrix += matrix[i][j] + " ";
            }
            printedMatrix += "\n";
        }

        print(printedMatrix);
    }

    // IOManager

    static Scanner scanner = new Scanner(System.in);

    static Object read() {
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

    static void print(Object var) {
        System.out.println(var);
    }
}
