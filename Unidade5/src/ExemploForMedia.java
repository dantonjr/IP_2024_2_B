import java.util.Scanner;

public class ExemploForMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Informe nome..: ");
            String nome = teclado.next();
            System.out.print("Informe N1..: ");
            float n1 = teclado.nextFloat();
            System.out.print("Informe N2..: ");
            float n2 = teclado.nextFloat();
            System.out.print("Informe N3..: ");
            float n3 = teclado.nextFloat();
            System.out.println("Média: " + ((n1 + n2 + n3) / 3));
        }
    }
}
