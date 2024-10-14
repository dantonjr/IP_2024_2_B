public class ExemploFor {
    public static void main(String[] args) {
        int totalPares = 0;
        for (int i = 1; i <= 100; i++) {
            totalPares += i % 2 == 0 ? 1 : 0;
        }
        System.out.println(totalPares);
    }
}
