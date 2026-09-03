import java.util.Scanner;

public class Ex019 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        double[] temperaturas = new double[4];
        double soma = 0;


        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Digite a %dª temperatura em graus celsius: ", i + 1);
            temperaturas[i] = scanner.nextDouble();

            soma = soma + temperaturas[i];
        }

        double maior = temperaturas[0];

        for (int i = 0; i < temperaturas.length; i++) {
            
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
            
        }


        double media = soma / temperaturas.length;

        System.out.printf("[METEO] Média diária: %.2f°C %n", media);
        System.out.printf("[METEO] Maior temperatura: %.2f°C %n", maior);

        scanner.close();

    }

}