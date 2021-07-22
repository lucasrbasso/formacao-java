package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula " + aula);
        });

        System.out.println();

        for (String aula : aulas) {
            System.out.println("aula : " + aula);
        }

        System.out.println();
        System.out.println(aulas);
        System.out.println();

        Collections.sort(aulas);
        System.out.println("Depois de ordenado:");
        System.out.println(aulas);
    }
}
