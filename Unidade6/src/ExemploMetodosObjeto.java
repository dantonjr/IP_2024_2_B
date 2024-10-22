public class ExemploMetodosObjeto {
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
        ExemploMetodosObjeto emo =new ExemploMetodosObjeto();
        int a = 10;
        int b = 100;
        int resultado = emo.soma(a, b);
        System.out.println(resultado);
        resultado = emo.soma(35, 8);
        System.out.println(resultado);
        resultado = emo.soma(emo.soma(a, 10), b);
        System.out.println(resultado);
        resultado = emo.subttrai(10, 3);
        System.out.println(resultado);
        resultado = emo.subttrai(emo.soma(100, b), emo.soma(10, 5));
        System.out.println(resultado);
    }

}
