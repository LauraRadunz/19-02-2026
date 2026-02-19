package Ex1;

public class Episodio {
    private String nome;
    private String diretor;
    private String elenco;
    private int duracao;

    public Episodio(String nome, String diretor, String elenco, int duracao) {
        this.nome = nome;
        this.diretor = diretor;
        this.elenco = elenco;
        this.duracao = duracao;
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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
