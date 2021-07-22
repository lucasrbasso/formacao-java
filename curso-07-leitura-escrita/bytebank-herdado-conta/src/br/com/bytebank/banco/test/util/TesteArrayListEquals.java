package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

        public static void main(String[] args) {

            ArrayList<Conta> lista = new ArrayList<>();

            Conta cc = new ContaCorrente(22, 11);
            lista.add(cc);

            Conta cc2 = new ContaCorrente(22, 22);
            lista.add(cc2);

            Conta cc3 = new ContaCorrente(22, 22);

            System.out.println("Existe cc2 na lista? = " + lista.contains(cc2));
            System.out.println("Existe cc3 na lista? = " + lista.contains(cc3));
            // Número e agência iguais pq sobrescrevemos o método.


            for(Conta conta : lista) {  // Para cada Conta da lista
                System.out.println(conta);
            }

        }
}
