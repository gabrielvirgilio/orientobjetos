
package cad;

public class CadernoDeEnderecos {
    // Atributos 
    private String nome;
    private String telefone;
    private String email;
    private String dataAniversario;
    private String endereco;

    // Construtor
    public CadernoDeEnderecos(String nome, String telefone, String email, String dataAniversario, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataAniversario = dataAniversario;
        this.endereco = endereco;
    }

    // Métodos GET
    public String getNome() {
        return nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getDataAniversario() {
        return email;
    }
    
    public String getEndereco() {
        return email;
    }
    
    // Métodos SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Exibir os dados das pessoas
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Data de Aniversario: " + dataAniversario);
        System.out.println("Endereco: " + endereco);
    }
}
