public class NumerosRandomicos {

    private int randomicoEntre(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    private int randomicoEntreInclusive(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private int randomicoEntre(int min, int max, boolean inclusive) {
        return (int) (Math.random() * (max - min + (inclusive ? 1 : 0)) + min);

    }

    public NumerosRandomicos() {
        for (int i = 0; i < 10; i++) {
            System.out.println(randomicoEntreInclusive(3.9, 7.6, true));
        }
    }

    public int randomicoEntreInclusive(double min, double max, boolean inclusive) {
        min = Math.ceil(min);
        max = Math.floor(max);
        return (int) Math.floor(Math.random() * 
                     (max - min + (inclusive ? 1 : 0)) + min);
    }

    public static void main(String[] args) {
        new NumerosRandomicos();
        // for (int i = 0; i < 10; i++) {
        // System.out.println((int) (Math.random() * 11));
        // }
    }
}
