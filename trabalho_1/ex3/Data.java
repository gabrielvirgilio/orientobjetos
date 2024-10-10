package datas;

public class Data {
    // Atributos
    private int mes;
    private int dia;
    private int ano;

    // Construtor
    public Data(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    // Métodos GET
    public int getMes() {
        return mes;
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getAno() {
        return ano;
    }
    
    // Métodos SET
    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para exibir a data
    public void exibeData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
