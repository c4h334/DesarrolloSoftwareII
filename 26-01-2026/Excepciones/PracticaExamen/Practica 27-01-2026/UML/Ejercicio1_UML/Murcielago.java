package Ejercicio1_UML;

public class Murcielago extends Mamiferos implements PuedeVolar {
    private int patas;
    private boolean salvaje;

    @Override
    public void caminar() {
        System.out.println("El murciélago está caminando...");
    }

    @Override
    public void volar() {
        System.out.println("El murciélago está volando...");
    }
}
