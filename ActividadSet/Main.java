import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static Map <String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    static Set<CuerpoCeleste> planetas = new HashSet<>();
    public static void main(String[] args) {
        // Ejercicio I, II
        Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
        CuerpoCeleste a1 = new CuerpoCeleste("Mercurio", 88, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste a2 = new CuerpoCeleste("Venus", 225, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste a3 = new CuerpoCeleste("La Tierra", 365, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste a4 = new CuerpoCeleste("Marte", 687, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste a5 = new CuerpoCeleste("Jupiter", 4332, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste a6 = new CuerpoCeleste("Saturno", 10759, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste a7 = new CuerpoCeleste("Urano", 30660, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste a8 = new CuerpoCeleste("Neptuno", 165, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste a9 = new CuerpoCeleste("Pluton", 248, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Mercurio", a1);
        sistemaSolar.put("Venus", a2);
        sistemaSolar.put("La Tierra", a3);
        sistemaSolar.put("Marte", a4);
        sistemaSolar.put("Jupiter", a5);
        sistemaSolar.put("Saturno", a6);
        sistemaSolar.put("Urano", a7);
        sistemaSolar.put("Neptuno", a8);
        sistemaSolar.put("Plutón", a9);
        planetas.add(a1);
        planetas.add(a2);
        planetas.add(a3);
        planetas.add(a4);
        planetas.add(a5);
        planetas.add(a6);
        planetas.add(a7);
        planetas.add(a8);
        planetas.add(a9);

        // Ejercicio III, IV, V
        CuerpoCeleste b1 = new CuerpoCeleste("Luna sin nombre", 27, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste b2 = new CuerpoCeleste("Deimos", 1.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste b3 = new CuerpoCeleste("Phobos", 0.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste b4 = new CuerpoCeleste("Io", 1.8, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste b5 = new CuerpoCeleste("Europa", 3.5, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste b6 = new CuerpoCeleste("Ganymede", 7.1, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste b7 = new CuerpoCeleste("Callisto", 16.7, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Luna sin nombre", b1);
        sistemaSolar.put("Deimos", b2);
        sistemaSolar.put("Phobos", b3);
        sistemaSolar.put("Io", b4);
        sistemaSolar.put("Europa", b5);
        sistemaSolar.put("Ganymede", b6);
        sistemaSolar.put("Callisto", b7);
        a3.addSatelite(b1);
        a4.addSatelite(b2);
        a4.addSatelite(b3);
        a5.addSatelite(b4);
        a5.addSatelite(b5);
        a5.addSatelite(b6);
        a5.addSatelite(b7);

        // Ejercicio VI
        System.out.println("- Ejercicio VI -");
        System.out.println("\nConjunto Planetas:");
        for (CuerpoCeleste cc: planetas) {
            System.out.println(cc);
        }

        // Ejercicio VII
        System.out.println("\n- Ejercicio VII -");
        System.out.println("\nLunas de Marte:");
        System.out.println(sistemaSolar.get("Marte").getSatelites());

        // Ejercicio VIII, IX
        System.out.println();
        System.out.println("\n- Ejercicio VIII, IX -");
        System.out.println("\nUnión lunas:");
        Set<CuerpoCeleste> lunas = new HashSet<>();
        for (CuerpoCeleste cc: planetas) {
            lunas.addAll(cc.getSatelites());
        }
        for (CuerpoCeleste cc: lunas) {
            System.out.println(cc);
        }

        // Ejercicio X, XI
        System.out.println("\n- Ejercicio X -");
        System.out.println("\n¿Se añade el planeta plutón?");
        CuerpoCeleste pluton884 = new CuerpoCeleste("Pluton", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        planetas.add(pluton884);
        for (CuerpoCeleste cc: planetas) {
            System.out.println(cc.toString());
        }
        System.out.println("\nNO SE AÑADE - Al tener el mismo nombre y ser del mismo tipo tienen el mismo HashCode y por eso no se añade.");
        System.out.println("Si lo creamos como planeta enano entonces se añade por ser de distinto tipo.\n");
        CuerpoCeleste pluton8842 = new CuerpoCeleste("Pluton", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA_ENANO);
        planetas.add(pluton8842);
        for (CuerpoCeleste cc: planetas) {
            System.out.println(cc.toString());
        }

        // Ejercicio XII
        System.out.println("\n- Ejercicio XI -");
        System.out.println("\nCrearé un nuevo HashSet con el listado de los planetas y los satélites y usaré las funciones sobre el listado.");
        System.out.println("Si utilizamos la DIFERENCIA del set, comparando el listado con las lunas, nos quedarían únicamente los planetas");
        Set<CuerpoCeleste> listado = new HashSet<>();
        listado.add(a1);
        listado.add(a2);
        listado.add(a3);
        listado.add(a4);
        listado.add(a5);
        listado.add(a6);
        listado.add(a7);
        listado.add(a8);
        listado.add(a9);
        listado.add(b1);
        listado.add(b2);
        listado.add(b3);
        listado.add(b4);
        listado.add(b5);
        listado.add(b6);
        listado.add(b7);
        listado.add(pluton8842);

        System.out.println("\n-------- ANTES --------");
        for (CuerpoCeleste cc: listado) {
            System.out.println(cc);
        }
        System.out.println("-------------------------");
        listado.removeAll(lunas);

        System.out.println("\n-------- DESPUÉS --------");
        for (CuerpoCeleste cc: listado) {
            System.out.println(cc);
        }
        System.out.println("-------------------------");

        System.out.println("\n Y si quiero hacer la INTERSECCIÓN, únicamente quedarían los planetas");
        System.out.println("porque son los datos en común que hay entre los dos conjuntos.");

        listado.addAll(lunas); // Vuelvo a añadir para hacer la prueba

        System.out.println("\n-------- ANTES --------");
        for (CuerpoCeleste cc: listado) {
            System.out.println(cc);
        }
        System.out.println("-------------------------");
        listado.retainAll(planetas);

        System.out.println("\n-------- DESPUÉS --------");
        for (CuerpoCeleste cc: listado) {
            System.out.println(cc);
        }
        System.out.println("-------------------------");
    }
}
