import java.util.Scanner;

public class Ex030 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Insira o nome do funcionario 1: " );
        String nome1 = scanner.nextLine();

        System.out.print("Insira o cargo do funcionario 1: " );
        String cargo1 = scanner.nextLine();

        System.out.print("Insira o salario base do funcionario 1: " );
        double salario1 = scanner.nextDouble();

        Funcionario funcionario1 = new Funcionario (nome1, cargo1, salario1);

        System.out.println(funcionario1.obterFicha());

        scanner.close();
        
    }
}