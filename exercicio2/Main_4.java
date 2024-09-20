public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Carro com 4 portas
        Carro carro = new Carro(4);
        meuCarro.acelerar();
        meuCarro.frear();
        System.out.println("O carro tem " + meuCarro.getNumeroDePortas() + " portas.");

        // Criando uma instância de Bicicleta com quadro de alumínio
        Bicicleta bicicleta = new Bicicleta("Aluminio");
        minhaBicicleta.acelerar();
        minhaBicicleta.frear();
        System.out.println("A bicicleta tem o quadro de: " + bicicleta.getTipoDeQuadro());
    }
}
