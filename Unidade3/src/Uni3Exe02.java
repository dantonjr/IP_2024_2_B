import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe valor do sapato...: ");
        float valorSapato = teclado.nextFloat();
        // float valorDesconto = valorSapato * 12 / 100;
        float valorDesconto = valorSapato * (float) 0.12;
        float valorFinal = valorSapato - valorDesconto;
        System.out.println("O valor do desconto é de R$ " + valorDesconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + valorFinal);
        teclado.close();
    }
}
