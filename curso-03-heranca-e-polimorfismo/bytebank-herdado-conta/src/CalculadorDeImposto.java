public class CalculadorDeImposto {
    private double totalImposto;

    public void calcula(Tributavel conta) {
        double valor = conta.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }
}
