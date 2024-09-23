public class ExemploTernario {
    public static void main(String[] args) {
        int numero = 4;

        // teste ? retorno true : retorno false
        System.out.println(numero % 2 == 0 ? "é par" : "é ímpar");
        
        if (numero % 2 == 0) {
            System.out.println("É par");
        }else {
            System.out.println("é impar");
        }
    }
}
