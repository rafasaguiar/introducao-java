import java.util.Scanner;

public class Ex004 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite a distancia (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o combustivel gasto (L): ");
        double combustivel = scanner.nextDouble();

        double consumoMedio = distancia/combustivel;

        System.out.printf("[RELATORIO] %s | Consumo Medio: %.2f km/L", modelo, consumoMedio);

        scanner.close();
    }

}