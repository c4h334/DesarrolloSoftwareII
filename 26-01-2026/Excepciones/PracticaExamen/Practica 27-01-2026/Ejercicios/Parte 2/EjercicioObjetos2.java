public class EjercicioObjetos2 {

    public static void main(String[] args) {
        exercise2();
    }

    static void exercise2() {
        Producto[] productos = new Producto[3];
        productos[0] = new Producto("Pan", 650.0);
        productos[1] = new Producto("Leche", 900.0);
        productos[2] = new Producto("Arroz", 1400.0);

        write("Digite el nombre del producto a buscar");
        String nombre = (String) read();

        Producto encontrado = buscarProducto(productos, nombre);

        if (encontrado == null) {
            write("Producto no encontrado");
        } else {
            write(encontrado.getNombre() + " - " + encontrado.getPrecio());
        }
    }

    static Producto buscarProducto(Producto[] productos, String nombre) {
        if (productos == null || nombre == null) {
            return null;
        }

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].getNombre() != null
                    && productos[i].getNombre().equalsIgnoreCase(nombre)) {
                return productos[i];
            }
        }
        return null;
    }

    static void write(String s) {
        System.out.println(s);
    }

    static Object read() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        return sc.nextLine();
    }
}

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
