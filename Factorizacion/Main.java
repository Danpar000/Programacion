import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        FormaFactory formaFactory = new FormaFactory();
        Scanner formaTipo = new Scanner(System.in);
        for (int i = 0; i==0;) {
            try {
                System.out.println("Selecciona el tipo de figura: ");
                System.out.println("1. Círculo");
                System.out.println("2. Rectángulo");
                System.out.println("3. Triángulo");
                System.out.println("4. Salir");
                System.out.println();
                System.out.print("Opción: ");
                double tipo = formaTipo.nextDouble();
                double aux;
                double aux1;
                Forma forma = null;
                if (tipo == 1) {
                    System.out.print("Introduce el radio: ");
                    tipo = formaTipo.nextDouble();
                    forma = formaFactory.obtenerForma(TipoForma.Circulo, tipo);
                } else if (tipo == 2) {
                    System.out.print("Introduce el lado A: ");
                    tipo = formaTipo.nextDouble();
                    System.out.print("Introduce el lado B: ");
                    aux = formaTipo.nextDouble();
                    forma = formaFactory.obtenerForma(TipoForma.Rectangulo, tipo, aux);
                } else if (tipo == 3) {
                    System.out.print("Introduce el lado A: ");
                    tipo = formaTipo.nextDouble();
                    System.out.print("Introduce el lado B: ");
                    aux = formaTipo.nextDouble();
                    System.out.print("Introduce el lado C: ");
                    aux1 = formaTipo.nextDouble();
                    forma = formaFactory.obtenerForma(TipoForma.Triangulo, tipo, aux, aux1);
                } else if (tipo == 4) {
                    System.out.println("Hasta luego.");
                    i++;
                }
                if (i==0) {
                    System.out.println("El área del objeto es: " + forma.calcularArea());
                    System.out.println("El perímetro del objeto es: " + forma.calcularPerimetro());
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println();
                System.out.println("Argumento inválido, vuelve a intentarlo.");
                formaTipo.nextLine();
            }
        }
    }
}
