import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        // Scanner teclado = new Scanner(System.in);
        // System.out.print("Informe sexo (M/F/I)..: ");
        // char sexo = teclado.next().charAt(0);
        // String resultado = "";
        // switch (sexo) {
        // case 'F':
        // case 'f':
        // resultado = "Feminino";
        // break;
        // case 'I':
        // case 'i':
        // resultado = "Indiferente";
        // break;
        // case 'M':
        // case 'm':
        // resultado = "Masculino";
        // break;
        // default:
        // resultado = "Entrada Incorreta";
        // break;
        // }
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe sexo (M/F/I)..: ");
        char sexo =  Character.toUpperCase(teclado.next().charAt(0));

        String resultadoTer = sexo == 'F' ? "Feminino" : sexo == 'I' ? "Indiferente" : sexo == 'M' ? "Masculino" : "Entrada Incorreta"; 

        String resultado = "";
        switch (sexo) {
            case 'F':
                resultado = "Feminino";
                break;
            case 'I':
                resultado = "Indiferente";
                break;
            case 'M':
                resultado = "Masculino";
                break;
            default:
                resultado = "Entrada Incorreta";
                break;
        }

        System.out.println(resultado + "\n" + resultadoTer);
    }

}
