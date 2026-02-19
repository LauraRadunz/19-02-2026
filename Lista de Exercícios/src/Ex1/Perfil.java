package Ex1;

import java.util.List;

public class Perfil {
    private String nome;
    private List <Filme> filmesAssistidos;

    public Perfil(String nome, List<Filme> filmesAssistidos) {
        this.nome = nome;
        this.filmesAssistidos = filmesAssistidos;
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
      
}
