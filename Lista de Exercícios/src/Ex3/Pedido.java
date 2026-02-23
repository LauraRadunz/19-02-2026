package Ex3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private NotaFiscal notaFiscal;

    public Pedido(String codigoNota) {
        this.produtos = new ArrayList<>();
        this.notaFiscal = new NotaFiscal(codigoNota);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
}