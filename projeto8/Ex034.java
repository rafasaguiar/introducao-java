import java.util.Scanner;

public class Ex034 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Insira o modelo do carro 1: ");
        String modelo1 = scanner.nextLine();

        System.out.print("Insira a marca do carro 1: ");
        String marca1 = scanner.nextLine();

        System.out.print("Insira a potencia, em CV, do carro 1: ");
        int potencia1 = scanner.nextInt();
        scanner.nextLine();

        Carro carro1 = new Carro (modelo1, marca1, potencia1);

        System.out.print("Insira o modelo do carro 2: ");
        String modelo2 = scanner.nextLine();

        System.out.print("Insira a marca do carro 2: ");
        String marca2 = scanner.nextLine();

        System.out.print("Insira a potencia, em CV, do carro 2: ");
        int potencia2 = scanner.nextInt();

        Carro carro2 = new Carro (modelo2, marca2, potencia2);

        System.out.println(carro1.obterDados());
        System.out.println(carro2.obterDados());

        if (carro1.getPotencia() > carro2.getPotencia()) {
            System.out.printf("A potencia do %s %s é maior que a do %s %s%n", carro1.getMarca(), carro1.getModelo(), carro2.getMarca(), carro2.getModelo());
        }
        else if (carro2.getPotencia() > carro1.getPotencia()) {
            System.out.printf("A potencia do %s %s é maior que a do %s %s%n", carro2.getMarca(), carro2.getModelo(), carro1.getMarca(), carro1.getModelo());
        }
        else {
            System.out.printf("A potencia do %s %s é igual a do %s %s%n", carro1.getMarca(), carro1.getModelo(), carro2.getMarca(), carro2.getModelo());
        }

        scanner.close();

    }
}