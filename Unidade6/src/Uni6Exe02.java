import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] valores = new double[3];
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Informe valor %d: ", i);
            valores[i] = teclado.nextDouble();
        }
        
        double acumulaValores = 0;
        for (double valor : valores) {
            acumulaValores += valor;
        }
        double media = acumulaValores / valores.length;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > media) {
                System.out.println("Valor " + valores[i]);
            }
        }

        for (double valor : valores) {
            System.out.printf("%s", valor > media ? String.format("Valor: %f", valor) : "");
        }
    }
}
