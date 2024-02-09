public class Rectangulo extends Forma implements Redimensionable, Comparable<Rectangulo>{
    private int ancho;
    private int alto;

    public Rectangulo(int numlados, int ancho, int alto){
        super(numlados);
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getArea() {
        return alto*ancho;
    }

    public int getPerimeter() {
        return (alto*2)+(ancho*2);
    }

    @Override
    public int compareTo(Rectangulo RectanguloB) {
        double areaA = this.getArea();
        double areaB = RectanguloB.getArea();
        if (areaA < areaB) {
            return -1;
        } else if (areaA > areaB) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void redimensionar(int x) {
        this.ancho *= x;
        this.alto *= x;
    }

    @Override
    public String toString() {
        return "Rectangulo [Ancho=" + ancho + ", Alto=" + alto + ", Área=" + getArea() + "]";
    }
}
