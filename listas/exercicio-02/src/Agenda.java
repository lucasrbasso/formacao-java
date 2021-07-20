public class Agenda {
    final private MeuArray contatos = new MeuArray();

    public void adicionarContato(Pessoa contato) {
        this.contatos.adiciona(contato);
        System.out.println("Pessoa adicionada!");
    }

    public void removePessoa(String nome) {
        this.contatos.remove(nome);
        System.out.println("Pessoa removida!");
    }

    public int getPosicao(String nome) {
        return this.contatos.getPosicao(nome);
    }

    public void imprimeAgenda() {

        for(int i = 0; i < contatos.getNumeroDePessoas(); i++) {
            System.out.println(contatos.getPessoa(i).getNome());
            System.out.println(contatos.getPessoa(i).getIdade());
            System.out.println(contatos.getPessoa(i).getAltura());
            System.out.println();
        }
    }

    public void imprimePessoa(int i) {
        System.out.println(contatos.getPessoa(i).getNome());
        System.out.println(contatos.getPessoa(i).getIdade());
        System.out.println(contatos.getPessoa(i).getAltura());
    }
}
