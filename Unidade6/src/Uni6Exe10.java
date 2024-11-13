import java.util.Scanner;

public class Uni6Exe10 {
    private static final int TAMANHO_VETOR = 50;

    public Uni6Exe10() {
        Scanner teclado = new Scanner(System.in);
        int[] valores = new int[TAMANHO_VETOR];
        int opcao = 0;
        int posicaoFim = 0;
        do {
            mostraMenu();
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    posicaoFim = incluir(valores, posicaoFim, teclado);
                    break;
                case 2:
                    int posicao = pesquisar(valores, posicaoFim, teclado);
                    if (posicao >= 0) {
                        System.out.printf("Valor encontrado na posição %d.%n", posicao);
                    } else {
                        System.out.println("Valor não encntrado!");
                    }
                    break;
                case 3:
                    alterar(valores, posicaoFim, teclado);
                    break;
                case 4:
                    posicaoFim = excluir(valores, posicaoFim, teclado);
                    break;
                case 5:
                    mostraVetor(valores, posicaoFim);
                    break;
                case 6:
                    ordenaVetor(valores, posicaoFim);
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.printf("Opção \"%d\" inválida!!!%n", opcao);
                    break;
            }
        } while (opcao != 8);
    }

    private void ordenaVetor(int[] vetor, int posicaoFim) {
        for (int i = 0; i < posicaoFim - 1; i++) {
            for (int j = 0; j < posicaoFim - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    private void mostraVetor(int[] vetor, int posicaoFim) {
        for (int i = 0; i < posicaoFim; i++) {
            System.out.printf("%2d ", vetor[i]);
        }
        System.out.println("");
    }

    private int excluir(int[] vetor, int posicaoFim, Scanner teclado) {
        int posicao = pesquisar(vetor, posicaoFim, teclado);
        if (posicao != -1) {
            for (int i = posicao; i < (posicaoFim - 1); i++) {
                vetor[i] = vetor[i + 1];
                System.out.println("Valor excluído com sucesso!!!!");
            }
            return --posicaoFim;
        }
        System.out.println("Valor não existe para ser excluído");
        return posicaoFim;
    }

    private void alterar(int[] vetor, int posicaoFim, Scanner teclado) {
        int posicao = pesquisar(vetor, posicaoFim, teclado);
        if (posicao != -1) {
            System.out.printf("Informe valor a ser trocado na posição %d: ", posicao);
            vetor[posicao] = teclado.nextInt();
            System.out.println("Valor trocado com sucesso!!!");
        } else {
            System.out.println("Valor não existe. Impossível trocar!");
        }
    }

    private int pesquisar(int[] vetor, int posicaoFim, Scanner teclado) {
        System.out.print("Informe valor a pesquisar: ");
        int valor = teclado.nextInt();
        for (int i = 0; i < posicaoFim; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    private int incluir(int[] vetor, int posicaoFim, Scanner teclado) {
        if (posicaoFim < vetor.length) {
            System.out.printf("Informe valor (posição %d): ", posicaoFim);
            vetor[posicaoFim] = teclado.nextInt();
            System.out.printf("Valor %d inserido com sucesso na posição %d.%n", vetor[posicaoFim], posicaoFim);
            posicaoFim++;
        } else {
            System.out.println("VETOR CHEIO!!!\nNão é possível incluir valores!");
        }
        return posicaoFim;
    }

    private void mostraMenu() {
        System.out.println("*** MENU PRINCIPAL ***");
        System.out.println("1 - Incluir valor");
        System.out.println("2 - Pesquisar valor");
        System.out.println("3 - Alterar valor");
        System.out.println("4 - Excluir valor");
        System.out.println("5 - Mostrar valores");
        System.out.println("6 - Ordenar valores");
        System.out.println("7 - Inverter valores");
        System.out.println("8 - Sair do sistema");
        System.out.print("Informe a opção desejada: ");
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
