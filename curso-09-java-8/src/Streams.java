import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

record Curso(String nome, int alunos) {

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class Streams {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 165));
        cursos.add(new Curso("Java 8", 152));
        cursos.add(new Curso("C", 60));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        int soma = cursos.stream()
                .filter(c -> c.getAlunos() >= 50)
                .mapToInt(Curso::getAlunos)
                .sum();

        System.out.println(soma);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 80).findAny()
                .ifPresent(curso -> System.out.println(curso.getNome()));

        cursos = cursos.stream()
                .filter(c -> c.getAlunos() >= 50)
                .collect(Collectors.toList());

        cursos.stream().forEach(c -> System.out.println(c.getNome()));
        cursos.forEach(c -> System.out.println(c.getNome()));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 50)
                .collect(Collectors.toMap(
                        Curso::getNome,
                        Curso::getAlunos
                ))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
    }
}
