package relacionamentos.abstrata;

public class Carro extends Veiculo {
	private boolean status;

	// Encapsulando a classe Carro
	public boolean getStatus() {
		return status;    
	}
	
	public void setStatus(boolean status) {
		this.status = status;    
	}
	
	public void liga() {        
		status = true;
	}
	
	public void desliga() {
		status = false;    
	}
	
	// Implementaca obrigatoria do metodo abstrato 
	public void mover() {
        final String combustivel = "gasolina";
        System.out.println("O veiculo e a gasolina" +
        "e esta em movimento");
    }
}
