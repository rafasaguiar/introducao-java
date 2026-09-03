import java.util.Scanner;

public class Ex006 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Quantidade de itens produzidos: ");
        int produtos = scanner.nextInt();

        int caixasCheias = produtos / 12;
        int sobra = produtos % 12;

        System.out.printf("[LOGISTICA] Total: %d itens | Caixas Cheias: %d | Itens Avulsos: %d", produtos, caixasCheias, sobra);

        scanner.close();

        }
    }