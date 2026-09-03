public class Ex002 {

    public static void main (String[] args) {

        double saldoInicial = 150.50;
        double valorCompra = 42.25;
        double saldoFinal = saldoInicial - valorCompra;

        System.out.println ("-- EXTRATO FINANCEIRO --");
        System.out.printf("Saldo Anterior: R$ %.2f%n", saldoInicial);
        System.out.printf ("Compra Realizada: R$ %.2f%n", valorCompra);
        System.out.printf ("Novo Saldo: R$ %.2f%n", saldoFinal);
    }
}