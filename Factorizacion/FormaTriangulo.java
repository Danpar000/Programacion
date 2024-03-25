public class FormaTriangulo implements Forma{
    private double i;
    private double j;
    private double k;

    public FormaTriangulo(double i, double j, double k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }
    @Override
    public double calcularArea() {
        double aux = (i + j + k) /2;
        return Math.sqrt(aux*(aux-i)*(aux-j)*(aux-k));
    }

    @Override
    public double calcularPerimetro() {
        return i+j+k;
    }
}
