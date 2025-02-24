public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Mario", false);
        Piloto piloto2 = new Piloto("Bowser", true);

        Motor motor1 = new Motor("50", 80);
        Motor motor2 = new Motor("150", 150);

        Kart kart1 = new Kart("Kart Vermelho", piloto1, motor1);
        Kart kart2 = new Kart("Kart Verde", piloto2, motor2);

        kart1.mostraInfo();
        kart1.pular();
        kart1.soltarTurbo();
        kart1.fazerDrift();

        System.out.println("----------------------");

        kart2.mostraInfo();
        kart2.pular();
        kart2.soltarTurbo();
        kart2.fazerDrift();
    }
}
