package metodos;

public class Robo {
	String modelo;
	String cor;
	int ano;
	String nSerie;
	boolean ligado;
	float direcao;
	float velocidade;
	public void ligar() {
		ligado = true;
		velocidade = 0;
	}
	public void desligar() {
		ligado = false;
		velocidade = 0;
	}
	public void andar() {
		velocidade = 2;
	}
	public void parar() {
		velocidade = 0;
	}
	public void virar() {
		direcao = direcao + 1;
		if(direcao == 360)
			direcao = 0;
	}
	public String toString() {
		return "ligado? " + ligado + ", velocidade = " + velocidade + ", direcao = " + direcao; 
	}
}