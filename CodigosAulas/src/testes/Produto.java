package testes;

public class Produto {
	private String nome;
	private String fabricante;
	private double valorCompra;
	
	public Produto(String nome, String fabricante, double valorCompra) {
		super();
		this.nome = nome;
		this.fabricante = fabricante;
		this.valorCompra = valorCompra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public double calcularValorVenda(double porcentagemLucro) {
		return valorCompra + (valorCompra*porcentagemLucro);
	}
	
}
