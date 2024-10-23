import java.util.Scanner;

public class Uni6Exe02Objeto {

    private static final int TAMANHO_VETOR = 3;

    public Uni6Exe02Objeto() {
        double[] valores = leVetor(TAMANHO_VETOR);
        mostraVetorAcimaMedia(calculaMediaVetor(valores), valores);
    }

    private double[] leVetor(int tamanho) {
        Scanner teclado = new Scanner(System.in);
        double[] vetor = new double[tamanho];
        System.out.println("*** LEITURA DO VETOR ***");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Informe posição %3d: ", (i + 1));
            vetor[i] = teclado.nextInt();
        }
        return vetor;
    }

    private double calculaMediaVetor(double[] vetor) {
        double acumula = 0;
        for (double valor : vetor) {
            acumula += valor;
        }
        return acumula / vetor.length;
    }

    private void mostraVetorAcimaMedia(double media, double[] vetor) {
        System.out.printf("*** VALORES ACIMA DA MÉDIA %f ***%n", media);
        int posicao = 0;
        for (double valor : vetor) {
            if (valor > media) {
                System.out.printf("Posicao %d : %f%n", (posicao + 1), valor);
            }
            posicao++;
        }
    }

    public static void main(String[] args) {
        new Uni6Exe02Objeto();
    }
}
