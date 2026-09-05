public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria (String titular) {
        this.titular = titular;
        saldo = 0;
    }

    public String getTitular () {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar (double deposito) {
        if (deposito > 0) {
            saldo = saldo + deposito;
            System.out.printf("Saldo apos o deposito: R$ %.2f%n", saldo);
        }
        else {
            System.out.println("[ERRO] Valor invalido!");
        }
    }

    public void sacar (double saque) {
        if (saque <= saldo) {
            saldo = saldo - saque;
            System.out.printf("Saldo apos o saque: R$ %.2f%n", saldo);
        }
        else {
            System.out.println("[ERRO] Valor invalido!");
        }
    }

}