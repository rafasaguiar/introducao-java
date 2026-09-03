import java.util.Scanner;

public class Ex025 {

    public static double calcularArea (double lado) {
        return lado * lado;
    }

    public static double calcularArea (double largura, double altura) {
        return largura * altura;
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Insira o lado do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();

        System.out.println("Insira a largura do retangulo: ");
        double larguraRetangulo = scanner.nextDouble();

        System.out.println("Insira a altura do retangulo: ");
        double alturaRetangulo = scanner.nextDouble();

        System.out.printf("ÁREA DO QUADRADO: %.2fm²%n", calcularArea(ladoQuadrado));
        System.out.printf("ÁREA DO RETANGULO: %.2f²%n", calcularArea(larguraRetangulo, alturaRetangulo));

        scanner.close();

    }

}