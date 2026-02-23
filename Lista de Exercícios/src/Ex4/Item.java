package Ex4;

public class Item {
    private String nome;
    private boolean equipavel;

    public Item(String nome, boolean equipavel) {
        this.nome = nome;
        this.equipavel = equipavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEquipavel() {
        return equipavel;
    }

    public void setEquipavel(boolean equipavel) {
        this.equipavel = equipavel;
    }
}