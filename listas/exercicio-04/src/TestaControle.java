import java.util.Arrays;
import java.util.List;

public class TestaControle {
    public static void main(String[] args) {
        List<Integer> canais = Arrays.asList(1,2,3,4,5,6);

        Televisao tv = new Televisao(canais);

        ControleRemoto.infoCanal(tv);
        ControleRemoto.aumentarCanal(tv);
        ControleRemoto.infoCanal(tv);
        ControleRemoto.diminuirCanal(tv);
        ControleRemoto.infoCanal(tv);
        ControleRemoto.infoCanal(tv);
        ControleRemoto.aumentarVolume(tv);
        ControleRemoto.aumentarVolume(tv);
        ControleRemoto.infoVolume(tv);
        ControleRemoto.diminuirVolume(tv);
        ControleRemoto.diminuirVolume(tv);
        ControleRemoto.trocarCanal(tv, 5);
        ControleRemoto.infoCanal(tv);
        ControleRemoto.diminuirCanal(tv);
        ControleRemoto.diminuirCanal(tv);
        ControleRemoto.infoVolume(tv);

    }
}
