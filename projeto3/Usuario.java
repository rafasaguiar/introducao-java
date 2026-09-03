public class Usuario {

    private String nome;
    private String email;

    public Usuario (String nome, String email) { // construtor com parametros string (para nome) e string (para email)
        this.nome = nome;
        this.email = email;
    }

    public Usuario () { // construtor simples, sem parametros especificos
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }
}