import java.util.LinkedList;
import java.util.List;

public class TestaCadastro {
    public static void main(String[] args) {
        List<Caminhao> caminhoes = new LinkedList<>();

        HerdeiraControle.adicionaCaminhoes(caminhoes);

        System.out.println("Gostaria de imprimir sua lista? [S] [N]");
        String caractere = Controle.leString();

        if(caractere.equals("S") || caractere.equals("Sim")) {
            HerdeiraControle.imprimeLista(caminhoes);
        }

        Caminhao melhor = HerdeiraControle.selecionaMelhorCaminhao(caminhoes);
        System.out.println("\nMelhor caminhão:");
        System.out.println(melhor);
    }
}
