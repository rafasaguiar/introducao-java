import java.util.Scanner;

public class Ex007 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Insira a velocidade da esteira (km/h): ");
        double velocidade = scanner.nextDouble();

        System.out.print("Insira o raio da base do amortecedor (m): ");
        double raio = scanner.nextDouble();

        double potencia = Math.pow(velocidade, 2);
        double areaBase = Math.PI * Math.pow(raio, 2);
        double raiz = Math.sqrt(potencia);

        System.out.printf("[BIOMEDICA] Potencia: %.2f | Area Amortecedor: %.2f cm2 | Indice Raiz: %.2f", potencia, areaBase, raiz);

        scanner.close();
    }

}
