package uni1a;

public class Temporada {

    private SerieDeTV serie;
    private int numero;
    private int numEpisodios;

    public Temporada(SerieDeTV serie, int numero, int numEpisodios) {
        this.serie = serie;
        this.numero = numero;
        this.numEpisodios = numEpisodios;
    }

    public int getNumero() { 
        return numero; 
    }

    public int getNumEpisodios() { 
        return numEpisodios; 
    }
}
