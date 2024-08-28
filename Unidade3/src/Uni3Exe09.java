import java.util.Scanner;

public class Uni3Exe09 {

    static final double MEU_PI = 3.141593;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o raio...: ");
        double raio = teclado.nextDouble();
        System.out.print("Entre com a altura.: ");
        double altura = teclado.nextDouble();
        double volume = MEU_PI * (raio * raio) * altura;
        System.out.printf("O volume é: %f.%n", volume);
        
        double raio2 = Math.PI * Math.pow(raio, 2) * altura;
        System.out.printf("O volume é: %f.%n", raio2);
        

    }
}
