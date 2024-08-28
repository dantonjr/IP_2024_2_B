import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe número (XYK)..: ");
        int numero = teclado.nextInt();
        int centenas = numero / 100;
        int dezenas = (numero - (centenas * 100)) / 10;
        // int unidades = numero - (centenas * 100) - (dezenas * 10);
        int unidades = numero % 10;
        System.out.printf("%d centena(s)  %d dezena(s) %d unidade(s)", centenas, dezenas, unidades);
    }
}
