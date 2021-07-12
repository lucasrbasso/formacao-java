public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(3333,5555);

        System.out.println(conta.getAgencia());

        conta.deposita(1000);
        double saldo = conta.getSaldo();

        System.out.println(saldo);

        Conta conta2 = new Conta(1234,1234);
        Conta conta3 = new Conta(5678,5678);
        Conta conta4 = new Conta(8910,8910);

        System.out.println(Conta.getTotal());

    }
}
