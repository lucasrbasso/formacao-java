public class TestaElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5,3);
        elevador.Entra();
        elevador.Entra();
        System.out.println(elevador.getAndarAtual());
        elevador.Entra();
        System.out.println(elevador.getQuantidadeDePessoas());
        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();
        System.out.println(elevador.getAndarAtual());
        elevador.Sai();
        System.out.println(elevador.getQuantidadeDePessoas());
    }
}
