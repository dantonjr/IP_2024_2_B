import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe04 {

    public Uni6Exe04() {
        int[] vet1 = leVetor(10);
        int[] vet2 = leVetor(10);
        int[] vetSoma = somaVetor(vet1, vet2);
        mostraVetor(vet1);
        mostraVetor(vet2);
        mostraVetor(vetSoma);
    }

    private int[] leVetor(int tamanho) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** LEITURA DO VETOR ***");
        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d: ", i);
            vetor[i] = teclado.nextInt();
        }
        return vetor;
    }

    private int[] somaVetor(int[] vetA, int[] vetB) {
        int[] vSoma = new int[vetA.length];
        for (int i = 0; i < vSoma.length; i++) {
            vSoma[i] = vetA[i] + vetB[i];
        }
        return vSoma;
    }

    private void mostraVetor(int[] vetor) {
        System.out.print("[ ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%3d ", vetor[i]);
        }
        System.out.println("]");
     }

    public static void main(String[] args) {
        new Uni6Exe04();
    }
}
