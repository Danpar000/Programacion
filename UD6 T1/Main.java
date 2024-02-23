import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TelefonoMovil telefonoMovil = new TelefonoMovil("");

        int opcion;
        do {
            System.out.println("Opciones:");
            System.out.println("0) Salir.");
            System.out.println("1) Imprimir contactos.");
            System.out.println("2) Agregar nuevo contacto.");
            System.out.println("3) Actualizar contacto existente.");
            System.out.println("4) Eliminar contacto.");
            System.out.println("5) Buscar contacto por nombre.");
            System.out.println("6) Volver a imprimir la lista de opciones.");

            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    telefonoMovil.printContacts();
                    break;
                case 2:
                    System.out.print("Ingresa el nombre del nuevo contacto: ");
                    String nuevoNombre = sc.next();
                    System.out.print("Ingresa el número de teléfono del nuevo contacto: ");
                    String nuevoNumero = sc.next();
                    Contacto nuevoContacto = Contacto.createContact(nuevoNombre, nuevoNumero);

                    if (telefonoMovil.addNewContact(nuevoContacto)) {
                        System.out.println("Contacto añadido con éxito.");
                    } else {
                        System.out.println("Error: El contacto ya existe.");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa el nombre del contacto a actualizar: ");
                    String nombreAntiguo = sc.next();
                    Contacto antiguoContacto = telefonoMovil.queryContact(nombreAntiguo);

                    if (antiguoContacto != null) {
                        System.out.print("Ingresa el nuevo nombre del contacto: ");
                        String actualizarNombre = sc.next();
                        System.out.print("Ingresa el nuevo número de teléfono del contacto: ");
                        String actualizarNumero = sc.next();
                        Contacto actualizarContacto = Contacto.createContact(actualizarNombre, actualizarNumero);

                        if (telefonoMovil.updateContact(antiguoContacto, actualizarContacto)) {
                            System.out.println("Contacto actualizado con éxito.");
                        } else {
                            System.out.println("Error: El nuevo contacto ya existe.");
                        }
                    } else {
                        System.out.println("Error: El contacto no existe.");
                    }
                    break;
                case 4:
                    System.out.print("Ingresa el nombre del contacto a borrar: ");
                    String nombreEliminar = sc.next();
                    Contacto contactoEliminar = telefonoMovil.queryContact(nombreEliminar);

                    if (contactoEliminar != null) {
                        if (telefonoMovil.removeContact(contactoEliminar)) {
                            System.out.println("Contacto eliminado con éxito.");
                        } else {
                            System.out.println("Error: No se pudo eliminar el contacto.");
                        }
                    } else {
                        System.out.println("Error: El contacto no existe.");
                    }
                    break;
                case 5:
                    System.out.print("Ingresa el nombre del contacto a buscar: ");
                    String nombreBuscar = sc.next();
                    Contacto contactoEncontrado = telefonoMovil.queryContact(nombreBuscar);

                    if (contactoEncontrado != null) {
                        System.out.println("Contacto encontrado: " + contactoEncontrado.getName() + " -> " + contactoEncontrado.getPhoneNumber());
                    } else {
                        System.out.println("Error: El contacto no existe.");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);
    }
}
