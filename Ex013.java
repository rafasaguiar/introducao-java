import java.util.Scanner;

public class Ex013 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Qual o valor da compra? ");
        double valor = scanner.nextDouble();

        double frete = (valor >= 200.0) ? 0.0 : 25.0;

        System.out.printf("[FRETE] Valor da Compra: R$ %.2f | Frete: R$ %.2f %n", valor, frete);

        scanner.close();
    }
}