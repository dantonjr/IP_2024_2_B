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
        System.out.printf("O %-30s mora em %s ha muito tempo%n", nome, cidade);
        System.out.printf("O %30s mora em %s ha muito tempo%n", nome, cidade);
        int inteiro = 1000;
        System.out.printf("Número da loteria %d, valeu%n", inteiro);
        System.out.printf("Número da loteria %07d, valeu%n", inteiro);

        double numero = 123456.789112;
        System.out.printf("O numero é %f legal%n", numero);
        System.out.printf("O numero é %.2f legal%n", numero);
        System.out.printf("O numero é %015.2f legal%n", numero);

        char caractere = 'a';
        System.out.printf("um caractere %c esta ali.%n", caractere);
        System.out.printf("um caractere %C esta ali.%n", caractere);

        System.out.printf("um nome %s, um numero %d, um valor %.2f, uma cidade %s e um caractere %c. Tudo junto", nome, inteiro, numero, cidade, caractere);

    }
}
