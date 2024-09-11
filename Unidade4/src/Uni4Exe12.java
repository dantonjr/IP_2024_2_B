import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre lado 1...: ");
        int lado1 = teclado.nextInt();
        System.out.print("Entre lado 2...: ");
        int lado2 = teclado.nextInt();
        System.out.print("Entre lado 3...: ");
        int lado3 = teclado.nextInt();

        if ((lado1 < lado2 + lado3) &&
                (lado2 < lado1 + lado3) &&
                (lado3 < lado1 + lado2)) {
            if ((lado1 == lado2) && (lado1 == lado3)) {
                System.out.println("Equilátero");
            } else if ((lado1 == lado2) ||
                    (lado2 == lado3) ||
                    (lado3 == lado1)) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Não é triângulo");
        }
        teclado.close();
    }

}
