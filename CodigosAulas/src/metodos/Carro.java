package metodos;

//Depois da palavra reservada "class" vem o nome da classe.
public class Carro {
	/* Os atributos devem vir logo depois do nome da classe.
	 * Defina quantos forem necesarios 
	 */
	String marca;
	String cor;
	int numPortas;
	int ano;
	boolean movimento;
	// Depois da lista de atributos defina o construtor
	public Carro (String marca, String cor, int n, int a, 
			boolean mov) {
		this.marca = marca;
		this.cor = cor;
		numPortas = n;
		ano = a;
		movimento = mov;
	}
	// Depois do construtor vem os gets e sets
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	// Agora vem os metodos do objeto
	public void movimentar() {
		movimento = true;
	}
	public void parar() {
		movimento = false;
	}
}
