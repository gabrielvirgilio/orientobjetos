package cad;

public class Main {

    public static void main(String[] args) {
        CadernoDeEnderecos pessoa1 = new CadernoDeEnderecos("Maria Jose", "9475-0115", "maria.jose@gmail.com", "27/02/1988", "Rua Ricardao, 123, Jatai");

        // Exibindo as informações das pessoas
        System.out.println("Informacoes da Pessoa 1:");
        pessoa1.exibirInformacoes();

        pessoa1.setNome("Maria Jose da Costa");
        pessoa1.setTelefone("9475-1505");

        System.out.println("\nInformacoes da Pessoa 1 apos alteracoes:");
        pessoa1.exibirInformacoes();

        // Criando outro objeto
        CadernoDeEnderecos pessoa2 = new CadernoDeEnderecos("Joao Maria", "8164-4737", "joao_maria@email.com", "21/07/1998", "Rua Bernardao, 321, Rio Verde");

        // Exibindo as informações da pessoa 2
        System.out.println("\nInformacoes da Pessoa 2:");
        pessoa2.exibirInformacoes();
    }
    
}
