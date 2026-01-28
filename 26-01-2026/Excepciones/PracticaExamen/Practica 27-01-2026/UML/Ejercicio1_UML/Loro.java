package Ejercicio1_UML;

public class Loro extends Aves {

    private boolean salvaje;

    @Override
    public void caminar() {
        System.out.println("El loro está caminando...");
    }

    @Override
    public void volar() {
        System.out.println("El loro está volando...");
    }
}
