package relacionamentos;

public class Pessoa {
	String nome;
	String cpf;
	String rg;
	String tel_contato;
	String end_residencial;
	
	
	
	
	public Pessoa(String nome, String cpf, String rg, String tel_contato, String end_residencial) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.tel_contato = tel_contato;
		this.end_residencial = end_residencial;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTel_contato() {
		return tel_contato;
	}
	public void setTel_contato(String tel_contato) {
		this.tel_contato = tel_contato;
	}
	public String getEnd_residencial() {
		return end_residencial;
	}
	public void setEnd_residencial(String end_residencial) {
		this.end_residencial = end_residencial;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" 
				+ rg + ", tel_contato=" + tel_contato
				+ ", end_residencial=" + end_residencial + "]";
	}
	
	
	
	
}
