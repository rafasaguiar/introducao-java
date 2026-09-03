import java.util.Scanner;

public class Ex021 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int[][] cinema = new int [3][4];

        for (int i = 0; i < cinema.length; i++) { // percorre as linhas
            for (int j = 0; j < cinema[i].length; j++) { // percorre as colunas
                System.out.printf("Informe o status do assento [%d][%d] (0-Livre, 1-Ocupado): ", i, j);
                cinema[i][j] = scanner.nextInt();

                while (cinema[i][j] != 0 && cinema[i][j] != 1) {
                    System.out.printf("ERRO! Informe o status do assento [%d][%d] com 0 (Livre) ou 1 (Ocupado)): ", i, j);
                    cinema[i][j] = scanner.nextInt();
                }

            }
        }

        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                System.out.printf("| " + cinema[i][j] + " |");
            }
            System.out.println();
        }

        scanner.close();

    }

}