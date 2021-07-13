public class ControleBonificacao {
    private double soma;

    public void registra(Funcionario f) {
        this.soma += f.getBonificacao();
    }
    //Gerentes editores de vídeo, funcionários gerais, são todos Funcionario, logo
    // o método chama o getBonificação de cada um individualmente!

    public double getSoma() {
        return soma;
    }
}
