public class ExemploVetores {
    public static void main(String[] args) {
        int[] valores = new int[6];
        String[] nomes = { "Maria", "João", "Camila" };
        float[] notas = { 23.6F, 11.78F, 45.7F, 89F, 4F, 23.57F };
        nomes[1] = "Danton";

        for(int i = 0; i < nomes.length; i++) {
              System.out.println(nomes[i]);
        }
        for (float nota : notas) {
            System.out.println(nota);
        }

        for (String nome : nomes) {
            System.out.printf("O nome é: %s%n", nome);
        }

        nomes[10] = "Xico";
    }
}
