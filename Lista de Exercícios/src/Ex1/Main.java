package Ex1;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João", "joao@email.com", null);
        System.out.println(usuario1.getNome());
        System.out.println(usuario1.getEmail());
        System.out.println(usuario1.getPerfis());
        System.out.println(usuario1.getPerfis().getFirst().getFilmesAssistidos());
    }
}
