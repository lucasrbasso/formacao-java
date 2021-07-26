import java.util.Optional;

public class ControleRemoto {
    public static void aumentarVolume(Televisao tv) {
        Optional.ofNullable(tv).ifPresent(Televisao::aumentaVolume);
    }

    public static void diminuirVolume(Televisao tv) {
        Optional.ofNullable(tv).ifPresent(Televisao::diminuiVolume);
    }

    public static void aumentarCanal(Televisao tv) {
        Optional.ofNullable(tv).ifPresent(Televisao::aumentaCanal);
    }

    public static void diminuirCanal(Televisao tv) {
        Optional.ofNullable(tv).ifPresent(Televisao::diminuiCanal);
    }

    public static void trocarCanal(Televisao tv, int canal) {
        if(canal > 0) {
            Optional.ofNullable(tv).ifPresent(televisao -> televisao.setCanalAtual(canal));
        } else {
            System.out.println("Canal precisa ser maior que 0!");
        }
    }

    public static void infoCanal(Televisao tv) {
        Optional.ofNullable(tv).ifPresent((televisao) -> System.out.println("Canal = " + televisao.getCanalAtual()));
    }

    public static void infoVolume(Televisao tv) {
        Optional.ofNullable(tv).ifPresent((televisao) -> System.out.println("Volume = " + televisao.getVolume()));
    }
}
