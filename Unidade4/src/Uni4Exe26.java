import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("** MENU PRINCIPAL **");
        System.out.println("T -> calcular a área de um triângulo de base b e altura h");
        System.out.println("Q -> calcular a área de um quadrado de lado l");
        System.out.println("R -> calcular a área de um retângulo de base b e altura h");
        System.out.println("C -> calcular a área de um círculo de raio r");
        System.out.print("Informe a opção desejada..: ");
        char opcao = Character.toUpperCase(teclado.next().charAt(0));
        double area = 0;
        boolean temArea = true;
        switch (opcao) {
            case 'C':
                System.out.println("*** ÁREA DO CÍRCULO ***");
                System.out.print("Informe o Raio: ");
                double raio = teclado.nextDouble();
                area = Math.PI * Math.pow(raio, 2);
                break;
            case 'Q':
                System.out.println("*** ÁREA DO QUADRADO ***");
                System.out.print("Informe o Lado: ");
                double lado = teclado.nextDouble();
                area = Math.pow(lado, 2);
                break;
            case 'R':
                System.out.println("*** ÁREA DO RETÂNGULO ***");
                System.out.print("Informe o Base...: ");
                double base = teclado.nextDouble();
                System.out.print("Informe o Altura.: ");
                double altura = teclado.nextDouble();
                area = base * altura;
                break;
            case 'T':
                System.out.println("*** ÁREA DO TRIÂNGULO ***");
                System.out.print("Informe o Base...: ");
                base = teclado.nextDouble();
                System.out.print("Informe o Altura.: ");
                altura = teclado.nextDouble();
                area = (base * altura) / 2;
                break;
            default:
                System.out.println("Opção INVÁLIDA!!!");
                temArea = false;
                break;
        }
        System.out.println(temArea ? 
                        String.format("Área calculada %.4f.", area) :
                        "Sem área para calcular!");

        // if (temArea) {
        //     System.out.printf("Área calculada %.4f.", area);
        // } else {
        //     System.out.println("Sem área para calcular!");
        // }
    }
}
