package Ejercicio1_UML;

public class Tigre extends Felinos {
    private int patas;
    private boolean salvaje;

    @Override
    public void caminar() {
        System.out.println("El tigre está caminando...");
    }

    @Override
    public void nadar() {
        System.out.println("El tigre está nadando...");
    }
}
