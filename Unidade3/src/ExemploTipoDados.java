import java.text.DecimalFormat;
import java.util.Locale;

import javax.crypto.spec.DESKeySpec;

public class ExemploTipoDados {
    public static void main(String[] args) {
        // long valor = 10_000_000L;
        // int valor2 = 9098;
        // float numero = (float) 23.90;
        // System.out.println(numero);
        // System.out.println((int) numero);


        // double valor = 1234.9876523;
        // double valor2 = 0.1;
        // float valor3 = (float) 12345.92;
        // System.out.println(valor);
        // System.out.println(valor2);
        // System.out.println(valor3);
        // DecimalFormat df = new DecimalFormat("0,000.000");
        // DecimalFormat df2 = new DecimalFormat("#,##0.00#");
        // System.out.println(df.format(valor));
        // System.out.println(df2.format(valor));
        // System.out.println(df.format(valor2));
        // System.out.println(df2.format(valor2));
        // System.out.println(df.format(valor3));
        // System.out.println(df2.format(valor3));
    
        String nome = "Danton";
        String cidade = "Blumenau";
        System.out.println("O " + nome + " mora em " + cidade + " há muito tempo");
        System.out.printf("O %s mora em %s ha muito tempo%n", nome, cidade);
        System.out.printf("O %s mora em %s ha muito tempo", nome, cidade);

    
    }
}
