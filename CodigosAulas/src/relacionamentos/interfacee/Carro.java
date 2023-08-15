package relacionamentos.interfacee;

import relacionamentos.heranca.Veiculo;

public class Carro extends Veiculo implements Rodovia{
	private boolean status;

    public boolean getStatus() {
        return status;
        }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void ligar() {
        status = true;
    }
    public void desligar() {
        status = false;
    }

    public void mover() {
        final String combustivel = "gasolina";
        System.out.println("O veiculo e a gasolina" +
        "e esta em movimento");
    }
    
    // Implementacao obrigatoria do metodo da interface
    public boolean controlarVelocidade(float velocidade) {
        if(velocidade < LIMITE)
            return true;
        else
            return false;
    }
}
