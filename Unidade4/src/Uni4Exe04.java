import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o número: ");
        double numero = teclado.nextDouble();
        
        if (numero - (int) numero != 0) {
            System.out.println("O número possui casas decimais.");
        } else {
            System.out.println("O número não possui casas decimais.");
        }

        if (numero % 1 != 0) {
            System.out.println("O número possui casas decimais.");
        } else {
            System.out.println("O número não possui casas decimais.");
        }
                
        if (numero  - Math.floor(numero) != 0) {
            System.out.println("O número possui casas decimais.");
        } else {
            System.out.println("O número não possui casas decimais.");
        }


    }
}
