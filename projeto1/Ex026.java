import java.util.Scanner;

public class Ex026 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        Carro meuCarro = new Carro();

        System.out.print("Insira a marca do carro: ");
        meuCarro.marca = scanner.nextLine();

        System.out.print("Insira o modelo do carro: ");
        meuCarro.modelo = scanner.nextLine();

        System.out.print("Insira o ano de fabricacao do carro: ");
        meuCarro.ano = scanner.nextInt();

        System.out.printf("[GARAGEM] Veiculo cadastrado: %s | %s | %d%n", meuCarro.marca, meuCarro.modelo, meuCarro.ano);

        scanner.close();

    }

}