package calculadora;

public class Calculadora {
    // Adição
    public double somar(double a, double b) {
        return a + b;
    }

    // Subtração
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Multiplicação
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    // Divisão
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Dvisão inexistente.");
            return 0;
        }
        return a / b;
    }
}
