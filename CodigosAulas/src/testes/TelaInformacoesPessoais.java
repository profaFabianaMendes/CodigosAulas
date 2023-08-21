package testes;

//Essa classe pertence a camada view

import java.awt.event.*;
import javax.swing.*;

public class TelaInformacoesPessoais implements ActionListener { 
	JLabel nomeLabel, endLabel, cpfLabel, telLabel; 
	JTextField nome, end, cpf, tel; 
	JButton enviar;  

	TelaInformacoesPessoais() {  
		JFrame jfrm = new JFrame("Informacoes Pessoais"); 
		jfrm.setLayout(null); 
		jfrm.setSize(500, 225);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		// Cria os rotulos 
		nomeLabel = new JLabel("Nome Completo: "); 
		endLabel = new JLabel("Endereco: ");
		cpfLabel = new JLabel("CPF: ") ; 
		telLabel = new JLabel("Telefone: ");
		
		//Cria os campos de texto 
		nome = new JTextField();
		end = new JTextField(); 
		cpf = new JTextField();
		tel = new JTextField();

		
		// Cria o botao enviar 
		JButton enviar = new JButton("Enviar"); 
		
		// Define o local e tamanho de cada item
		nomeLabel.setBounds(10, 10, 150, 30);
		nome.setBounds(150, 10, 330, 30);
		endLabel.setBounds(10, 40, 150, 30);
		end.setBounds(150, 40, 330, 30);
		telLabel.setBounds(10, 70, 150, 30);
		tel.setBounds(150, 70, 125, 30);
		cpfLabel.setBounds(10, 100, 150, 30);
		cpf.setBounds(150, 100, 125, 30);
		enviar.setBounds(200, 150, 150, 30);

		// Adiciona os componentes ao painel de conteudo 
		jfrm.add(nomeLabel); 
		jfrm.add(nome);  
		jfrm.add(endLabel); 
		jfrm.add(end); 
		jfrm.add(telLabel); 
		jfrm.add(tel);
		jfrm.add(cpfLabel); 
		jfrm.add(cpf);
		jfrm.add(enviar);

		// Mostra o frame construido. 
		jfrm.setVisible(true); 
		
		// Captura evento de clicar em botao enviar
		enviar.addActionListener(this); 
	} 

	//Metodo que executa acoes qdo o usuario clica em enviar
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Enviar")) {
			String valorNome = nome.getText();
			String valorEnd = end.getText();
			String valorCPF = cpf.getText(); 
			String valorTel = tel.getText();
			if(valorNome.isEmpty() || valorEnd.isEmpty()
					|| valorCPF.isEmpty() || valorTel.isEmpty()) {
				JOptionPane.showMessageDialog(null, 
						"Todos os dados sao obrigatorios!", 
						null, JOptionPane.ERROR_MESSAGE);				
			} else {
				if(ControleInformacoesPessoais.checkCPF(valorCPF) && 
						ControleInformacoesPessoais.checkTel(valorTel)) {
					JOptionPane.showMessageDialog(null, 
						"Os dados estao corretos!", null, 
						JOptionPane.DEFAULT_OPTION);
				} else {
					JOptionPane.showMessageDialog(null, 
						"Digite apenas numeros em CPF e Telefone!", 
						null, JOptionPane.ERROR_MESSAGE);
				}
			}	
		}
	}

	public static void main(String args[]) { 
		new TelaInformacoesPessoais();  
	} 
}

