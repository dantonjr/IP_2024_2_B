import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe # horas trabalhadas......: ");
        int numHoras = teclado.nextInt();
        System.out.print("Qual o valor da hora trabalhada? : ");
        float valorHora = teclado.nextFloat();
        float salarioTotal = numHoras * valorHora;
        if (numHoras > 160) {
            float salarioExtra = (numHoras - 160) * (valorHora / 2);
            salarioTotal += salarioExtra;
        }
        System.out.printf("O salário total é..: %.2f", salarioTotal);
    }
}
