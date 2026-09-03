import java.util.Scanner;

public class Ex014 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o valor inicial da contagem: ");
        int tempoInicial = scanner.nextInt();
        

        for (int i = tempoInicial; i >= 0; i--) {
            System.out.printf("[LANÇAMENTO] T-minus %ds%n", i);
        }

        System.out.println("[SISTEMA] Decolar! Foguete lançado com sucesso.");

        scanner.close();

    }
}