public class Curso {
    private String nomeCurso;

    // Construtor
    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    // Método para matricular estudante
    public void matricularEstudante(Estudante estudante) {
        System.out.println("Estudante matriculado no curso: " + nomeCurso);
        System.out.println("Nome do Estudante: " + estudante.getNome());
        System.out.println("Matrícula do Estudante: " + estudante.getMatricula());
    }
}
