import java.util.Scanner;

public class Ex003 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.printf("[TRIAGEM] Paciente: %s | Peso: %.1f kg", nome, peso);

        scanner.close();

    }

}