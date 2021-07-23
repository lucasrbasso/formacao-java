import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasTokyo = LocalDate.of(2021, Month.JULY, 20);

        Period period = Period.between(hoje, olimpiadasTokyo);
        System.out.println(period.getYears());

        LocalDate proximasOlimpiadas = olimpiadasTokyo.plusYears(4);
        System.out.println(proximasOlimpiadas);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valorFormatado = proximasOlimpiadas.format(formatter);
        System.out.println(valorFormatado);

        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatterTime));

        LocalTime intervalo = LocalTime.of(4,60);
        System.out.println(intervalo);

    }
}
