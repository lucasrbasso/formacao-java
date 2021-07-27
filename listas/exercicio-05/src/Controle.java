import java.util.Scanner;

public abstract class Controle {
    public static String leString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int leInteiro() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
