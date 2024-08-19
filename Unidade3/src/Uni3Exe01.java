import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com a largura........: ");
        float largura = teclado.nextFloat();
        System.out.print("Entre com o comprimento..: ");
        float comprimento = teclado.nextFloat();
        float area = largura * comprimento;
        System.out.println("A área é: " + area);
        teclado.close();
        

    }
}
