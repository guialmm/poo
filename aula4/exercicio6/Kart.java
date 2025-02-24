public class Kart {
    private String nome;
    private Piloto piloto;
    private Motor motor;

    public Kart(String nome, Piloto piloto, Motor motor) {
        this.nome = nome;
        this.piloto = piloto;
        this.motor = motor;
    }

    public void pular() {
        System.out.println(nome + " deu um pulo!");
    }

    public void soltarTurbo() {
        System.out.println(nome + " ativou o turbo!");
    }

    public void fazerDrift() {
        System.out.println(nome + " fez um drift!");
    }

    public void mostraInfo() {
        System.out.println("Kart: " + nome);
        piloto.soltaSuperPoder();
        motor.mostraInfo();
    }
}
