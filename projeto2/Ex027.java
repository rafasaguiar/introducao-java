import java.util.Scanner;

public class Ex027 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        ContaBancaria conta1 = new ContaBancaria();

        System.out.print("Qual o nome do titular da conta 1? ");
        String titular1 = scanner.nextLine();

        System.out.print("Qual o saldo do titular da conta 1? ");
        double saldo1 = scanner.nextDouble();

        conta1.setTitular(titular1);
        conta1.setSaldo(saldo1);

        System.out.printf("Nome do titular da conta 1: %s | Saldo: R$ %.2f", conta1.getTitular(), conta1.getSaldo());

        scanner.close();


    }
}