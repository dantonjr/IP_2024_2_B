import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre numero 1...: ");
        int num1 = teclado.nextInt();
        System.out.print("Entre numero 2...: ");
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("O maior é : " + num1);
        } else {
            System.out.println("O maior é: " + num2);
        }
        System.out.println("O maior é: " + (num1 > num2 ? num1 : num2));

        System.out.println("-----------------");

        if (num1 == num2) {
            System.out.println("São iguais: " + num1);
        } else {
            if (num1 > num2) {
                System.out.println("O maior é: " + num1);
            } else {
                System.out.println("O maior é: " + num2);
            }
        }

        if (num1 == num2) {
            System.out.println("São iguais: " + num1);
        } else if (num1 > num2) {
            System.out.println("O maior é: " + num1);
        } else {
            System.out.println("O maior é: " + num2);
        }
    System.out.println("O maior é: " + (num1 == num2 ? ("iguais " + num1) : num1 > num2 ? num1 : num2));
    }
}
