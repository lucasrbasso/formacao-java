import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.exit;

public class HerdeiraControle extends Controle {

    public static List<Caminhao> adicionaCaminhoes(List<Caminhao> caminhoes) {
        String tipo = "";
        String pluviometro = "";
        int numeroDePluviometros = 0;
        List<String> listaDePluviometros = new LinkedList<>();
        
        while (!tipo.matches("Fim")) {
            try {
                System.out.println("--------------------");
                System.out.println("Tipo do caminhão (Alfa ou Beta) ou Fim para sair: ");
                tipo = leString();

                if(tipo.equals("Fim")) {
                    break;
                }

                do {
                   try {
                       System.out.println("Número de Pluviômetros: ");
                       numeroDePluviometros = leInteiro();
                       break;
                   } catch (InputMismatchException error) {
                       System.out.println("O valor deve ser um inteiro!");
                   }
                } while (true);

                if(numeroDePluviometros < 0) {
                    System.out.println("Número de pluviometros não pode ser negativo!");
                    break;
                }

                System.out.println("Lista de pluviometros: ");
                for(int i = 0; i < numeroDePluviometros; i++) {
                    System.out.print((i + 1) + "-) " + "Tipo: ");
                    pluviometro = leString();
                    listaDePluviometros.add(pluviometro);
                }
            } catch (Exception erro) {
                System.out.println("Ops... Ocorreu um problema ao ler seu caminhão!");
                exit(400);
            }
            Caminhao c = new Caminhao(tipo, numeroDePluviometros, listaDePluviometros);
            System.out.println(listaDePluviometros);
            caminhoes.add(c);

            listaDePluviometros.clear();
        }

        return caminhoes;
    }

    public static void imprimeLista(List<Caminhao> caminhoes) {
        caminhoes.forEach((caminhao -> {
            System.out.println("\nTipo: " + caminhao.getTipo());
            System.out.println("Número de pluviometros: " + caminhao.getNumeroDePluviometros());
            System.out.println("Lista de pluviometros:");
            System.out.println(caminhao.getListaDePluviometros());
        }));
    }

    public static Caminhao selecionaMelhorCaminhao(List<Caminhao> caminhoes) {
        caminhoes.sort((Comparator.comparing(Caminhao::getNumeroDePluviometros)).reversed());

        return caminhoes.get(0);
    }
}
