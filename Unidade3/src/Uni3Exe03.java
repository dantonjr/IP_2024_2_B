import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o total do pagamento...: ");
        float valorTotalPagamento = teclado.nextFloat();
        System.out.print("Informe preço da gasolina......: ");
        float precoGasolina = teclado.nextFloat();
        float totalLitros = valorTotalPagamento / precoGasolina;
        System.out.println("Total de litros abastecidos: " + totalLitros);
        DecimalFormat df = new DecimalFormat("###,##0.00");
        System.out.println("Total de litros abastecidos: " + df.format(totalLitros));
        teclado.close();
    }
}
