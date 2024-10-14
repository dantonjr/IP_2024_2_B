import java.util.Scanner;

public class LeNomeWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe nome...: ");
        String nome = teclado.next();
        while (!nome.equalsIgnoreCase("fim")) {
            if (nome.equalsIgnoreCase("xico")) {
                System.out.println("Cê é louco!!!!");
                break;
            }
            System.out.println("Boa noite " + nome);
            System.out.print("Informe nome...: ");
            nome = teclado.next();
        }

    }
}
