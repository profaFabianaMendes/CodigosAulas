package relacionamentos;

import java.util.Scanner;

public class Tecnico extends Pessoa {
	private String funcao;
	private double salario;
	private String data_admissao;
	
	
	public Tecnico(String nome, String cpf, String rg, String tel_contato, String end_residencial, String funcao,
			double salario, String data_admissao) {
		super(nome, cpf, rg, tel_contato, end_residencial);
		this.funcao = funcao;
		this.salario = salario;
		this.data_admissao = data_admissao;
	}


	public boolean realizar_manutencao(FichaDeCadastro ficha) {
		/* 
		 * Tecnico imprime contrado e confere as informacoes
		 * do cliente para realizar a manutencao
		 */
		System.out.println(ficha.imprimir());
		Scanner entrada = new Scanner(System.in);
		System.out.println("O servico foi realizado com "
				+ "sucesso? Digite 1 para sim e 0 para nao:");
		int status = entrada.nextInt();
		if(status == 1)
			return true;
		else
			return false;
	}
}
