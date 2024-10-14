import java.util.Scanner;

public class Radiacao {
    private static final double MASSA_LIMITE = 0.25;
    private static final int TEMPO_DECAIMENTO = 150;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a massa do elemento (em gramas).: ");
        double massaInicial = teclado.nextDouble();
        long tempoSegundos = 0;
        double massa = massaInicial;
        while (massa > MASSA_LIMITE) {
            tempoSegundos += TEMPO_DECAIMENTO;
            massa /= 2;
        }
        long horas = tempoSegundos / 3600;
        long minutos = (tempoSegundos % 3600) / 60;
        long segudos = (tempoSegundos % 3600) % 60;
        System.out.printf("Massa inicial: %.2fg - Massa final: %.2f%nTempo decorrido%n\t%ds%n\t%02d:%02d:%02d%n", massaInicial, massa, tempoSegundos, horas, minutos, segudos);
    }
}
