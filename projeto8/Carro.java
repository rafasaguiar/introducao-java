public class Carro {

    private String modelo;
    private String marca;
    private int potencia;

    public Carro (String modelo, String marca, int potencia) {
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public int getPotencia () {
        return potencia;
    }

    public void setPotencia (int potencia) {
        if (potencia > 0) {
            this.potencia = potencia;
        }
        else {
            System.out.println("[ERRO] Potência deve ser maior que 0 CV!");
        }
    }

    public String obterDados() {
        return String.format ("Modelo: %s | Marca: %s | Potência: %d%n", modelo, marca, potencia);
    }
}