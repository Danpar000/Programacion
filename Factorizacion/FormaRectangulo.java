public class FormaRectangulo implements Forma{
    private double i;
    private double j;

    public FormaRectangulo(double i, double j) {
        this.i = i;
        this.j = j;
    }



    @Override
    public double calcularArea() {
        return i * j;
    }

    @Override
    public double calcularPerimetro() {
        return (2*i) + (2*j);
    }

}

