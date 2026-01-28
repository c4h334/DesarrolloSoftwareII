package Ejercicio1_UML;

public class Mamiferos implements PuedeCaminar{
    private String especie;
    private String color;

    @Override
    public void caminar(){
        System.out.println("EL mamífero está caminando...");
    }

}
