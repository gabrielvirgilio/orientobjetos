package calculadora;

public class CalculadoraCompleta extends Calculadora {
    // Raíz de um número
    public double raizQuadrada(double a) {
        if (a < 0) {
            System.out.println("Nao existe radiciacao de numero negativo");
            return 0;
        }
        return Math.sqrt(a);
    }

    // Potência de um número
    public double potenciaAoQuadrado(double a) {
        return a * a;
    }
}
