import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos elementos deseja? ");
        int n = teclado.nextInt();
        int numero = 8;
        // int soma = 0;
        for (int i = 2; i <= n; i++) {
            System.out.print(numero + ", " + (numero + 2) + ", ");
            numero = numero * 2;
            // soma = soma + numero + 2;
        }
    }
}
