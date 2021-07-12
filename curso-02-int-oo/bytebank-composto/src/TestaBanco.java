public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222.-22";
        paulo.profissao = "programador";

        Conta contaDoLucas = new Conta();
        contaDoLucas.deposita(100);

        contaDoLucas.titular = paulo;
        System.out.println(contaDoLucas.titular.nome);
        System.out.println(contaDoLucas.titular);

    }
}