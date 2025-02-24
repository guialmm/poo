public class Piloto {
    private String nome;
    private boolean vilao;

    public Piloto(String nome, boolean vilao) {
        this.nome = nome;
        this.vilao = vilao;
    }

    public void soltaSuperPoder() {
        System.out.println(nome + " soltou seu super poder!");
    }

    public String getNome() {
        return nome;
    }
}
