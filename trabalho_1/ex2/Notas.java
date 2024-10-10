package notas;

public class Notas {
    // Atributos
    private double trabalho1;
    private double trabalho2;
    private double trabalho3;
    private double trabalho4;
    private double prova1;
    private double prova2;

    // Construtor
    public Notas(double trabalho1, double trabalho2, double trabalho3, double trabalho4, double prova1, double prova2) {
        this.trabalho1 = trabalho1;
        this.trabalho2 = trabalho2;
        this.trabalho3 = trabalho3;
        this.trabalho4 = trabalho4;
        this.prova1 = prova1;
        this.prova2 = prova2;
    }

    // Métodos GET
    public double getTrabalho1() {
        return trabalho1;
    }
    
    public double getTrabalho2() {
        return trabalho2;
    }
    
    public double getTrabalho3() {
        return trabalho3;
    }
    
    public double getTrabalho4() {
        return trabalho4;
    }
    
    public double getProva1() {
        return prova1;
    }
    
    public double getProva2() {
        return prova2;
    }
    
    // Métodos SET

    public void setTrabalho1(double trabalho1) {
        this.trabalho1 = trabalho1;
    }

    public void setTrabalho2(double trabalho2) {
        this.trabalho2 = trabalho2;
    }

    public void setTrabalho3(double trabalho3) {
        this.trabalho3 = trabalho3;
    }

    public void setTrabalho4(double trabalho4) {
        this.trabalho4 = trabalho4;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    // Método para calcular a média final
    public double calcularMediaFinal() {
        double media1 = (trabalho1 + trabalho2 + prova1) / 3;
        double media2 = (trabalho3 + trabalho4 + prova2) / 3;
        return (media1 + media2) / 2;
    }

    // Método para verificar se o aluno está aprovado
    public boolean alunoAprovado() {
        return calcularMediaFinal() >= 6;
    }

}
