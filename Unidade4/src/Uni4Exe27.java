import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Hora  Chegada: ");
        int horaChegada = teclado.nextInt();
        System.out.print("Minuto Chegada: ");
        int minChegada = teclado.nextInt();
        System.out.print("Hora Saída: ");
        int horaSaida = teclado.nextInt();
        System.out.print("Minuto Saída: ");
        int minSaida = teclado.nextInt();

        if (horaChegada >= 0 && horaChegada <= 24 &&
                minChegada >= 0 && minChegada <= 60 &&
                horaSaida >= 0 && horaSaida <= 24 &&
                minSaida >= 0 && minSaida <= 60 &&
                horaSaida >= horaChegada) {

            int minChegadaTotal = (horaChegada * 60) + minChegada;
            int minSaidaTotal = (horaSaida * 60) + minSaida;
            int totalMinutos = minSaidaTotal - minChegadaTotal;

            int qtdHoras = totalMinutos / 60;
            int qtdMinutos = totalMinutos % 60;

            System.out.printf("Horas: %d - Minutos: %d.%n", qtdHoras, qtdMinutos);
            if (qtdMinutos >= 30) {
                qtdHoras++;
            }
            System.out.printf("Pagará por %d hora(s).%n", qtdHoras);
            float valorCobrado = 0;
            switch (qtdHoras) {
                case 0:
                case 1:
                    valorCobrado = 5;
                    break;
                case 2:
                    valorCobrado = 10;
                    break;
                case 3:
                    valorCobrado = (float) 17.5;
                    break;
                case 4:
                    valorCobrado = 25;
                    break;
                default:
                    valorCobrado = 25 + (10 * (qtdHoras - 4));
                    break;
            }
            System.out.printf("Valor cobrado: %.2f.%n", valorCobrado);
        } else {
            System.out.println("Hora/Minuto INVÁLIDO!!!");
        }
        teclado.close();
    }
}
