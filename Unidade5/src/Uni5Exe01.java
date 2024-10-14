import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Informe o número %d..: ", i);
            int n = teclado.nextInt();
            System.out.printf("O número %d é %s.%n", n, n % 2 == 0 ? "Par" : "Ímpar");
        }
        teclado.close();
    }
}