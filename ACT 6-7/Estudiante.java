class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private int edad;
    private int altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public int compareTo(Estudiante EstudianteB) {
        int compararAltura = Integer.compare(EstudianteB.altura, this.altura);

        if (compararAltura == 0) {
            return Integer.compare(this.edad, EstudianteB.edad);
        }
        return compararAltura;
    }

    @Override
    public String toString() {
        return nombre + " - Altura: " + altura + " - Edad: " + edad;
    }
}
