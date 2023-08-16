package interfaceGrafica;

import javax.swing.*; 

public class HelloWorldComBotao {
	public static void main(String[] args) {  
		JFrame f=new JFrame();
		JButton b=new JButton("clique aqui");
		b.setBounds(50,50,100, 40);
		f.add(b);
		f.setSize(200,180);
		f.setLayout(null);
		f.setVisible(true);
	}
}

