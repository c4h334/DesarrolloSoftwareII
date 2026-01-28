public class EjercicioObjetos1 {

    public static void main(String[] args) {
        exercise1();
    }

    static void exercise1() {
        Carro[] carros = new Carro[4];
        carros[0] = new Carro("Toyota");
        carros[1] = new Carro("Honda");
        carros[2] = new Carro("Nissan");
        carros[3] = new Carro("Hyundai");

        for (Carro carro : carros) {
            write(carro.getMarca());
        }
    }

    static void write(String s) {
        System.out.println(s);
    }
}

class Carro {
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
