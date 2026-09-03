import java.util.Scanner;

public class Ex015 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        double totalCompra = 0.0;

        System.out.print("Digite o valor do item (ou valor negativo para encerrar):");
        double valorItem = scanner.nextDouble();


        while (valorItem >= 0.0) {

            totalCompra = totalCompra + valorItem;

            System.out.print("Digite o valor do item (ou valor negativo para encerrar):");
            valorItem = scanner.nextDouble();
        }

        System.out.printf("[CAIXA] Total da Compra: R$ %.2f%n", totalCompra);

        scanner.close();
    }

}