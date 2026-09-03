import java.util.Scanner;

public class Ex017 {

    public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o status do lote %d: ", i);
            int status = scanner.nextInt();

            if (status == 1) {
                System.out.printf("[INSPEÇÃO] Lote %d processado com sucesso.%n", i);
            }
            else if (status == 2) {
                System.out.printf("[ALERTA] Lote %d com defeito! Pulando lote...%n", i);
                continue;
            }
            else if (status == 9) {
                System.out.printf("[EMERGÊNCIA] Falha crítica no lote %d! Parando a esteira.%n", i);
                break;

            }

        }

        scanner.close();
    }
    
}