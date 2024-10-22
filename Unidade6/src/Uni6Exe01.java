import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] valores = new int[3];

        // for(int i = 0; i < valores.length; i++) {
        //     System.out.printf("Informe valor posição %d: ", i);
        //     valores[i] = teclado.nextInt();
        // }

        // System.out.println("*** MOTRAR EM ORDEM INVERSA ***");
        // for (int i = valores.length - 1; i >= 0; i--) {
        //     System.out.printf("Valor da posição %d: %d%n", i, valores[i]);
        // }
        
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.printf("Informe valor da posição %d: ", (valores.length - i));
            valores[i] = teclado.nextInt();
        }

        System.out.println("*** MOTRAR NA ORDEM INVERSA ***");
        int i = valores.length;
        for(int valor : valores) {
            System.out.printf("Valor da posição %d é %d%n", i--, valor);
        }
    }
}
