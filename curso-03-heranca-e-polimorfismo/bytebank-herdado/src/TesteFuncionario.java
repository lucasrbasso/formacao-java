
public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente lucas = new Gerente();
        lucas.setNome("Lucas Basso");
        lucas.setCpf("223355646-9");
        lucas.setSalario(2500.80);

        System.out.println(lucas.getNome());
        System.out.println(lucas.getBonificacao());
    }
}
