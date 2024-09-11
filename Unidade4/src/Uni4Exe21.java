import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe massa......: ");
        double massa = teclado.nextDouble();
        System.out.print("Informe altura.....: ");
        double altura = teclado.nextDouble();
        double imc = massa / Math.pow(altura, 2);
        String grau = "";
        if (imc < 18.5) {
            grau = "Magreza";
        } else if (imc < 24.9) {
            grau = "Saudável";
        } else if (imc < 29.9) {
            grau = "Sobrepeso";
        } else if (imc < 34.9) {
            grau = "Obesidade Grau I";
        } else if (imc < 39.9) {
            grau = "Obesidade Grau II (severa)";
        } else {
            grau = "Obesidade Grau III (mórbida)";
        }
        System.out.printf("IMC: %.2f - Grau: %s.%n", imc, grau);
    }
}
