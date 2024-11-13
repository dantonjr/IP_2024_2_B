import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Uni6Exe08 {

    public Uni6Exe08() {
        Scanner teclado = new Scanner(System.in);
        int tamanhoVetor = leInteiro(1, 20, "Tamanho do vetor", teclado);
        double[] valores = new double[tamanhoVetor];
        leVetor(valores, teclado);
        mostraVetor(valores);
        achaIgual(valores);
    }

    private void achaIgual(double[] vetor) {
        boolean[] achou = new boolean[vetor.length];
        for (int i = 0; i < achou.length; i++) {
            achou[i] = false;
        }
        System.out.println("VALOR\t|\tFREQUÊNCIA");
        for(int i = 0 ; i < vetor.length; i++) {
            int contador = 0;
            for(int j = 0; j < vetor.length; j++) {
                if(!achou[j]) {
                    if (vetor[i] == vetor[j]) {
                        achou[j] = true;
                        contador++;
                    }
                }
            }
            if (contador > 0) {
                System.out.println(vetor[i] + "\t|\t" + contador);
            }
        }
    }

    private int leInteiro(int limInf, int limSup, String mensagem, Scanner teclado) {
        int valor = 0;
        do {
            System.out.printf("%s (%d <= n <= %d): ", mensagem, limInf, limSup);
            valor = teclado.nextInt();
            if (valor < limInf || valor > limSup) {
                System.out.println("ERRO! Limites inválidos... Temte Novamente!!!");
            }
        } while (valor < limInf || valor > limSup);
        return valor;
    }

    private void leVetor(double[] vetor, Scanner teclado) {
        System.out.println("*** LEITURA DO VETOR ***");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d: ", i);
            vetor[i] = teclado.nextDouble();
        }
    }

    private void mostraVetor(double[] vetor) {
        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.3f ", vetor[i]);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        new Uni6Exe08();
    }

}
