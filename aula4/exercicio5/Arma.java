public class Arma {
    private String nome;
    private int poder;
    private int resistencia;
    private String descricao;

    public Arma(String nome, int poder, int resistencia, String descricao) {
        this.nome = nome;
        this.poder = poder;
        this.resistencia = resistencia;
        this.descricao = descricao;
    }

    public void usar() {
        resistencia -= 2;
        if (resistencia < 0) resistencia = 0;
        System.out.println(nome + " foi usada! Resistência restante: " + resistencia);
    }

    public void mostraInfoArma() {
        System.out.println("Arma: " + nome + ", Poder: " + poder + ", Resistência: " + resistencia + ", Descrição: " + descricao);
    }

    public String getNome() {
        return nome;
    }

    public int getResistencia() {
        return resistencia;
    }
}
