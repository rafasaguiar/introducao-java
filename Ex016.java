import java.util.Scanner;

public class Ex016 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int opcao;

        do {
            System.out.println("-- PAINEL DE CONTROLE");
            System.out.println("1 - Ligar Motores");
            System.out.println("2 - Desligar Motores");
            System.out.println("0 - Sair do Sistema");

            System.out.print("Digite a opcao desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1: [SISTEMA] Motores acionados.");
                    break;

                case 2:
                    System.out.println("2: [SISTEMA] Motores desligados.");
                    break;

                case 0:
                    System.out.println("[SISTEMA] Encerrando sessão...");
                    break;

                default:
                    System.out.println("[ERRO] Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }

}