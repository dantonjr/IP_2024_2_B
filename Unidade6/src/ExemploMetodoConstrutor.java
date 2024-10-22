public class ExemploMetodoConstrutor {

    public static void alucinado(int velocidade) {
        System.out.printf("velocidade %d", velocidade);
    }
    
    public ExemploMetodoConstrutor() {
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

    public int soma(int x, int y) {
        return x + y;
    }

    public double soma(double x, double y){
        return x + y;
    }

    public int subttrai(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        new ExemploMetodosObjeto();
    }
}
