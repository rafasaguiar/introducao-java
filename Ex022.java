import java.util.Scanner;

public class Ex022 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int matriz[][] = new int[3][3];

        int somaDiagonal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Preencha a matriz, elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();

                if (i == j) {
                    somaDiagonal = somaDiagonal + matriz[i][j];
                }

            }
        }

        System.out.printf("[DIAGONAL] Soma da Diagonal Principal: %d", somaDiagonal);

        scanner.close();

    }
}