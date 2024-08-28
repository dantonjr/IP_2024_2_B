import java.util.Scanner;

public class Uni3Uri014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe valor...: ");
        double valor = teclado.nextDouble();
        int n100 = (int) (valor / 100);
        int n50 = (int) ((valor % 100) / 50);
        int n20 = (int) (((valor % 100) % 50) / 20);
        int n10 = (int) ((((valor % 100) % 50) % 20) / 10);
        int n5 = (int) (((((valor % 100) % 50) % 20) % 10) / 5);
        int n2 = (int) ((((((valor % 100) % 50) % 20) % 10) % 5) / 2);
        int n1 = (int) (((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1);
        double valor100 = valor * 100;
        int n050 = (int) ((valor100 % 100) / 50);
        int n025 = (int) (((valor100 % 100) % 50) / 25);
        int n010 = (int) ((((valor100 % 100) % 50) % 25) / 10);
        int n005 = (int) (((((valor100 % 100) % 50) % 25) % 10) / 5);
        int n001 = (int) (((((((valor100 % 100) % 50) % 25) % 10) % 5) / 1));

        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        System.out.println(n1 + " moeda(s) de R$ 1.00");
        System.out.println(n050 + " moeda(s) de R$ 0.50");
        System.out.println(n025 + " moeda(s) de R$ 0.25");
        System.out.println(n010 + " moeda(s) de R$ 0.10");
        System.out.println(n005 + " moeda(s) de R$ 0.05");
        System.out.println(n001 + " moeda(s) de R$ 0.01");
        
        teclado.close();
    }
}
