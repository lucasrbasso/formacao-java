import java.io.*;

public class TesteSerializacao2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Escrevendo um objeto bin:
        // Importante a classe Cliente ser serializavel

        Cliente cliente = new Cliente();
        cliente.setNome("Lucas");
        cliente.setProfissao("Dev");
        cliente.setCpf("234113131");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

        // Lendo um objeto

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente clienteLido = (Cliente) ois.readObject();
        ois.close();
        System.out.println(clienteLido.getCpf());
    }
}
