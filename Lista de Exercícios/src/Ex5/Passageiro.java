package Ex5;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    private String nome;
    private List<Corrida> historicoCorridas;

    public Passageiro(String nome) {
        this.nome = nome;
        this.historicoCorridas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Corrida> getHistoricoCorridas() {
        return historicoCorridas;
    }

    public void setHistoricoCorridas(List<Corrida> historicoCorridas) {
        this.historicoCorridas = historicoCorridas;
    }

    public void solicitarCorrida(Corrida corrida) {
        this.historicoCorridas.add(corrida);
    }
}