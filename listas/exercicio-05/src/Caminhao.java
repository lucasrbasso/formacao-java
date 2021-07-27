import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Caminhao {
    private String tipo;
    private int numeroDePluviometros;
    private List<String> listaDePluviometros;

    public Caminhao(String tipo, int numeroDePluviometros, List<String> listaDePluviometros) {
        this.listaDePluviometros = new LinkedList<>(listaDePluviometros);
        this.tipo = tipo;
        this.numeroDePluviometros = numeroDePluviometros;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroDePluviometros() {
        return numeroDePluviometros;
    }

    public List<String> getListaDePluviometros() {
        return Collections.unmodifiableList(listaDePluviometros);
    }

    @Override
    public String toString() {
        return (
            "\nCaminhao: { " +
            "Tipo: " + tipo + '\'' +
            ", Número de Pluviometros: " + numeroDePluviometros +
            ", Lista de Pluviometros: " + listaDePluviometros +
            " }"
        );
    }
}
