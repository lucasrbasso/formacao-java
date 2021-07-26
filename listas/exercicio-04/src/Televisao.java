import java.util.List;
import java.util.Optional;

public class Televisao {
    private final List<Integer> canais;
    private Integer canalAtual;
    private int volume;

    public Televisao(List<Integer> canais) {
        this.canais = canais;
        canalAtual = this.canais.get(0);
        volume = 0;
    }

    public void mostraCanais() {
        this.canais.forEach(System.out::println);
    }

    public Integer getCanalAtual() {
        return this.canalAtual;
    }

    public void setCanalAtual(int canalDesejado) {
        if(canais.stream().anyMatch(canal -> canal == canalDesejado)) {
            this.canalAtual = canalDesejado;
        } else {
            System.out.println("Canal não encontrado!");
        }
    }

    public void aumentaCanal() {
        if(this.canalAtual + 1 < canais.size()) {
            int index = canais.indexOf(canalAtual);
            this.canalAtual = canais.get(index + 1);
        }
    }

    public void diminuiCanal() {
        if(this.canalAtual - 1 >= 0) {
            int index = canais.indexOf(canalAtual);
            this.canalAtual = canais.get(index - 1);
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void aumentaVolume() {
        if(this.volume + 1 < 100) {
            this.volume += 1;
        }
    }

    public void diminuiVolume() {
        if(this.volume - 1 < 100) {
            this.volume -= 1;
        }
    }
}
