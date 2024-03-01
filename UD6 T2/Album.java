import java.util.*;

public class Album {
    private String nombre;
    private String artista;
    private ArrayList<Cancion> canciones = new ArrayList<>();

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    private Cancion findSong (String titulo) {
        for (int i = 0; i<canciones.size(); i++) {
            if (canciones.get(i).getTitulo().equals(titulo)) {
                return canciones.get(i);
            }
        }
        return null;
    }

    public boolean addSong (String titulo, double duracion) {
        if (findSong(titulo) != null) {
            return false;
        } else {
            canciones.add(new Cancion(titulo, duracion));
            return true;
        }
    }

    public boolean addToPlaylist (int numPista, LinkedList<Cancion> listaReproduccion){
        if (numPista>canciones.size()) {
            return false;
        } else {
            ListIterator<Cancion> it = listaReproduccion.listIterator();
            if (!it.hasNext()) {
                listaReproduccion.add(canciones.get(numPista));
            } else {
                while (it.hasNext()) {
                    String comparar = it.next().getTitulo();
                    if (comparar == canciones.get(numPista).getTitulo()){
                        return false;
                    }
                }
                listaReproduccion.add(canciones.get(numPista));
            }
            return true;
        }
    }



    public boolean anotherAddToPlayList (String titulo, LinkedList<Cancion> listaReproduccion) {
        if (findSong(titulo) == null) {
            return false;
        } else {
            ListIterator<Cancion> it = listaReproduccion.listIterator();
            if (!it.hasNext()) {
                listaReproduccion.add(findSong(titulo));
            } else {
                while (it.hasNext() == true) {
                    String comparar = it.next().getTitulo();
                    if (comparar == titulo) {
                        return false;
                    }
                }
                listaReproduccion.add(findSong(titulo));
            }
            return true;
        }
    }
}
