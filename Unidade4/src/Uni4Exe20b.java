import java.util.Scanner;

public class Uni4Exe20b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** INFORME OS DADOS ***");
        System.out.print("Nota da prova 1.......: ");
        float notaProva1 = teclado.nextFloat();
        System.out.print("Nota da prova 2.......: ");
        float notaProva2 = teclado.nextFloat();
        System.out.print("Nota da prova 3.......: ");
        float notaProva3 = teclado.nextFloat();
        System.out.print("Nota dos exercícios...: ");
        float notaExercicios = teclado.nextFloat();
        float media = (notaProva1 + (notaProva2 * 2) + (notaProva3 * 3) + notaExercicios) / 7;
        char conceito = ' ';
        if (media >= 9) {
            conceito = 'A';
        } else if (media >= 7.5) {
            conceito = 'B';
        } else if (media >= 6) {
            conceito = 'C';
        } else if (media >= 4) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }
        System.out.printf("A média é %.3f com conceito %C.%n", media, conceito);
        System.out.printf("Aluno %s.",
                (conceito == 'A' || conceito == 'B' || conceito == 'C') ? "Aprovado" : "Reprovado");
    }

}