import java.util.Scanner;

public class Ex005 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Insira a temperatura em graus celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("[MONITORAMENTO] Celsius: %.1f ºC | Fahrenheit: %.1f ºF | Kelvin: %.1f K", celsius, fahrenheit, kelvin);

        scanner.close();

    }

}