import java.util.Scanner;

public class Ex024 {

    public static boolean isAprovado(double media) {
        return media >= 7.0;
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite a nota da prova A: ");
        double notaA = scanner.nextDouble();

        System.out.print("Digite a nota da prova B: ");
        double notaB = scanner.nextDouble();

        double mediaAluno = (notaA + notaB) / 2;

        if (isAprovado(mediaAluno)) {
            System.out.printf("O aluno, com media %.2f, esta APROVADO.%n", mediaAluno);
        }

        else {
            System.out.printf("O aluno, com media %.2f, esta REPROVADO.%n", mediaAluno);
        }

        scanner.close();

    }

}