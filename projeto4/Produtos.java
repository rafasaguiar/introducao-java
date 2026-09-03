public class Produtos {

    private String nome;
    private double preco;

    public Produtos (String nome, double preco) { // Construtor Parametrizado (Sem void (retorno), mesmo nome da classe)
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { // get lê e retorna o nome
        return nome;
    }

    public void setNome(String nome) { // set abre para escrever / alterar o nome
        this.nome = nome;
    }

    public double getPreco() { // get lê e retorna o preco
        return preco;
    }

    public void setPreco(double preco) { // set abre pra excrever / alterar o preco
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public void reajustarPreco (double percentual) { // metodo de acao, ele vai calcular o reajuste
        this.preco = this.preco + (this.preco * (percentual/100));
    }

    }