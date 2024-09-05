
package carro;

public class Universidade {
    // Atributos
    public String nome;
    public String cidade;
    public String estado;
    public int num_alunos;
    
    // Construtor
    
    Universidade(String nome, String cidade, String estado, int num_alunos){
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.num_alunos = num_alunos;
    }
    
    // Getters
    
    public String getNome(){
        return nome;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public int getNum_alunos(){
        return num_alunos;
    }
    
    // Setters
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public void setNum_alunos(int num_alunos){
        this.num_alunos = num_alunos;
    }
    
    // Assinatura da Classe
    
    public String toString(){
        return "Universidade\n" +
                "Nome: " + nome + 
                "\nCidade: " + cidade +
                "\nEstado: " + estado +
                "\nNumero de alunos: " + num_alunos;
    }
}
