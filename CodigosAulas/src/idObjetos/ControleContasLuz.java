package idObjetos;

public class ControleContasLuz {
	private String id;
	private ContaLuz contas[];
	private int qtd_contas;
	
	public ControleContasLuz() {
		contas =  new ContaLuz[120];
		qtd_contas = 0;
	}
	
	public boolean acrescentar_Conta(ContaLuz c) {
		if(qtd_contas < 120) {
			contas[qtd_contas] = c;
			qtd_contas++;
			return true;
		} else {
			return false;
		}
	}
	
	public double calcular_media_consumo() {
		double soma = 0;
		for(int i = 0; i < qtd_contas; i++) 
			soma = soma + contas[i].getValor(); 
		return soma/qtd_contas;
	}
	
	public String verificar_mes_menor_consumo() {
		ContaLuz menor = contas[0];
		for(int i = 1; i < qtd_contas; i++) {
			if(contas[i].getValor() < menor.getValor())
				menor = contas[i];
		}
		return menor.getDt_leitura();
	}
}