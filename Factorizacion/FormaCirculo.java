public class FormaCirculo implements Forma{
    private double i;


    public FormaCirculo(double i) {
        this.i = i;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(i, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * i;
    }

}
