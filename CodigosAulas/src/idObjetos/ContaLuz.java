package idObjetos;

public class ContaLuz {
	private String dt_leitura; 
	private String dt_pag;
	private double qtd_kw_gastos;
	private double valor;

	public ContaLuz(String dt_leitura, String dt_pag, double qtd_kw_gastos, double valor) {
		this.dt_leitura = dt_leitura;
		this.dt_pag = dt_pag;
		this.qtd_kw_gastos = qtd_kw_gastos;
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	public String getDt_leitura() {
		return dt_leitura;
	}
	public double getQtd_kw_gastos() {
		return qtd_kw_gastos;
	}
}
