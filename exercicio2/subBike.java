// Subclasse Bicicleta
public class Bicicleta extends Veiculo {
    private String tipoDeQuadro;

    // Construtor
    public Bicicleta(String tipoDeQuadro) {
        this.tipoDeQuadro = tipoDeQuadro;
    }

    @Override
    public void acelerar() {
        System.out.println("A bicicleta está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando.");
    }

    // Método para obter o tipo de guidão
    public String getTipoDeQuadro() {
        return tipoDeQuadro;
    }
}
