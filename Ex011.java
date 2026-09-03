import java.util.Scanner;

public class Ex011 {

    public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a sua idade: ");
    int idade = scanner.nextInt();

    System.out.println("Usuario VIP? (True / False)");
    boolean vip = scanner.nextBoolean();

    if (idade >= 18 && vip) {
        System.out.println("[ACESSO] Autorizado! Bem-vindo ao servidor exclusivo.");
    }
    else {
        System.out.println("[ACESSO] Negado! Requisitos minimos nao preenchidos.");
    }

    scanner.close();

    }
    
}
