public class Conta{

    //atributos
    int saldo;
    int limite;
    float numeroDaConta;
    String donoDaConta;

    //metodos
    public void sacar(float valor){
        saldo -= valor;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

}
