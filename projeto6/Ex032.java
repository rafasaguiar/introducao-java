import java.util.Scanner;

public class Ex032 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Insira o nome do titular da conta: ");
        String titular1 = scanner.nextLine();

        ContaBancaria conta1 = new ContaBancaria(titular1);

        System.out.print("Insira o valor a ser depositado: ");
        double deposito1 = scanner.nextDouble();
        conta1.depositar(deposito1);
            
        System.out.print("Insira o valor a ser sacado: ");
        double saque1 = scanner.nextDouble();
        conta1.sacar(saque1);


        System.out.printf("%s, seu saldo final apos operacoes é de: R$ %.2f%n", conta1.getTitular(), conta1.getSaldo());

        scanner.close();
    
    }
}
