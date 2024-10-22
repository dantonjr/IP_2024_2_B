public class ExemploMetodos {

    public static int soma(int x, int y) {
        return x + y;
    }

    public static double soma(double x, double y){
        return x + y;
    }

    public static int subttrai(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int resultado = soma(a, b);
        System.out.println(resultado);
        resultado = soma(35, 8);
        System.out.println(resultado);
        resultado = soma(soma(a, 10), b);
        System.out.println(resultado);
        resultado = subttrai(10, 3);
        System.out.println(resultado);
        resultado = subttrai(soma(100, b), soma(10, 5));
        System.out.println(resultado);
    }
}
