public class EjercicioObjetos3 {

    public static void main(String[] args) {
        exercise3();
    }

    static void exercise3() {
        LibroManager manager = new LibroManager(5);

        manager.agregarLibro("978-1", "Clean Code", "Robert C. Martin", 464);
        manager.agregarLibro("978-2", "Effective Java", "Joshua Bloch", 416);

        Libro[] libros = manager.getLibros();

        if (libros.length == 0) {
            write("No hay libros que mostrar");
            return;
        }

        for (int i = 0; i < libros.length; i++) {
            write(libros[i].toString());
        }

        Libro mayor = manager.getLibroConMasPaginas();
        if (mayor != null) {
            write("El libro con más páginas es: " + mayor.getTitulo() + " (" + mayor.getNumeroPaginas() + ")");
        }
    }

    static void write(String s) {
        System.out.println(s);
    }
}

class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "El libro con ISBN " + isbn + ", creado por el autor " + autor + ", tiene " + numeroPaginas + " páginas.";
    }
}

class LibroManager {
    private Libro[] libros;
    private int contador;

    public LibroManager(int capacidad) {
        libros = new Libro[capacidad];
        contador = 0;
    }

    public boolean agregarLibro(String isbn, String titulo, String autor, int numeroPaginas) {
        if (contador >= libros.length) {
            return false;
        }
        if (isbn == null || titulo == null || autor == null || numeroPaginas <= 0) {
            return false;
        }

        libros[contador] = new Libro(isbn, titulo, autor, numeroPaginas);
        contador++;
        return true;
    }

    public Libro[] getLibros() {
        Libro[] result = new Libro[contador];
        for (int i = 0; i < contador; i++) {
            result[i] = libros[i];
        }
        return result;
    }

    public Libro getLibroConMasPaginas() {
        if (contador == 0) {
            return null;
        }

        Libro mayor = libros[0];
        for (int i = 1; i < contador; i++) {
            if (libros[i] != null && libros[i].getNumeroPaginas() > mayor.getNumeroPaginas()) {
                mayor = libros[i];
            }
        }
        return mayor;
    }
}
