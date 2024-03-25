public class FormaFactory {
    public Forma obtenerForma(TipoForma tipoForma, double... args) {
        if (tipoForma==TipoForma.Triangulo) {
            return new FormaTriangulo(args[0], args[1], args[2]);
        } else if (tipoForma==TipoForma.Circulo) {
            return new FormaCirculo(args[0]);
        } else if (tipoForma==TipoForma.Rectangulo) {
            return new FormaRectangulo(args[0], args[1]);
        }
        return null;
    }
}
