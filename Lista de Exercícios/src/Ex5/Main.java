package Ex5;

public class Main {
    public static void main(String[] args) {
        Passageiro passageiro = new Passageiro("Maria");
        Motorista motorista = new Motorista("Carlos");

        Corrida corrida1 = new Corrida("Centro", "Aeroporto", 45.50);
        
        passageiro.solicitarCorrida(corrida1);
        motorista.adicionarCorrida(corrida1);

        System.out.println("--- CORRIDAS DO PASSAGEIRO: " + passageiro.getNome() + " ---");
        for (Corrida c : passageiro.getHistoricoCorridas()) {
            System.out.println("De: " + c.getOrigem() + " | Para: " + c.getDestino());
        }

        System.out.println("\n--- CORRIDAS DO MOTORISTA: " + motorista.getNome() + " ---");
        for (Corrida c : motorista.getHistoricoCorridas()) {
            System.out.println("De: " + c.getOrigem() + " | Para: " + c.getDestino());
        }

        System.out.println("\n--- PAGAMENTO DA CORRIDA ---");
        Corrida corridaRealizada = passageiro.getHistoricoCorridas().getFirst();
        System.out.println("Valor processado no pagamento: R$ " + corridaRealizada.getPagamento().getValor());
    }
}