package br.com.bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {
//        String nome = "Alura"; // Object literal
//        String teste1 = nome.replace("A", "a");
//        String teste2 = nome.toLowerCase();
//
//        System.out.println(teste1 + " " + teste2);

        String nome = "Mario"; //object literal
        String outro = "Alura"; //má prática, sempre prefere a sintaxe literal

        String novo = outro.replace("A", "a");
        System.out.println(novo);

        String novo2 = nome.toLowerCase(); //também teste toUpperCase()
        System.out.println(novo2);

        char c = nome.charAt(3); //char i
        System.out.println(c);

        int pos = nome.indexOf("rio");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String texto = builder.toString();

        System.out.println(texto);
    }
}
