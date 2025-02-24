public class Main {
    public static void main(String[] args) {
        Arma espada = new Arma("Espada Longa", 10, 20, "Uma espada afiada e resistente.");
        Arma arco = new Arma("Arco e Flecha", 8, 15, "Um arco com flechas rápidas e precisas.");

        Personagem guerreiro = new Personagem("Guerreiro", 100, espada);
        Personagem arqueiro = new Personagem("Arqueiro", 80, arco);

        guerreiro.mostraInfo();
        guerreiro.usarArma();
        guerreiro.tomarDano();

        arqueiro.mostraInfo();
        arqueiro.usarArma();
        arqueiro.tomarDano();
    }
}
