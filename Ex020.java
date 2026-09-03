import java.util.Scanner;

public class Ex020 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int[] pecas = new int[6];

        for (int i = 0; i < pecas.length; i++) {
            System.out.printf("Insira o codigo da %dª peca (0 ou 1): ", i + 1);
            int codigo = scanner.nextInt();

            while (codigo != 0 && codigo != 1) {
                System.out.printf("[ERRO] Insira o codigo da %dª peca apenas digitando 0 ou 1: ", i + 1);
                codigo = scanner.nextInt();
            }

            pecas[i] = codigo;
        }

        int aprovadas = 0;

        for (int peca : pecas) {
            if (peca == 1) {
                aprovadas++;
            }
        }

        System.out.printf("[QUALIDADE] Peças Aprovadas: %d de %d%n", aprovadas, pecas.length);

        scanner.close();
    }

}