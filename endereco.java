
package carro;

public class Endereco {
    /*ATRIBUTOS de ENDERECO*/
    
    public String rua;
    public int numero;
    public String bairro;
    
    /*CONSTRUTOR*/
    
    Endereco(String rua, int numero, String bairro){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }
    
    /*Método GET*/
    
    public String getRua(){
        return rua;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    /*MÉTODO SET*/
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    /*ASSINATURA*/
    
    public String toString(){
        return "Endereco\n" +
                "Rua: " + rua + 
                "\nNumero: " + numero +
                "\nBairro: " + bairro;
    }
}
