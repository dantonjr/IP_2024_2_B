import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o número...: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero é par");
        } else {
            System.out.println("Número é ímpar");
        }
        String resposta = numero % 2 == 0 ? "par" : "ímpar";
        System.out.printf("Número é %s", resposta);
    }
}
