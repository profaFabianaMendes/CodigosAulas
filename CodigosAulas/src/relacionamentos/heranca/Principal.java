package relacionamentos.heranca;

public class Principal {
    public static void main(String[] args) {
        Carro auto1 = new Carro();
        auto1.setMarca("FIAT");
        auto1.setVelocidade(0);
        auto1.setStatus(false);
        System.out.println(auto1.toString());
    }
}
