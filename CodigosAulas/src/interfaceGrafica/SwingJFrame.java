package interfaceGrafica;

import javax.swing.*;


public class SwingJFrame {
	SwingJFrame() { 
		 
		// Cria um novo container JFrame. 
	    JFrame jfrm = new JFrame("JFrame");
	    // Define o tamanho do frame. 
	    jfrm.setSize(300, 200); 
	    // Encerra o programa caso o usuário feche a aplicação. 
	    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    // Cria um rótulo contendo apenas um texto. 
	    JLabel jlab = new JLabel(" ---> Aparencia JFrame"); 
	    // Adiciona o rótulo ao painel de conteúdo. 
	    jfrm.add(jlab); 
	    // Mostra o frame construído. 
	    jfrm.setVisible(true); 
	  } 
	 
	  public static void main(String args[]) { 
	        new SwingJFrame(); 
	  } 
}
