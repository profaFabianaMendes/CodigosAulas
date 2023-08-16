package interfaceGrafica;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class SwingJButton implements ActionListener { 

	JLabel jlab;  

	SwingJButton() { 

		// Cria um novo container JFrame.  
		JFrame jfrm = new JFrame("Exemplo de uso JButton"); 

		// Especifica o uso do FlowLayout. 
		jfrm.setLayout(new FlowLayout()); 

		// Define o tamanho do frame.  
		jfrm.setSize(300, 90); 

		// Encerra o programa caso o usuário feche a aplicação. 
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		// Make two buttons. 
		JButton jbtnUp = new JButton("Para cima"); 
		JButton jbtnDown = new JButton("Para Baixo"); 

		// Adiciona eventos. 
		jbtnUp.addActionListener(this); 
		jbtnDown.addActionListener(this); 

		// Adiciona os botões no painel de conteúdo. 
		jfrm.add(jbtnUp);  
		jfrm.add(jbtnDown);  

		// Cria um rótulo contendo apenas um texto.  
		jlab = new JLabel("Pressione um botão."); 

		// Adiciona o rótulo ao painel de conteúdo.  
		jfrm.add(jlab); 

		// Mostra o frame construído.
		jfrm.setVisible(true); 
	} 

	//Método para gerência de eventos
	public void actionPerformed(ActionEvent ae) { 
		if(ae.getActionCommand().equals("Para cima"))  
			jlab.setText("Voce pressionou para cima"); 
		else 
			jlab.setText("Voce presssionou para baixo"); 
	} 

	public static void main(String args[]) { 
		new SwingJButton(); 
	} 
}
