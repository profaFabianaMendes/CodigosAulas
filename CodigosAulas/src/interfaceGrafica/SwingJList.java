package interfaceGrafica;

import javax.swing.*;  
import javax.swing.event.*;
import java.awt.*;  

public class SwingJList implements ListSelectionListener {  

	JList<String> jlst; 
	JLabel jlab; 
	JScrollPane jscrlp; 

	// Cria um vetor de nomes
	String nomes[] = { "Ana", "Beatriz", "Carlos",  
			"Daniel", "Elaine",  "Fernando", 
			"Gabriela", "Marcio", "Nair", 
			"Osvaldo", "Pedro", "Rita" }; 

	SwingJList() {  
		// Cria um novo JFrame.  
		JFrame jfrm = new JFrame("Exemplo de JList");  

		// Especifica o uso do FlowLayout. 
		jfrm.setLayout(new FlowLayout());  

		// Define o tamanho do JFrame.  
		jfrm.setSize(300, 200);  

		// Encerra o programa caso o usuário feche a aplicação. 
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

		// Cria um JList. 
		jlst = new JList<String>(nomes); 

		// Seleciona a lista no modo single-selection. 
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 

		// Adiciona a lista ao scroll pane. 
		jscrlp = new JScrollPane(jlst); 

		// Define o tamanho do scroll pane. 
		jscrlp.setPreferredSize(new Dimension(120, 140)); 

		// Define um rótulo indicando a necessidade de seleção. 
		jlab = new JLabel("Por favor, escolha um nome"); 

		// Define um evento para ouvir a lista de seleção. 
		jlst.addListSelectionListener(this); 

		// Adiciona a lista e o rótulo ao JFrame. 
		jfrm.add(jscrlp); 
		jfrm.add(jlab); 

		// Mostra o JFrame.  
		jfrm.setVisible(true);  
	}  

	// Método para gerência de eventos na lista de seleção
	public void valueChanged(ListSelectionEvent le) {  
		// Get the index of the changed item. 
		int idx = jlst.getSelectedIndex(); 

		// Mostra o item, caso algum seja selecionada 
		if(idx != -1) 
			jlab.setText("Voce selecionou o nome: " + nomes[idx]); 
		// Se nenhum item é selecionado, imprime a mesma mensagem de seleção
		else
			jlab.setText("Por favor, escolha um nome"); 
	}  

	public static void main(String args[]) { 
		new SwingJList();  
	} 
}

