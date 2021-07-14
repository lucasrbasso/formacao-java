import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pessoa {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private String nome;
    private double altura;
    private String date;

    public Pessoa(String nome, double altura, String date) {
        this.nome = nome;
        this.altura = altura;
        this.date = date;
    }

    public double getAltura() {
        return this.altura;
    }

    public String getDate() {
        return this.date;
    }

    public String getNome() {
        return this.nome;
    }

    public void ImprimeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDate());
        System.out.println("Altura: " + getAltura());
        System.out.println("Idade: " + calculaIdade());
    }

    private int calculaIdade() {
        try {
            formatter = formatter.withLocale(Locale.ENGLISH);
            LocalDate parsedDate = LocalDate.parse(getDate(),formatter);
            LocalDate now = LocalDate.now();

            Period diff = Period.between(parsedDate, now);

            System.out.println("Diferença em anos eh de: " + diff.getYears());

            System.out.println(parsedDate);
            return 1;
        }
        catch (Exception ParseException) {
            throw new Error("Não foi possível calcular a idade! Erro: " + ParseException);
        }
    }
}
