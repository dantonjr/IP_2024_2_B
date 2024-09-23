public class ExemploCasting {
    public static void main(String[] args) {
        String mensagem = "Boa noite" + 10.56F;
        // float numero = 10.56F + "oi";
        float numero = 10.78763F;
        float numero2 = (float) 10.78763;
        double valor = (float) 10.78763;
        int inteiro = (int) valor;
    }
}
