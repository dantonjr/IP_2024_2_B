public class ExemploOrdenacao {

    public ExemploOrdenacao() {
        int[] valores = { 10, 5, 7, 14, 21, 17, 8, 100, 15 };
        mostraVetor(valores);
        ordenaVetor(valores);
        mostraVetor(valores);
    }

    private void mostraVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.printf("%d ", valor);
        }
        System.out.println("");
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

    public static void main(String[] args) {
        new ExemploOrdenacao();
    }
}
