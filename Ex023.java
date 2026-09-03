import java.util.Scanner;

public class Ex023 {
    
    public static double aplicarDesconto(double valor, double percentual) {
        double valorDesconto = valor * (percentual/100);
        return valor - valorDesconto;
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Qual o valor do produto? ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Qual o percentual de desconto (0 a 100)? ");
        double descontoPercentual = scanner.nextDouble();

        System.out.printf("[DESCONTO] Valor final com desconto: R$ %.2f%n", aplicarDesconto(valorProduto, descontoPercentual));

        scanner.close();

    }

}