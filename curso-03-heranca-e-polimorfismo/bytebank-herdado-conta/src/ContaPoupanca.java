public class ContaPoupanca extends Conta{

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero); //Construtor da classe mãe
    }
}
