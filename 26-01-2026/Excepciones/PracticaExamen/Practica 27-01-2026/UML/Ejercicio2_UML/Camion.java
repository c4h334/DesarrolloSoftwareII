package Ejercicio2_UML;

public class Camion implements Automovil {
    private boolean esta_cargado;

     @Override
    public void pintar(){
        System.out.println("Camión pintado");
    }
}
