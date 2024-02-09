import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Act 4*/
        System.out.println("ACT 4");
        int lados;
        int ancho;
        int alto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de lados (3-4) ");
        lados = sc.nextInt();
        if (lados == 3) {
            System.out.println("Introduce el ancho del triángulo: ");
            ancho = sc.nextInt();
            System.out.println("Introduce el alto del triángulo: ");
            alto = sc.nextInt();
            Triangulo objeto = new Triangulo(lados, ancho, alto);
            System.out.println("El área del Triángulo es: " + objeto.getArea());
            System.out.println("El perímetro del Triángulo es: " + objeto.getPerimeter());
        } else if (lados == 4) {
            System.out.println("Introduce el ancho del rectángulo: ");
            ancho = sc.nextInt();
            System.out.println("Introduce el alto del rectángulo: ");
            alto = sc.nextInt();
            Rectangulo objeto = new Rectangulo(lados, ancho, alto);
            System.out.println("El área del Rectángulo es: " + objeto.getArea());
            System.out.println("El perímetro del Rectángulo es: " + objeto.getPerimeter());
        }

        /*Act 5*/
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("ACT 5");
        System.out.println("Antes");
        Rectangulo objeto2 = new Rectangulo(4, 2, 1);
        System.out.println("El área del Rectángulo es: " + objeto2.getArea());
        System.out.println("El perímetro del Rectángulo es: " + objeto2.getPerimeter());
        System.out.println("Después");
        objeto2.redimensionar(2);
        System.out.println("El área del Rectángulo es: " + objeto2.getArea());
        System.out.println("El perímetro del Rectángulo es: " + objeto2.getPerimeter());

        /*Act 6*/
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("ACT 6");
        Rectangulo[] rectanguloArray = {
                new Rectangulo(4, 3, 4),
                new Rectangulo(4, 1, 8),
                new Rectangulo(4, 6, 2),
                new Rectangulo(4, 5, 5),
                new Rectangulo(4, 2, 9),
                new Rectangulo(4, 7, 3),
                new Rectangulo(4, 4, 6),
                new Rectangulo(4, 9, 1),
                new Rectangulo(4, 8, 7),
                new Rectangulo(4, 10, 10)
        };
        Arrays.sort(rectanguloArray);
        for (Rectangulo rectangulo : rectanguloArray) {
            System.out.println(rectangulo);
        }

        /*Act 7*/
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("ACT 7");
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Patri", 12, 170));
        estudiantes.add(new Estudiante("Manuel", 43, 173));
        estudiantes.add(new Estudiante("Javier", 72, 189));
        estudiantes.add(new Estudiante("Alicia", 52, 168));
        estudiantes.add(new Estudiante("Alberto", 35, 189));

        System.out.println("Estudiantes sin ordenar:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }

        Collections.sort(estudiantes);

        System.out.println("\nEstudiantes ordenados:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
    }
}
