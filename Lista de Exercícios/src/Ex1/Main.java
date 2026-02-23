package Ex1;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João", "joao@email.com");
        
        Perfil perfilJoao = new Perfil("João - Principal");
        usuario1.adicionarPerfil(perfilJoao); 

        Filme matrix = new Filme("Matrix", "Lana e Lilly Wachowski", "Keanu Reeves, Carrie-Anne Moss");

        perfilJoao.assistirFilme(matrix);

        System.out.println("--- DADOS DO USUÁRIO ---");
        System.out.println("Usuário: " + usuario1.getNome());

        System.out.println("\n--- PERFIS DO USUÁRIO ---");
        for (Perfil p : usuario1.getPerfis()) {
            System.out.println("- " + p.getNome());
        }

        System.out.println("\n--- FILMES ASSISTIDOS PELO PERFIL '" + perfilJoao.getNome() + "' ---");
        Perfil perfilSelecionado = usuario1.getPerfis().getFirst(); 
        for (Filme f : perfilSelecionado.getFilmesAssistidos()) {
            System.out.println("- " + f.getNome());
        }

        System.out.println("\n--- ELENCO DO FILME ---");
        System.out.println("Filme: " + matrix.getNome());
        System.out.println("Diretor: " + matrix.getDiretor());
        System.out.println("Elenco: " + matrix.getElenco());
    }
}