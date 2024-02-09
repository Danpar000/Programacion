public class Triangulo extends Forma{
    private int ancho;
    private int alto;
    public Triangulo(int numLados, int ancho, int alto) {
        super(numLados);
        this.ancho = ancho;
        this.alto = alto;
    }
    public int getArea() {
        return (alto*ancho)/2;
    }
    public int getPerimeter() {
        return (alto*2)+ancho;
    }
}
