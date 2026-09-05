import java.util.Scanner;

public class Ex033 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Insira o NOME do aluno 1: ");
        String nome1 = scanner.nextLine();

        System.out.print("Insira a NOTA da 1ª prova do aluno 1: ");
        double notaA = scanner.nextDouble();

        System.out.print("Insira a NOTA da 2ª prova do aluno 1: ");
        double notaB = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Insira o NOME do aluno 2: ");
        String nome2 = scanner.nextLine();

        System.out.print("Insira a NOTA da 1ª prova do aluno 2: ");
        double notaC = scanner.nextDouble();

        System.out.print("Insira a NOTA da 2ª prova do aluno 2: ");
        double notaD = scanner.nextDouble();

        Aluno aluno1 = new Aluno (nome1, notaA, notaB);
        Aluno aluno2 = new Aluno (nome2, notaC, notaD);

        System.out.println(aluno1.obterStatus());
        System.out.println(aluno2.obterStatus());


        scanner.close();

    }
    
}
