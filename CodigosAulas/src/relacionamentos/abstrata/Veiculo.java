package relacionamentos.abstrata;

public abstract class Veiculo {
    private String marca;
    private float velocidade;
    
    // Encapsulando a classe Veiculo
    public String getMarca() {
        return marca;    }
    
    public void setMarca(String marca) {
        this.marca = marca;    
    }
    
    public float getVelocidade() {
        return velocidade;    
    }
    
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;    
    }
    
    // metodo abstrato
    public abstract void mover();   
    
    public void frear() {
        if (velocidade > 0)
        velocidade--;
    }
    
    public void acelerar() {
        if (velocidade <= 250)
        velocidade++;
    }
}
