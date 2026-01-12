package PracticaAcoplamientoCohesion;

public class Main {
    public static void main(String[] args) {
        IOManager.write("Ingrese su correo");
        String correo = IOManager.read();

        RegistroUsuario registro = new RegistroUsuario(correo);
        RecuperacionCuenta recuperacion = new RecuperacionCuenta(correo);

        registro.registrar(correo);
        recuperacion.recuperar(correo);
    }
}