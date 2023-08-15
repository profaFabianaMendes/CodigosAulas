package metodos;

public class Principal {

	public static void main(String[] args) {
		Robo robo1 = new Robo();
		System.out.println("Robo 1 => " + robo1.toString());
		robo1.ligar();
		System.out.println("Robo 1 => " + robo1.toString());
		robo1.andar();
		System.out.println("Robo 1 => " + robo1.toString());
		robo1.parar();
		System.out.println("Robo 1 => " + robo1.toString());
		robo1.desligar();
		System.out.println("Robo 1 => " + robo1.toString());
		
		
		Robo robo2 = new Robo();
		System.out.println("Robo 2 => " + robo2.toString());
		robo2.ligar();
		System.out.println("Robo 2 => " + robo2.toString());
		robo2.andar();
		System.out.println("Robo 2 => " + robo2.toString());
		robo2.parar();
		System.out.println("Robo 2 => " + robo2.toString());
		robo2.desligar();
		System.out.println("Robo 2 => " + robo2.toString());
	}

}
