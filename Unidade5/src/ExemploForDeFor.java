public class ExemploForDeFor {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.printf("i: %d - j: %d - k: %d%n", i, j, k);
                }
            }
        }
    }

}
