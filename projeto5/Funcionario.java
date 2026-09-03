public class Funcionario {
    
    private String nome;
    private String cargo;
    private double salarioBase;

    public Funcionario(String nome, String cargo, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo (String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase (double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String obterFicha() {
        String ficha = String.format("FICHA: %s | Cargo: %s | Salário: R$ %.2f", nome, cargo, salarioBase);
        return ficha;
    }

    public double calcularSalarioLiquido(double percentualDesconto) {
        return this.salarioBase - (this.salarioBase * (percentualDesconto / 100));
    }
}
