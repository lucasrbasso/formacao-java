public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero); //Construtor da classe mãe
    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor + 0.20);
    }
}
