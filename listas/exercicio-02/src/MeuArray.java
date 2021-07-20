

public class MeuArray {
    private Pessoa[] pessoas;
    private int posicaoLivre;

    public MeuArray() {
        this.pessoas = new Pessoa[10];
        this.posicaoLivre = 0;
    }

    public Pessoa getPessoa(int i) {
        return this.pessoas[i];
    }

    public void adiciona(Pessoa pessoa) {
        this.pessoas[posicaoLivre] = pessoa;
        this.posicaoLivre++;
    }

    public int getPosicao(String nome) {
        for(int i=0; i<posicaoLivre; i++) {
            if(nome.equals(pessoas[i].getNome())) {
                return i;
            }
        }
        return -1;
    }

    public void remove(String nome) {
        int posicao = getPosicao(nome);
        Pessoa[] aux = new Pessoa[10];
        if (getPosicao(nome) >= 0) {
            for(int i = 0, k = 0; i<posicaoLivre; i++) {
                if(i == posicao) {
                    continue;
                }

                aux[k++] = pessoas[i];
            }

            pessoas = aux;
            posicaoLivre--;
        }
    }

    public int getNumeroDePessoas() {
        return posicaoLivre;
    }
}
