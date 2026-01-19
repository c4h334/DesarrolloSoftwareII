package PracticaArreglos;

public class Main {

    public static void main(String[] args) {
        // Cree un arreglo de tipo int e implemente un algoritmo que obtenga el valor más alto del arreglo.
        IOManager.write("EJERCICIO 1");
        int[] highestValueArray = {20, 10, 40, 30, 50};
        IOManager.write("Array:\n" + printArray(highestValueArray) + "\nThe highest element of the array is " + highestValue(highestValueArray) + "\n");

        // Cree un arreglo de tipo int y genere un segundo arreglo donde cada elemento sea el cuadrado del elemento correspondiente del arreglo original.
        IOManager.write("EJERCICIO 2");
        int[] firstArray = {2, 3, 4, 5};
        IOManager.write("First array:\n" + printArray(firstArray) + "\nThe elements of the first array squared:\n" + printArray(squaredArray(firstArray)) + "\n");

        // Cree un arreglo de tipo int e implemente un algoritmo que obtenga el valor más bajo del arreglo.
        IOManager.write("EJERCICIO 3");
        int[] lowestValueArray = {20, 10, 40, 30, 50};
        IOManager.write("Array:\n" + printArray(lowestValueArray) + "\nThe lowest element of the array is " + lowestValue(lowestValueArray) + "\n");

        // Cree un arreglo de tipo int y calcule la suma de todos sus elementos.
        IOManager.write("EJERCICIO 4");
        int[] sumArray = {2, 4, 6};
        IOManager.write("Array:\n" + printArray(sumArray) + "\nThe sum of the elements of array equals " + sum(sumArray) + "\n");

        // Determine el segundo valor más grande del arreglo.
        IOManager.write("EJERCICIO 5");
        int[] secondHighestArray = {4, 2, 6};
        IOManager.write("Array:\n" + printArray(secondHighestArray) + "\nThe second highest element of the array is " + secondHighest(secondHighestArray) + "\n");

        /* --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
        // Calcule el promedio de los valores almacenados en un arreglo de enteros.
        IOManager.write("EJERCICIO 1");
        int[] averageArray = {4, 2, 6};
        IOManager.write("Array:\n" + printArray(averageArray) + "\nThe average of the array equals to:\n" + averageCalculation(sumArray));

        // Recorra un arreglo y determine cuántos números son pares y cuántos son impares.
        IOManager.write("EJERCICIO 2");
        int[] evenOrOddArray = {4, 3, 2, 5, 6};
        IOManager.write("Array:\n" + evenOrOdd(evenOrOddArray) + "\n");

        // Dado un arreglo y un número, indique si el número se encuentra o no en el arreglo.
        IOManager.write("EJERCICIO 3");
        int[] presentInArray = {4, 3, 2, 5, 6};
        int numberPresent = 6;
        IOManager.write("Is " + numberPresent + " in the array " + printArray(presentInArray) + "?");
        presentIn(numberPresent, presentInArray);

        // Imprima los elementos del arreglo desde el último hasta el primero.
        IOManager.write("EJERCICIO 4");
        int[] inverseArray = {1, 2, 3, 4};
        IOManager.write("The array " + printArray(inverseArray) + " inversed is " + printInverse(inverseArray));

        // Dado un número, indique cuántas veces aparece en el arreglo.
        IOManager.write("EJERCICIO 5");
        int[] howManyTimesArray = {4, 3, 6, 2, 5, 6};
        int howManyTimesNumber = 6;
        IOManager.write("How many times does the " + howManyTimesNumber + " appear in the array " + printArray(howManyTimesArray) + "?\nAnswer: " + howManyTimes(howManyTimesNumber, howManyTimesArray));

        // Dado un arreglo intercambie el valor de la primera posición con la última y viceversa.
        // IOManager
    }

    static double averageCalculation(int[] array) {
        return sum(array) / array.length;
    }

    static String evenOrOdd(int[] array) {

        int[] evenArray = new int[array.length];
        int[] oddArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[i] = array[i];
            } else {
                oddArray[i] = array[i];
            }
        }
        return "Even numbers:\n" + printArray(evenArray) + "\nOdd numbers:\n" + printArray(oddArray) + "\n";
    }

    static void presentIn(int number, int[] array) {
        boolean in = true;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                in = true;
            }
        }

        if (in) {
            IOManager.write("Yes\n");
        } else {
            IOManager.write("No\n");
        }
    }

    static String printInverse(int[] array) {
        String arrayString = "";

        int temp = 0;

        for (int i = array.length - 1; i > -1; i--) {
            arrayString += array[i] + " ";
        }

        return arrayString;
    }

    static int howManyTimes(int number, int[] array) {
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                count++;
            }
        }

        return count;
    }

    static int highestValue(int[] array) {
        int numMasAlto = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > numMasAlto) {
                numMasAlto = array[i];
            }
        }
        return numMasAlto;
    }

    static int lowestValue(int[] arreglo) {
        int numMasBajo = Integer.MAX_VALUE;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < numMasBajo) {
                numMasBajo = arreglo[i];
            }
        }
        return numMasBajo;
    }

    static int[] squaredArray(int[] primerArreglo) {
        int[] segundoArreglo = new int[primerArreglo.length];
        for (int i = 0; i < primerArreglo.length; i++) {
            segundoArreglo[i] = primerArreglo[i] * primerArreglo[i];
        }

        return segundoArreglo;
    }

    static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int secondHighest(int[] array) {
        int highestValue = 0;
        int secondHighestValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > highestValue) {
                secondHighestValue = highestValue;
                highestValue = array[i];
            }
        }
        return secondHighestValue;
    }

    static String printArray(int[] arreglo) {
        String arregloString = "";

        for (int i = 0; i < arreglo.length; i++) {
            arregloString += arreglo[i] + " ";
        }

        return arregloString;
    }
}
