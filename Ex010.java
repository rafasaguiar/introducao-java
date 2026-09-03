import java.util.Scanner;

public class Ex010 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a temperatura do paciente: ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 35.5) {
            System.out.println("[TRIAGEM] Estado: Hipotermia");
        }
        else if (temperatura <= 37.5) {
            System.out.println("[TRIAGEM] Estado: Normal");
        }
        else if (temperatura <= 38.5) {
            System.out.println("[TRIAGEM] Estado: Febril");
        }
        else {
            System.out.println("[TRIAGEM] Estado: Febre Alta");
        }

        scanner.close();
    }

}