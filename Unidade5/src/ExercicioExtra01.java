
/*
 * Elabore um programa que leia
 * o sexo, idade e a altura de um conjunto de pessoas
 * -> sexo valido: m/M/f/F/x/X (x encerra a leitura).
 * -> Qualquer outro valor para sexo deve retornar uma mensagem de erro
 * -> altura valida: 0.50 >= altura <= 2.45
 * -> idade valida: 0 <= idade <= 135
 * -> Obs. crie constantes para os limites de controle de dados
 * 
 * escreva:
 * -> - total de homens
 * -> - total de mulheres
 * -> - maior altura dos homens
 * -> - a menor altura das mulheres
 *  (considere que a maior altura também pode ser a menor e vice versa)
 *  - a média de altura dos homens com mais de 45 anos
 *  - a menor altura das mulheres com menos de 18 anos
 *  - a média de altura das mulheres entre 25 e 39 anos
 *  - a idade do homem mais baixo
 */

import java.util.Scanner;

public class ExercicioExtra01 {

    private static final int IDADE_INFERIOR = 0;
    private static final int IDADE_SUPERIOR = 135;
    private static final float ALTURA_INFERIOR = (float) 0.50;
    private static final float ALTURA_SUPERIOR = (float) 2.45;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe sexo (M/F - X - fim)..: ");
        char sexo = Character.toUpperCase(teclado.next().charAt(0));
        int idade = 0;
        float altura = 0;
        int totalHomens = 0;
        int totalMulheres = 0;
        float maiorAlturaHomens = Float.MIN_VALUE;
        float menorAlturaMulheres = Float.MAX_VALUE;
        float acumulaAlturaHomensMaior45 = 0;
        int contaAlturaHomensMaior45 = 0;
        float menorAlturaMulheresMenor18Anos = Float.MAX_VALUE;
        int contaMulheresIdadeEntre25E39 = 0;
        float acumulaAlturaIdadeMulheresEntre25E39 = 0;
        float alturaHomemMaisBaixo = Float.MAX_VALUE;
        int idadeHomemMaisBaixo = 0;

        while (sexo != 'X') {
            if (sexo != 'M' && sexo != 'F') {
                System.out.println("SEXO Inválido!!! Tente novamente!");
            } else {
                boolean entradaValida = true;
                do {
                    System.out.printf("Informe idade (%3d - %3d)..: ", IDADE_INFERIOR, IDADE_SUPERIOR);
                    idade = teclado.nextInt();
                    entradaValida = !(idade >= IDADE_INFERIOR && idade <= IDADE_SUPERIOR);
                    System.out.printf("%s",
                            entradaValida
                                    ? String.format("Idade INVÁLIDA - valor deve estar entre %3d e %3d%n",
                                            IDADE_INFERIOR, IDADE_SUPERIOR)
                                    : "");
                } while (entradaValida);
                do {
                    System.out.print("Informe altura.: ");
                    altura = teclado.nextFloat();
                    entradaValida = !(altura >= ALTURA_INFERIOR && altura <= ALTURA_SUPERIOR);
                    System.out.printf("%s",
                            entradaValida
                                    ? String.format("Altura INVÁLIDA - valor deve estar entre %.2f e %.2f%n",
                                            ALTURA_INFERIOR, ALTURA_SUPERIOR)
                                    : "");

                } while (entradaValida);

                if (sexo == 'F') {
                    totalMulheres++;
                    if (altura < menorAlturaMulheres) {
                        menorAlturaMulheres = altura;
                    }
                    if (idade < 18 && altura < menorAlturaMulheresMenor18Anos) {
                        menorAlturaMulheresMenor18Anos = altura;
                    } else if (idade >= 25 && idade <= 35) {
                        acumulaAlturaIdadeMulheresEntre25E39 += altura;
                        contaMulheresIdadeEntre25E39++;
                    }

                } else {
                    totalHomens++;
                    if (altura > maiorAlturaHomens) {
                        maiorAlturaHomens = altura;
                    }
                    if (altura < alturaHomemMaisBaixo) {
                        alturaHomemMaisBaixo = altura;
                        idadeHomemMaisBaixo = idade;
                    }
                    if (idade > 45) {
                        contaAlturaHomensMaior45++;
                        acumulaAlturaHomensMaior45 += altura;
                    }
                }

            }
            System.out.print("Informe sexo (M/F - X - fim)..: ");
            sexo = Character.toUpperCase(teclado.next().charAt(0));
        }
        float mediaAlturaHomens45 = contaAlturaHomensMaior45 != 0
                ? acumulaAlturaHomensMaior45 / contaAlturaHomensMaior45
                : 0;
        float mediaAlturaMulheres25E39 = contaMulheresIdadeEntre25E39 != 0
                ? acumulaAlturaIdadeMulheresEntre25E39 / contaMulheresIdadeEntre25E39
                : 0;

        System.out.printf("Total de homens: %d%n", totalHomens);
        System.out.printf("Total mulheres: %d%n", totalMulheres);
        System.out.printf("Maior altura dos homens: %.2f%n", maiorAlturaHomens);
        System.out.printf("Menor altura das mulheres %.2f%n", menorAlturaMulheres);
        System.out.printf("Média da altura dos homens com mais de 45 anos: %.2f%n", mediaAlturaHomens45);
        System.out.printf("Menor altura das mulheres com menos de 18 anos: %.2f%n", menorAlturaMulheresMenor18Anos);
        System.out.printf("Média da altura das mulheres entre 25 e 39 anos: %.2f%n", mediaAlturaMulheres25E39);
        System.out.printf("Idade do homem mais baixo: %d%n", idadeHomemMaisBaixo);

    }
}
