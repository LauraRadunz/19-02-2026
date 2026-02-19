package agregacao;

public class Main {
    public static void main(String[] args) {
        Departamento mkt = new Departamento("Marketing", null);
        Funcionario funcionario1 = new Funcionario("João");
        Funcionario funcionario2 = new Funcionario("Maria");

        mkt.alocarFuncionario(funcionario1);
        mkt.alocarFuncionario(funcionario2);
        
    }
}
