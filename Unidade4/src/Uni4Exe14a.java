import java.util.Scanner;

public class Uni4Exe14a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = teclado.nextInt();
        System.out.print("Digite o mês: ");
        int mes = teclado.nextInt();
        System.out.print("Digite o ano: ");
        int ano = teclado.nextInt();

        boolean diasTrinta = dia <= 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11);

        boolean diasTrintaUm = dia <= 31
                && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12);

        boolean mesOK = mes >= 1 && mes <= 12;

        boolean anoBissexto = (ano % 4 == 0) && !(ano % 100 == 0 && ano % 400 != 0);

        boolean bissexto = mes == 2 && ((dia <= 28) || (dia <= 29 && anoBissexto));

        boolean dataValida = (mesOK && diasTrinta) ||
                (mesOK && diasTrintaUm) ||
                bissexto;

        if (dataValida && ano > 0 && dia >= 1) {
            System.out.println("Data válida");
        } else {
            System.out.println("Data Inválida!!!");
        }
        teclado.close();
    }
}
