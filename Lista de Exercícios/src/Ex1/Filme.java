package Ex1;

public class Filme {
    private String nome;
    private String diretor;
    private String elenco;
    
    public Filme(String nome, String diretor, String elenco) {
        this.nome = nome;
        this.diretor = diretor;
        this.elenco = elenco;
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
}