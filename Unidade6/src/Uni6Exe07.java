import java.util.Scanner;

public class Uni6Exe07 {

    private Scanner teclado = new Scanner(System.in);

    public Uni6Exe07() {
        int tamanho = leInteiro(1, 20, "Informe tamanho do vetor");
        int [] valores = leVetor(tamanho);
        mostraVetor(valores);
        ordenaVetor(valores);
        mostraVetor(valores);
    }

    private void ordenaVetor(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
    private void mostraVetor(int [] vetor) {
        for (int valor : vetor) {
            System.out.printf("%2d ", valor);
        }
        System.out.println("");
    }

    private int [] leVetor(int tamanho) {
        int vetor [] = new int[tamanho];
        int valor = 0;
        int vetorPos = 0;
        while (vetorPos < vetor.length) {
           valor = leInteiro(-10, 50, String.format("Posição %d", vetorPos));
            if (!pesquisaValor(vetor, valor, vetorPos)) {
                vetor[vetorPos++] = valor;
            }
        }
        return vetor;
    }

    private boolean pesquisaValor(int [] vetor, int valor, int posicao) {
        for(int i = 0 ; i < posicao; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    private int leInteiro(int limInf, int limSup, String mensagem) {
        int valor = 0;
        do {
            System.out.printf("%s (%d <= n <= %d): ", mensagem, limInf, limSup);
            valor = teclado.nextInt();
            if (valor < limInf || valor > limSup) {
                System.out.println("ERRO! Limites inválidos... Temte Novamente!!!");
            }
        } while(valor < limInf || valor > limSup);

        return valor;
    }
    public static void main(String[] args) {
        new Uni6Exe07();
    }
}
