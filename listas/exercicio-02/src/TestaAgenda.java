public class TestaAgenda {
    public static void main(String[] args) {
        Pessoa lucas = new Pessoa(20, "Lucas", 1.75);
        Pessoa joao = new Pessoa(20, "João", 1.75);
        Pessoa reinaldo = new Pessoa(20, "Reinaldo", 1.75);
        Pessoa anonimo = new Pessoa(20, "Anonimo", 1.75);

        Agenda agenda = new Agenda();

        agenda.adicionarContato(lucas);
        agenda.adicionarContato(joao);
        agenda.adicionarContato(reinaldo);
        agenda.adicionarContato(anonimo);

        System.out.println(agenda.getPosicao("Reinaldo"));
        agenda.removePessoa("Reinaldo");

        agenda.imprimeAgenda();
        agenda.imprimePessoa(1);
    }
}
