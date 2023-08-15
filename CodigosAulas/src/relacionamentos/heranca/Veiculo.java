package relacionamentos.heranca;

public class Veiculo {
    private String marca;
    private float velocidade;
    //Subclasse tem acesso ao valor armazenado em marca
    public String getMarca() {
        return marca;
    }
    //Subclasse pode alterar o valor de marca
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    public void frear() {
        if (velocidade > 0)
            velocidade--;
    }
    public void acelerar() {
        if (velocidade <= 10)
            velocidade++;
    }
    //Sobrescreve do metodo toString()
    public String toString() {
    	return "Marca = " + marca +
    			"Velocidade = " + velocidade;
    }
}
