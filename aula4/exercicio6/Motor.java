public class Motor {
    private String cilindradas;
    private float velocidadeMaxima;

    public Motor(String cilindradas, float velocidadeMaxima) {
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mostraInfo() {
        System.out.println("Motor: " + cilindradas + " cilindradas, Velocidade Máxima: " + velocidadeMaxima + " km/h");
    }
}
