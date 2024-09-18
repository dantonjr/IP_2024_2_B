import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe...");
        System.out.print("\tvalor 1..: ");
        int valor1 = teclado.nextInt();
        System.out.print("\tvalor 2..: ");
        int valor2 = teclado.nextInt();
        System.out.print("\tvalor 3..: ");
        int valor3 = teclado.nextInt();

        int valMenor, valMeio, valMaior;

        if (valor1 <= valor2 && valor1 <= valor3) {
            valMenor = valor1;
            if (valor2 <= valor3) {
                valMeio = valor2;
                valMaior = valor3;
            } else {
                valMeio = valor3;
                valMaior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            valMenor = valor2;
            if (valor1 <= valor3) {
                valMeio = valor1;
                valMaior = valor3;
            } else {
                valMeio = valor3;
                valMaior = valor1;
            }
        } else {
            valMenor = valor3;
            if (valor1 <= valor2) {
                valMeio = valor1;
                valMaior = valor2;
            } else {
                valMeio = valor2;
                valMaior = valor1;
            }
        }
        System.out.println("*** MENU PRINCIPAL ***");
        System.out.println("1 -> ordem crescente");
        System.out.println("2 -> ordem decrescente");
        System.out.println("3 -> o maior valor no meio");
        System.out.print("Escolha a opção..: ");
        int opcao = teclado.nextInt();
        switch (opcao) {
            case 1:
                System.out.printf("[%d, %d, %d]", valMenor, valMeio, valMaior);
                break;
            case 2:
                System.out.printf("[%d, %d, %d]", valMaior, valMeio, valMenor);
                break;
            case 3:
                System.out.printf("[%d, %d, %d]", valMenor, valMaior, valMeio);
                break;
            default:
                System.out.println("Opção INVÁLIDA!!!!");
                break;
        }
        teclado.close();
    }
}
