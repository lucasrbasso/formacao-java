import java.io.*;

public class TesteSerializacao {

    public TesteSerializacao() throws IOException, ClassNotFoundException {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, IOException {

        String nome = "Lucas B";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oos.writeObject(nome);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nomeLido = (String) ois.readObject();
        ois.close();
        System.out.println(nomeLido);

    }
}
