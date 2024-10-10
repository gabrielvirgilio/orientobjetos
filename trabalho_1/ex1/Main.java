package calculadora;

public class Main {

    public static void main(String[] args) {
        CalculadoraCompleta calculadora = new CalculadoraCompleta();

        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Soma: " + calculadora.somar(num1, num2));
        System.out.println("Subtracao: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicacao: " + calculadora.multiplicar(num1, num2));
        System.out.println("Divisao: " + calculadora.dividir(num1, num2));
        
        System.out.println("Raiz Quadrada: " + calculadora.raizQuadrada(num1));
        System.out.println("Potencia ao Quadrado: " + calculadora.potenciaAoQuadrado(num2));
    }
    
}
