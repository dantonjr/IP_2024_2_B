import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cateto 1...: ");
        double cateto1 = teclado.nextDouble();
        System.out.print("Cateto 2...: ");
        double cateto2 = teclado.nextDouble();
        double hipo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("Hipotenusa vale: %.3f", hipo);
        teclado.close();
    }
}
