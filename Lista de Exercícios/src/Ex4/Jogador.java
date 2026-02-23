package Ex4;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Personagem> personagens;

    public Jogador(String nome) {
        this.nome = nome;
        this.personagens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    public void criarPersonagem(Personagem personagem) {
        this.personagens.add(personagem);
    }
}