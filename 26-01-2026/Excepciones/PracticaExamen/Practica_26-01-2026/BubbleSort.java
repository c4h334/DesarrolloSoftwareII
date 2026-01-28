public class BubbleSort {
    public static void main(String[] args) {

        int[] a = { 6, 2, 3, 5, 8, 7 };
        int mayor = 0;

        String original = "";
        for (int i = 0; i < a.length; i++) {
            original += a[i] + " ";
        }

        System.out.println(original);

        String ordenado = "";
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    System.out.println("ANTES [i] = " + a[j] + " [i+1] = " + a[j + 1]);
                    mayor = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = mayor;
                    System.out.println("DESPUÉS [i] = " + a[j] + " [i+1] = " + a[j + 1]);
                    ordenado += a[j] + " ";
                    System.out.println(original);
                    System.out.println(ordenado);
                }

            }

        }

        String nuevoArreglo = "";
        for (int i = 0; i < a.length; i++) {
            nuevoArreglo += a[i] + " ";
        }

        System.out.println(nuevoArreglo);
        System.out.println("" + void1());

    }

     private final int voidl(){
        return 0;
     }
}
