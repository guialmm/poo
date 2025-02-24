public class Personagem {
    private String nome;
    private int pontos;
    private Arma arma;

    public Personagem(String nome, int pontos, Arma arma) {
        this.nome = nome;
        this.pontos = pontos;
        this.arma = arma;
    }

    public void usarArma() {
        if (arma.getResistencia() > 0) {
            System.out.println(nome + " usou a arma: " + arma.getNome());
            arma.usar();
        } else {
            System.out.println("A arma " + arma.getNome() + " quebrou!");
        }
    }

    public void tomarDano() {
        pontos -= 5;
        if (pontos < 0) pontos = 0;
        System.out.println(nome + " tomou dano! Pontos de vida: " + pontos);
    }

    public void mostraInfo() {
        System.out.println("Personagem: " + nome + ", Pontos de Vida: " + pontos);
        arma.mostraInfoArma();
    }
}
