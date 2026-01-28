package Ejercicio2_UML;

public class Ambulancia implements Automovil{
    public void encenderSirena(){
        System.out.println("Sirena encendida");
    }

    @Override
    public void pintar(){
        System.out.println("Ambulancia pintada");
    }
}
