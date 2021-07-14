public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100);

        SeguroDeVida sv = new SeguroDeVida();

        CalculadorDeImposto ci = new CalculadorDeImposto();
        ci.calcula(cc);
        ci.calcula(sv);

        System.out.println(ci.getTotalImposto());
    }
}
