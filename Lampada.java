public class Lampada {
    private String marca;
    private String modelo;
    private int potencia;
    private String cor;
    private double preco;
    private boolean ligada;
    
    // construtor
    public Lampada(String marca, String modelo, int potencia, String cor, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.cor = cor;
        this.preco = preco;
        this.ligada = false;
    }
    
    // getters e setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getPotencia() {
        return potencia;
    }
    
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public boolean isLigada() {
        return ligada;
    }
    
    // métodos da lâmpada
    public void ligar() {
        this.ligada = true;
    }
    
    public void desligar() {
        this.ligada = false;
    }
}
