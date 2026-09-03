import java.util.Scanner;

public class Ex009 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Insira a altitude em pes: ");
        double altitude = scanner.nextDouble();

        if (altitude < 1000.0) {
            System.out.println("[ALERTA] Altitude crítica! Iniciar procedimento de arremetida.");
        } else {
            System.out.println("[NORMAL] Altitude segura para voo de cruzeiro.");
        }

        scanner.close();

    }
}