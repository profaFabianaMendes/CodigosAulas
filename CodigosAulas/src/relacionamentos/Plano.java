package relacionamentos;

public class Plano {
	String nome;
	double valor;
	String caracteristicas;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	@Override
	public String toString() {
		return "Plano [nome=" + nome + ", valor=" + valor + ", caracteristicas=" 
				+ caracteristicas + "]";
	}
	
	
}
