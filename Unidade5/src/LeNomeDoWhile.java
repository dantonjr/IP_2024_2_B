import java.util.Scanner;

public class LeNomeDoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = "";
        do {
            System.out.print("Informe nome...: ");
            nome = teclado.next();
            if (nome.equalsIgnoreCase("xico")) {
                System.out.println("Cê é louco!!!!");
                break;
            }
            System.out.println("Boa noite " + nome);
        } while (!nome.equalsIgnoreCase("fim"));
    }
}
