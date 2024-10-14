import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe nome...: ");
        String nome = teclado.nextLine();
        while (!nome.equalsIgnoreCase("fim")) {
            System.out.print("Informe n1.....: ");
            float n1 = teclado.nextFloat();
            System.out.print("Informe n2.....: ");
            float n2 = teclado.nextFloat();
            float media = (n1 + n2) / 2;
            System.out.printf("O aluno %s teve média %.2f.%n", nome, media);
            System.out.print("Informe nome...: ");
            nome = teclado.next();
        }
        teclado.close();
    }
}
