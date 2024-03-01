import java.util.*;
public class Main {
    public static void play(LinkedList<Cancion> lista) {
        Scanner sc = new Scanner(System.in);
        ListIterator<Cancion> it = lista.listIterator();
        int opcion;
        int index = 0;
        boolean direccion = true;
        System.out.println("Hola, elige una de las opciones: ");
        menu();
        for (boolean i = true; i; ) {
            System.out.print("\nOpción: ");
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 0:
                        i = false;
                        System.out.println("Saliendo...");
                        break;
                    case 1:
                        if (index<lista.size()-1) {
                            index++;
                            it.next();
                            it.next();
                            System.out.println("¿Estoy yendo hacia delante? " + direccion);
                            System.out.println("Estoy escuchando - " + it.previous());
                        } else {
                            System.out.println("Estoy en el final de la playlist");
                        }
                        break;
                    case 2:
                        if (!it.hasPrevious()) {
                            System.out.println("Estoy en el principio de la playlist");
                        } else {
                            index--;
                            it.previous();
                            direccion=false;
                            System.out.println("¿Estoy yendo hacia delante? " + direccion);
                            System.out.println("Estoy escuchando - " + it.next());
                            it.previous();
                        }
                        break;
                    case 3:
                        if (it.hasNext() || index==0) {
                            it.next();
                            System.out.println("Estoy repitiendo - " + lista.get(index));
                            it.previous();
                        } else if (it.hasPrevious()) {
                            it.previous();
                            System.out.println("Estoy repitiendo - " + lista.get(index));
                            it.next();
                        }
                        break;
                    case 4:
                        lista.sort(Comparator.comparing(Cancion::getTitulo));
                        imprimirPlaylist(lista);
                        break;
                    case 5:
                        menu();
                        break;
                    case 6:
                        if (index==0) {
                            System.out.println("La canción " + lista.get(index).getTitulo() + " fue eliminada con éxito.");
                            it.next();
                            it.remove();
                        } else if (it.hasNext() && index!=lista.size()-1) {
                            System.out.println("La canción " + lista.get(index).getTitulo() + " fue eliminada con éxito.");
                            it.next();
                            it.remove();
                        } else if (index==lista.size()-1) {
                            System.out.println("La canción " + lista.get(index).getTitulo() + " fue eliminada con éxito.");
                            it.next();
                            it.remove();
                            it.previous();
                            index--;
                        }
                        if (index==lista.size()) {
                            System.out.println("Ya no hay más canciones para reproducir");
                        } else {
                            System.out.println("Ahora escuchando - " + lista.get(index));
                        }
                        break;
                    default:
                        System.out.println("Opción equivocada, vuelve a intentarlo.");
                }
            } catch (Exception e) {
                System.out.println("Opción equivocada, vuelve a intentarlo.");
                sc.nextLine();
            }
        }

    }

    public static void imprimirPlaylist(LinkedList<Cancion> lista) {
        ListIterator<Cancion> it = lista.listIterator();
        System.out.println();
        System.out.println("Esta es tu lista de reproducción:");
        while (it.hasNext()) {
            System.out.println(lista.get(it.nextIndex()));
            it.next();
        }
    }

    public static void menu() {
        System.out.println("\n0 - Salir de la lista de reproducción");
        System.out.println("1 - Reproducir siguiente canción en la lista");
        System.out.println("2 - Reproducir la canción previa de la lista");
        System.out.println("3 - Repetir la canción actual");
        System.out.println("4 - Imprimir la lista de canciones en la playlist");
        System.out.println("5 - Volver a imprimir el menú");
    }

    public static void main(String[] args) {
        ArrayList<Album> albumes = new ArrayList<>();
        LinkedList<Cancion> playlist = new LinkedList<Cancion>();
        try {
            albumes.add(new Album("The Best of Crush 40", "Crush 40"));
            albumes.add(new Album("UTSU-P's Recap", "UTSU-P"));
            albumes.get(0).addSong("All Hail Shadow", 300);
            albumes.get(0).addSong("All Hail Shadow", 300);
            albumes.get(0).addSong("KNIGHT OF THE WIND", 120);
            albumes.get(0).addSong("WITH ME", 270);
            albumes.get(0).addSong("Live & Learn", 90);
            albumes.get(0).addSong("Open Your Heart", 115);
            albumes.get(1).addSong("Corpse Attack!", 120);
            albumes.get(1).addSong("Vermin", 90);
            albumes.get(1).addSong("Corona - PTSD Edition", 90);
            albumes.get(1).addSong("Imperfect Animals", 90);
            albumes.get(1).addSong("Imperfect Animals", 90);
            albumes.get(0).addToPlaylist(50, playlist);
            albumes.get(0).addToPlaylist(0, playlist);
            albumes.get(0).addToPlaylist(0, playlist);
            albumes.get(1).addToPlaylist(1, playlist);
            albumes.get(1).addToPlaylist(1, playlist);
            albumes.get(1).addToPlaylist(1, playlist);
            albumes.get(1).addToPlaylist(3, playlist);
            albumes.get(1).addToPlaylist(2, playlist);
            albumes.get(0).anotherAddToPlayList("Live & Learn", playlist);
            albumes.get(1).anotherAddToPlayList("Imperfect Animals", playlist);
            albumes.get(1).anotherAddToPlayList("Corona - PTSD Edition", playlist);
            albumes.get(1).anotherAddToPlayList("Corona - PTSD Edition", playlist);
            albumes.get(1).anotherAddToPlayList("WITH ME", playlist);
            albumes.get(0).anotherAddToPlayList("WITH ME", playlist);
            albumes.get(0).addToPlaylist(1, playlist);
            albumes.get(0).addToPlaylist(1, playlist);
            albumes.get(4).addToPlaylist(1, playlist);
            play(playlist);
        } catch (Exception e) {
            System.out.println();
            play(playlist);
        }
    }
}
