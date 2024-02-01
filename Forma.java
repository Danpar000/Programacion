public class Forma {

    private String nombre = "";

    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public Forma(String nombre) {
        this.nombre = nombre;
    }
}
