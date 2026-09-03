import java.util.Scanner;

public class Ex018 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        double[] colheita = new double[5];

        for (int i = 0; i < colheita.length; i++) {
            System.out.printf("Digite a colheita do Dia %d (toneladas): ", i + 1);
            colheita[i] = scanner.nextDouble();
        }

        for (int i = 0; i < colheita.length; i++) {
            
            System.out.printf("[PRODUCAO] Dia %d: %.2f toneladas%n", i + 1, colheita[i]);
        }

        scanner.close();

    }
}