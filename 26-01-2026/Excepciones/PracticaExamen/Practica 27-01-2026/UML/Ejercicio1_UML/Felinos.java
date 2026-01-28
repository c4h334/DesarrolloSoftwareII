package Ejercicio1_UML;

public class Felinos implements PuedeNadar, PuedeCaminar {
    @Override
    public void caminar(){
        System.out.println("El felino está caminando...");
    }

    @Override
    public void nadar(){
        System.out.println("El felino está nadando...");
    }
}
