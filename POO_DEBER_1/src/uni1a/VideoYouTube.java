package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {

    private String canal;
    private int likes;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String canal, int likes) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.likes = likes;
    }

    public void darLike() {
        likes++;
    }

    public void mostrarDetalles() {
        System.out.println("VideoYouTube: " + getTitulo() +
                ", Duración: " + getDuracionEnMinutos() +
                " min, Género: " + getGenero() +
                ", Canal: " + canal +
                ", Likes: " + likes);
    }
}
