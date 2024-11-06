import java.util.Scanner;

public class Uni6Exe03 {
    
    public Uni6Exe03() {
        double[] valores = lerValores(12);
        mostrarVetor(valores);
        alterarValores(valores);
        mostrarVetor(valores);
    }

    private double[] lerValores(int tamanho) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** LEITURA DO VETOR ***");
        double[] vetor = new double[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d: ", i);
            vetor[i] = teclado.nextDouble();
        }
        return vetor;
    }

    private void alterarValores(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] *= (i % 2 == 0 ? 1.02 : 1.05);
            // if (i % 2 == 0) {
            // vetor[i] *= 1.02;
            // } else {
            // vetor[i] *= 1.05;
            // }
        }
    }

    private void mostrarVetor(double[] vetor) {
        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.2f ", vetor[i]);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        new Uni6Exe03();
    }
}
