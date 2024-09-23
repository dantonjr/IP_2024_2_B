public class ExemploPrintF {
    public static void main(String[] args) {
        int inteiro1 = 10, inteiro2 = 20;
        double duplo = 10.78;
        String mensagem = "Boa noite!!!";
        System.out.println("Ola - " + mensagem + " numeros inteiros: " + inteiro1 + " e " + inteiro2
                + " - numeros reais: " + duplo + " e " + Math.PI);
        System.out.printf("Olá - %s numeros inteiros: %d e %d - numeros reais: %.2f e %.5f.%n",
                mensagem,
                inteiro1,
                inteiro2, duplo, Math.PI);
    }

}
