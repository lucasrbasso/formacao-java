package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerfomance {
    public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto - ArrayList: " + tempoDeExecucao);


        Collection<Integer> numeros2 = new HashSet<>();

        inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros2.add(i);
        }

        for (Integer numero : numeros2) {
            numeros2.contains(numero);
        }

        fim = System.currentTimeMillis();

        tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto - HashSet: " + tempoDeExecucao);

    }
}
