package Ex4;

public class Personagem {
    private String nome;
    private Inventario inventario;

    public Personagem(String nome) {
        this.nome = nome;
        this.inventario = new Inventario();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
}