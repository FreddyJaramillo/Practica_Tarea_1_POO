package uni1a;

public class Main {
    public static void main(String[] args) {

        // Película y actores
        Pelicula peli = new Pelicula("La Aventura", 120, "Acción", "Carlos Ruiz");
        Actor a1 = new Actor("Juan Pérez", 30, "Ecuador");
        Actor a2 = new Actor("Ana Torres", 27, "México");
        peli.agregarActor(a1);
        peli.agregarActor(a2);

        // Serie y temporadas
        SerieDeTV serie = new SerieDeTV("Naturaleza Salvaje", 45, "Documental", "David Álvarez");
        serie.crearTemporada(1, 6);
        serie.crearTemporada(2, 8);
        serie.mostrarDetalles();


        // Documental e investigadores
        Documental doc = new Documental("El Universo", 90, "Ciencia", "Astronomía");
        Investigador inv1 = new Investigador("Dra. Sofía Vega", "NASA", "Astrofísica");
        Investigador inv2 = new Investigador("Dr. Tomás Medina", "ESA", "Cosmología");
        doc.agregarInvestigador(inv1);
        doc.agregarInvestigador(inv2);

        // Video YouTube
        VideoYouTube video = new VideoYouTube("Aprende Matematicas", 10, "Educación", "FreddyJaramillo123", 500);
        video.darLike();

        // Cortometraje
        Cortometraje corto = new Cortometraje("Luz Nocturna", 22, "Drama", true);
        corto.setPremio("Mejor Corto 2023");

        // Mostrar información
        peli.mostrarDetalles();
        System.out.println();
        serie.mostrarDetalles();
        System.out.println();
        doc.mostrarDetalles();
        System.out.println();
        video.mostrarDetalles();
        System.out.println();
        corto.mostrarDetalles();
    }
}
