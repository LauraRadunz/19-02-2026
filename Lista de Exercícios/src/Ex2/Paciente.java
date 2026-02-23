package Ex2;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private List<Consulta> historicoConsultas;

    public Paciente(String nome) {
        this.nome = nome;
        this.historicoConsultas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Consulta> getHistoricoConsultas() {
        return historicoConsultas;
    }

    public void setHistoricoConsultas(List<Consulta> historicoConsultas) {
        this.historicoConsultas = historicoConsultas;
    }

    public void adicionarConsulta(Consulta consulta) {
        this.historicoConsultas.add(consulta);
    }
}