package Ejercicio1_UML;

public class Gato extends Felinos {
    private int patas;
    private boolean salvaje;

        @Override
    public void caminar(){
        System.out.println("El gato está caminando...");
    }

    @Override
    public void nadar(){
        System.out.println("El gato está nadando...");
    }
}
