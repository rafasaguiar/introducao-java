import java.util.Scanner;

public class Ex012 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione uma opcao: ");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Efetuar Deposito");
        System.out.println("3 - Solicitado Emprestimo");

        System.out.print("Digite aqui: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("[SERVIÇO] Opção selecionada: Consulta de Saldo.");
                break;

            case 2: 
                System.out.println("[SERVIÇO] Opção selecionada: Depósito em Conta.");
                break;

            case 3: 
                System.out.println("[SERVIÇO] Opção selecionada: Solicitação de Empréstimo.");
                break;

            default: 
                System.out.println("[ERRO] Opção invalida! Encerrando atendimento.");
                break;
        }

        scanner.close();
        
        
    }
}