package Ex4;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Alex");
        Personagem guerreiro = new Personagem("Kratos");
        jogador.criarPersonagem(guerreiro);

        Item espada = new Item("Espada Longa", true);
        Item pocao = new Item("Poção de Vida", false);
        guerreiro.getInventario().adicionarItem(espada);
        guerreiro.getInventario().adicionarItem(pocao);

        Guilda guilda = new Guilda("Os Espartanos");
        guilda.adicionarMembro(guerreiro);

        System.out.println("--- MEMBROS DA GUILDA: " + guilda.getNome() + " ---");
        for (Personagem p : guilda.getMembros()) {
            System.out.println("- " + p.getNome());
        }

        System.out.println("\n--- INVENTÁRIO DO PERSONAGEM: " + guerreiro.getNome() + " ---");
        for (Item item : guerreiro.getInventario().getItens()) {
            System.out.println("- " + item.getNome());
        }

        System.out.println("\n--- ITENS EQUIPADOS ---");
        for (Item item : guerreiro.getInventario().getItens()) {
            if (item.isEquipavel()) {
                System.out.println("- " + item.getNome());
            }
        }
    }
}