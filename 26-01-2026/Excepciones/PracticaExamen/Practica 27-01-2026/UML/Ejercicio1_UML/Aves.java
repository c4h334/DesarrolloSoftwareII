package Ejercicio1_UML;

public class Aves implements PuedeCaminar, PuedeVolar{
    private String especie;
    private String color;

    @Override
    public void caminar(){
        System.out.println("El ave está caminando...");
    }

    @Override
    public void volar(){
        System.out.println("El ave está volando");
    }

}
