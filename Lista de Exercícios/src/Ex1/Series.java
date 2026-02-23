package Ex1;

import java.util.ArrayList; 
import java.util.List;

public class Series {
    private String nome;
    private String diretor;
    private String elenco;
    private List<Episodio> episodios;
    
    public Series(String nome, String diretor, String elenco) {
        this.nome = nome;
        this.diretor = diretor;
        this.elenco = elenco;
        this.episodios = new ArrayList<>(); 
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }
    
    public void adicionarEpisodio(Episodio episodio) {
        this.episodios.add(episodio);
    }
}