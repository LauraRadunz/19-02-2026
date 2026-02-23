package Ex3;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Pedido> historicoPedidos;

    public Cliente(String nome) {
        this.nome = nome;
        this.historicoPedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pedido> getHistoricoPedidos() {
        return historicoPedidos;
    }

    public void setHistoricoPedidos(List<Pedido> historicoPedidos) {
        this.historicoPedidos = historicoPedidos;
    }

    public void fazerPedido(Pedido pedido) {
        this.historicoPedidos.add(pedido);
    }
}