package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunos {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        for(String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos.contains("Paulo"));

        System.out.println(alunos);

    }
}
