import java.util.*;

public class Main {
    private static Map<Integer, Ubicacion> ubicaciones = new HashMap<>();

    public static void main(String[] args) {
        int index = 1;
        Scanner sc = new Scanner(System.in);
        String opcion;
        // Añadir ubicaciones
        ubicaciones.put(0, new Ubicacion(0, "Estás sentado en la clase de programación."));
        ubicaciones.put(1, new Ubicacion(1, "Estás en la cima de una Montaña."));
        ubicaciones.put(2, new Ubicacion(2, "Estás bañándote en la Playa"));
        ubicaciones.put(3, new Ubicacion(3, "Estás dentro de un Edificio muy alto"));
        ubicaciones.put(4, new Ubicacion(4, "Estás de pie en un Puente"));
        ubicaciones.put(5, new Ubicacion(5, "Estás en un Bosque"));
        // Montaña
        ubicaciones.get(1).addExit("N", 5);
        ubicaciones.get(1).addExit("S", 4);
        ubicaciones.get(1).addExit("E", 3);
        ubicaciones.get(1).addExit("O", 2);
        // Bosque
        ubicaciones.get(5).addExit("O", 2);
        ubicaciones.get(5).addExit("S", 1);
        // Puente
        ubicaciones.get(4).addExit("O", 2);
        ubicaciones.get(4).addExit("N", 1);
        // Playa
        ubicaciones.get(2).addExit("N", 5);
        ubicaciones.get(2).addExit("S", 4);
        ubicaciones.get(2).addExit("E", 1);
        // Edificio
        ubicaciones.get(3).addExit("O", 1);
        // Añadir salida a todo
        for (int i = 0; i< ubicaciones.size(); i++) {
            ubicaciones.get(i).addExit("Q", 0);
        }
        // Ver como muestro ubicaciones
        mapa();
        System.out.println(ubicaciones.get(index).getDescripcion());
        while (true) {
            String str = ubicaciones.get(index).getExits().toString().replaceAll("[^A-Za-z]+", ",");
            str = str.substring(1, str.length()-1);
            System.out.println("¿A dónde quieres ir? " + str);
            System.out.print("Opción: ");
            opcion = sc.next().toUpperCase();
            if (ubicaciones.get(index).getExits().containsKey(opcion) && Objects.equals(opcion, "Q")) {
                System.out.println("Adiós...");
                return;
            } else if (ubicaciones.get(index).getExits().containsKey(opcion)) {
                try {
                    index = ubicaciones.get(index).getExits().get(opcion);
                } catch (Exception e) {}
                mapa();
                System.out.println(ubicaciones.get(index).getDescripcion());
            } else {
                System.out.println("No puedes ir en esa dirección");
            }
        }
    }

    public static void mapa() {
        System.out.println();
        System.out.println(
                "                                                                                  |=================|                                " + "\n" +
                "                                                                                  |     BRÚJULA     |                                " + "\n" +
                        "                                        ################                          |=================|                                " + "\n" +
                        "       - - - - - - - - - - - - - - - -  #   5-Bosque   #                          |        N        |" + "\n" +
                        "       I                                ################                          |        ^        |                                 " + "\n" +
                        "       I                                        ^                                 |  O < - x - > E  | " + "\n" +
                        "       I                                        I                                 |        v        | " + "\n" +
                        "       I                                        I                                 |        S        | " + "\n" +
                        "       I                                        I                                 |=================| " + "\n" +
                        "       I                                        I                    " + "\n" +
                        "       V                                        V                   " + "\n" +
                        "################                        ################                        ################                   " + "\n" +
                        "#   2-Playa    # <--------------------> #  1-Montaña   # <--------------------> #  3-Edificio  #                                                             " + "\n" +
                        "################                        ################                        ################                   " + "\n" +
                        "       ^                                        ^                    " + "\n" +
                        "       I                                        I                    " + "\n" +
                        "       I                                        I                    " + "\n" +
                        "       I                                        I                    " + "\n" +
                        "       I                                        I                    " + "\n" +
                        "       I                                        I                    " + "\n" +
                        "       I                                        V                    " + "\n" +
                        "                                        ################            " + "\n" +
                        "       - - - - - - - - - - - - - - - -  #   4-Puente   #            " + "\n" +
                        "                                        ################            " + "\n"
        );
    }
}
