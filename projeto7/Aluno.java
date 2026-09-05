public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;

    public Aluno (String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1 (double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2 (double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia () {
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public boolean isAprovado () {
        return calcularMedia() >= 7.0;
    }

    public String obterStatus() {
        String situacao = isAprovado() ? "APROVADO" : "REPROVADO";
        return String.format("Nome: %s | Nota 1: %.2f | Nota 2: %.2f | Media: %.2f | Status: %s", nome, nota1, nota2, calcularMedia(), situacao);
    }

}