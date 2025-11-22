package uni1a;

import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {

    private String creador;
    private ArrayList<Temporada> temporadas = new ArrayList<>();


    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, String creador) {
        super(titulo, duracionEnMinutos, genero);
        this.creador = creador;
    }

    // Crear temporada (composición)
    public void crearTemporada(int numero, int cantidadEpisodios) {
        Temporada t = new Temporada(this, numero, cantidadEpisodios);
        temporadas.add(t);
    }

    public void mostrarDetalles() {
        System.out.println("Serie: " + getTitulo());
        System.out.println("Creador: " + creador);
        System.out.println("Género: " + getGenero());
        System.out.println("Duración promedio: " + getDuracionEnMinutos() + " min");
        System.out.println("Temporadas:");
        for (Temporada t : temporadas) {
            System.out.println(" - Temporada " + t.getNumero() + " (" + t.getNumEpisodios() + " episodios)");
        }
    }
}
