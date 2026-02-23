package Ex4;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Item> itens;

    public Inventario() {
        this.itens = new ArrayList<>();
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }
}