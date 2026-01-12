package PracticaAcoplamientoCohesion;

public class Verificacion {
    static boolean verificar(String correo) {
        return correo.contains("@") && correo.contains(".");
    }
}
