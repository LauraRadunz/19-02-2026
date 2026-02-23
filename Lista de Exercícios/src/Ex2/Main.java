package Ex2;

public class Main {
    public static void main(String[] args) {
        Medico medico1 = new Medico("Dr. Carlos", "Cardiologia");
        Paciente paciente1 = new Paciente("Ana");
        
        Consulta consulta1 = new Consulta(medico1, "Paciente relatou dores no peito.");
        paciente1.adicionarConsulta(consulta1);

        System.out.println("--- DADOS DO PACIENTE ---");
        System.out.println("Paciente: " + paciente1.getNome());

        System.out.println("\n--- HISTÓRICO DE CONSULTAS ---");
        for (Consulta c : paciente1.getHistoricoConsultas()) {
            System.out.println("Médico Responsável: " + c.getMedicoResponsavel().getNome() + " (" + c.getMedicoResponsavel().getEspecialidade() + ")");
            System.out.println("Prontuário gerado: " + c.getProntuario().getDescricao());
        }
    }
}