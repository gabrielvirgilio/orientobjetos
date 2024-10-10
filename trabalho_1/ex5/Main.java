package cinema;

public class Main {

    public static void main(String[] args) {
        Data dataFilme = new Data(10, 10, 2024); // data do filme

        EntradaDeCinema ingresso = new EntradaDeCinema(dataFilme, "15:30", 5, 30.00); // ingresso

        // Cliente de 11 anos
        Data dataNascimento = new Data(15, 5, 2013);
        
        ingresso.calculaDesconto(dataNascimento, 2024); 
        ingresso.calculaDescontoHorario(); 

        System.out.println(ingresso);

        // Estudante de 17 anos
        Data dataNascimentoEstudante = new Data(15, 5, 2007);
        EntradaDeCinema ingressoEstudante = new EntradaDeCinema(dataFilme, "18:30", 3, 30.00);
        
        ingressoEstudante.calculaDesconto(dataNascimentoEstudante, 12345, 2024);
        ingressoEstudante.calculaDescontoHorario();

        System.out.println("\n" + ingressoEstudante);
    }
    
}
