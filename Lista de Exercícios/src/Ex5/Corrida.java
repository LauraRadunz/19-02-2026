package Ex5;

public class Corrida {
    private String origem;
    private String destino;
    private double valor;
    private Pagamento pagamento;

    public Corrida(String origem, String destino, double valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
        this.pagamento = new Pagamento(valor);
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}