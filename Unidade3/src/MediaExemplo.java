public class MediaExemplo {
    public static void main(String[] args) {
        final int PESO_1 = 10;
        final int PESO_2 = 1;
        final int PESO_3 = 17;
        final int PESO_TOTAL = PESO_1 + PESO_2 + PESO_3;
        float nota1 = 10;
        float nota2 = 5;
        float nota3 = 10;
        float media = ((nota1 * PESO_1) +
                       (nota2 * PESO_2) + 
                       (nota3 * PESO_3)) 
                       / PESO_TOTAL;
        System.out.println("A média é: " + media);
    }
}
