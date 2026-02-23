package Ex3;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("Tech Computadores");
        Produto produto1 = new Produto("Notebook", fornecedor1);
        
        Pedido pedido1 = new Pedido("NF-12345");
        pedido1.adicionarProduto(produto1);

        Cliente cliente1 = new Cliente("Roberto");
        cliente1.fazerPedido(pedido1);

        System.out.println("--- PEDIDOS DO CLIENTE ---");
        System.out.println("Cliente: " + cliente1.getNome());

        for (Pedido p : cliente1.getHistoricoPedidos()) {
            System.out.println("\nNota Fiscal do Pedido: " + p.getNotaFiscal().getCodigo());
            
            System.out.println("Produtos do Pedido:");
            for (Produto prod : p.getProdutos()) {
                System.out.println("- " + prod.getNome() + " (Fornecedor: " + prod.getFornecedor().getNome() + ")");
            }
        }
    }
}