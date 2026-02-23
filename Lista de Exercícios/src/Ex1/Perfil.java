package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Perfil {
    private String nome;
    private List<Filme> filmesAssistidos;
    private List<Series> seriesAssistidas;

    public Perfil(String nome) {
        this.nome = nome;
        this.filmesAssistidos = new ArrayList<>(); 
        this.seriesAssistidas = new ArrayList<>(); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Filme> getFilmesAssistidos() {
        return filmesAssistidos;
    }

    public void setFilmesAssistidos(List<Filme> filmesAssistidos) {
        this.filmesAssistidos = filmesAssistidos;
    }

    public List<Series> getSeriesAssistidas() {
        return seriesAssistidas;
    }

    public void setSeriesAssistidas(List<Series> seriesAssistidas) {
        this.seriesAssistidas = seriesAssistidas;
    }
    
    public void assistirFilme(Filme filme) {
        this.filmesAssistidos.add(filme);
    }
    
    public void assistirSerie(Series serie) {
        this.seriesAssistidas.add(serie);
    }
}