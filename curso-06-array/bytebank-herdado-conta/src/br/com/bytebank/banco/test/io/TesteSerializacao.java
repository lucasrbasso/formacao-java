package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.*;

public class TesteSerializacao {
    public static <bjectInputStream> void main(String[] args) throws IOException, ClassNotFoundException {

        // Escrita

        Cliente cliente = new Cliente();
        cliente.setNome("Lucas");
        cliente.setProfissao("Dev");
        cliente.setCpf("234113131");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();


        // Leitura

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente ccLido = (ContaCorrente) ois.readObject();
        ois.close();

        System.out.println(ccLido.getSaldo());
        System.out.println(ccLido.getTitular().getNome());
    }
}
