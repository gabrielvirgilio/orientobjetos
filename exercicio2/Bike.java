// Subclasse Bicicleta
public class Bicicleta extends Veiculo {

    @Override
    public void acelerar() {
        System.out.println("A bicicleta está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando.");
    }
}
