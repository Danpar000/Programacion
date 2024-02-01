public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);
        Forma rectangulo = new Rectangulo(20, 35);
        Forma esfera = new Esfera(15);
        Forma cilindro = new Cilindro(10, 30);

        System.out.println("Cantidad de pintura para Rectángulo: " + pintura.calcularPintura(rectangulo));
        System.out.println("Cantidad de pintura para Esfera: " + pintura.calcularPintura(esfera));
        System.out.println("Cantidad de pintura para Cilindro: " + pintura.calcularPintura(cilindro));
    }
}

// El polimorfismo se puede observar cuando llamamos a la función calcularPintura, la cual toma un objeto de tipo Forma y al tener polimorfismo puede recibir instancias de clases derivadas (Cilindro, Esfera, Rectángulo)
