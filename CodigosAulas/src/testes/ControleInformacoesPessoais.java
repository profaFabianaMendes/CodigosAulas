package testes;

/*
 *  Essa classe pertence a camada de controle e verifica se um
 *  CPF e um telefone contem apenas numeros
 */

public class ControleInformacoesPessoais {
	
	public static boolean checkCPF(String valor) {
		if(valor.matches("[0-9]+")) 
			return true;
		else 
			return false;
	}
	
	public static boolean checkTel(String valor) {
		if(valor.matches("[0-9]+")) 
			return true;
		else 
			return false;
	}

}