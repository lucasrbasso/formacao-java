public class Elevador {
    private int capacidadeMaxima;
    private int andaresTotais;
    private int quantidadeDePessoas;
    private int andarAtual;

    public Elevador(int capacidadeMaxima, int andaresTotais) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.andaresTotais = andaresTotais;
        this.quantidadeDePessoas = 0;
        this.andarAtual = 0;
        this.quantidadeDePessoas = 0;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public int getAndaresTotais() {
        return andaresTotais;
    }

    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void Entra() {
        if(this.quantidadeDePessoas +1 <= this.capacidadeMaxima) {
            this.quantidadeDePessoas++;
        }
    }

    public void Sai() {
        if(this.quantidadeDePessoas -1 >= 0) {
            this.quantidadeDePessoas--;
        }
    }

    public void Sobe() {
        if(this.andarAtual + 1 <= andaresTotais) {
            this.andarAtual++;
        }
    }

    public void Desce() {
        if(this.andarAtual - 1 <= andaresTotais) {
            this.andarAtual--;
        }
    }

}
