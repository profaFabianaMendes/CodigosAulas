package testes;

public class Funcionario {
	private String nome;
	private double valorHora;
	private String funcao;
	
	public Funcionario(String nome, double valorHora, String funcao) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.funcao = funcao;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public double calcularSalatio(int horas, double comissao) {
		return (horas * valorHora) + comissao;
	}

}
