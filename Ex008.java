import java.util.Scanner;

public class Ex008 {

    public static void main (String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.print("Insira a frequência em GHz: ");
        double frequencia = scanner.nextDouble();

        int canalInteiro = (int) frequencia;
        short frequenciaKHz = (short) (canalInteiro * 100);

        System.out.printf("[TELECOM] Frequencia original: %.2f | Canal convertido (int): %d | Sinal: %d", frequencia, canalInteiro, frequenciaKHz);

        scanner.close();

    }
}