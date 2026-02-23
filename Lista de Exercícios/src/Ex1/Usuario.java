package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private List<Perfil> perfis;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.perfis = new ArrayList<>(); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Perfil> getPerfis() {
        return perfis;
    }

    public void adicionarPerfil(Perfil perfil) {
        this.perfis.add(perfil);
    }
}