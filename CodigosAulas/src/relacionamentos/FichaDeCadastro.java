package relacionamentos;

public class FichaDeCadastro {
	Pessoa cliente;
	Plano plano_escolhido;
	
	public FichaDeCadastro(Pessoa cliente, Plano plano) {
		this.cliente = cliente;
		plano_escolhido = plano;
	}
	
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	public Plano getPlano_escolhido() {
		return plano_escolhido;
	}
	public void setPlano_escolhido(Plano plano_escolhido) {
		this.plano_escolhido = plano_escolhido;
	}

	public String imprimir() {
		return "FichaDeCadastro [cliente=" + cliente + ", plano_escolhido=" 
				+ plano_escolhido + "]";
	}
	
	
	

}
