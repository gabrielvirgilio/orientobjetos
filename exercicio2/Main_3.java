public class Main {
    public static void main(String[] args) {
        // Instância do Carro
        Veiculo carro = new Carro();
        carro.acelerar();
        carro.frear();

        // Instância da Bicicleta
        Veiculo bicicleta = new Bicicleta();
        bicicleta.acelerar();
        bicicleta.frear();
    }
}
