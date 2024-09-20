public class Estudante {
    private String nome;
    private String matricula;

    // Construtor
    public Estudante(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
