package documentacao;

import relacionamentos.heranca.*;

/**
 * Classe Carro simula o comportamento de um carro e herda da classe Veiculo.
 * @author Fabiana Freitas Mendes
 * @since 2023
 * @version 1.1
 */
public class Carro extends Veiculo {
	
    private boolean status; 
    
    /**
     * Retorna o status do carro. TRUE se ligado e FALSE se desligado.
     * @return boolean
     */
    public boolean getStatus() {
        return status;
    }
    
    /**
     * Altera o status do carro para TRUE (ligado).
     */
    public void ligar() {
        status = true;
    }
    /**
     * Altera o status do carro para FALSE (desligado).
     */
    public void desligar() {
        status = false;
    }
    /**
     * Sobrescreve metodo acelerar da classe pai Veiculo.
     * A velocidade e incrementada em 2 em relacao a velocidade atual do carro.
     */
    public void acelerar() { 
        final int turbo = 2; 
        float novaVelocidade = getVelocidade();
        if (getVelocidade() <= 10) {
            novaVelocidade += turbo;
            setVelocidade(novaVelocidade);     
        }
    }
    
    /**
     * Sobrescreve metodo toString() das classes Object e Veiculo. Constroi
     * uma String contendo o valor de todas as variaveis da classe Carro.
     * @return String
     */
    public String toString() {
    	String status = getStatus() ? "ligado" : "desligado";
    	return "Esse veiculo e um carro. Marca = " + 
    			this.getMarca() + ". Velocidade = " + 
    			this.getVelocidade() + ". Status = " +  
    			status;
    }
}
