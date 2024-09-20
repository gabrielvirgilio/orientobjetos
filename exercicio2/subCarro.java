// Subclasse Carro
public class Carro extends Veiculo {
    private int numeroDePortas;

    // Construtor
    public Carro(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }

    // Método para obter o número de portas
    public int getNumeroDePortas() {
        return numeroDePortas;
    }
}
