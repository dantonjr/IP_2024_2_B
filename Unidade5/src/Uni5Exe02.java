public class Uni5Exe02 {
    public static void main(String[] args) {
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            } else {
                somaImpares += i;
            }
        }
        System.out.println("Soma dos pares..: " + somaPares);
        System.out.println("Soma dos ímpares..: " + somaImpares);
        
        // Forma 2;
        somaPares = 0;
        for (int i = 2; i <= 100; i += 2) {
            somaPares += i;
        }
        somaImpares = 0;
        for (int i = 1; i <= 100; i += 2) {
            somaImpares += i;
        }
        System.out.println("Soma dos pares..: " + somaPares);
        System.out.println("Soma dos ímpares..: " + somaImpares);

    }
}
