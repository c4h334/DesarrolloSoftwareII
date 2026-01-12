package PracticaAcoplamientoCohesion;

public class RecuperacionCuenta {

    private String correo;

    public RecuperacionCuenta() {
    }

    public RecuperacionCuenta(String correo) {
        this.correo = correo;
    }

    void recuperar(String recuperar) {
        System.out.println(Verificacion.verificar(correo)
                ? "Correo recuperado exitosamente"
                : "Correo inválido");
    }
}
