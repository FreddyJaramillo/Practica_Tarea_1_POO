package uni1a;

public class Cortometraje extends ContenidoAudiovisual {

    private boolean seleccionadoFestival;
    private String premio;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, boolean seleccionadoFestival) {
        super(titulo, duracionEnMinutos, genero);
        this.seleccionadoFestival = seleccionadoFestival;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public void mostrarDetalles() {
        System.out.println("Cortometraje: " + getTitulo() +
                ", Duración: " + getDuracionEnMinutos() +
                " min, Género: " + getGenero() +
                ", Seleccionado en Festival: " + seleccionadoFestival);

        if (premio != null) {
            System.out.println("Premio recibido: " + premio);
        }
    }
}
