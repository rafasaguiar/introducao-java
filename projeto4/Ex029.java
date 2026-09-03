import java.util.Scanner;

public class Ex029 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Inserindo o produto 1: ");

        System.out.print("Insira o nome: ");
        String nome1 = scanner.nextLine();

        System.out.print("Insira o preco: ");
        double preco1 = scanner.nextDouble();


        Produtos produto1 = new Produtos(nome1, preco1);

        System.out.printf("Produto 1: %s | Preco: R$ %.2f%n", produto1.getNome(), produto1.getPreco());

        System.out.print("Qual o valor de reajuste do produto (0 a 100)%? ");
        double reajuste = scanner.nextDouble();

        produto1.reajustarPreco(reajuste);

        double valorFinal = produto1.getPreco();

        System.out.printf("O valor do produto '%s', apos o reajuste, sera de R$ %.2f%n", produto1.getNome(), valorFinal);


        scanner.close();

    }
}