package PracticaAcoplamientoCohesion;

public class RegistroUsuario {
    private String correo;

    public RegistroUsuario() {
    }

    public RegistroUsuario(String correo) {
        this.correo = correo;
    }

    void registrar(String correo) {
        System.out.println(Verificacion.verificar(correo)
                ? "Correo registrado exitosamente"
                : "Correo inválido");
    }
}
