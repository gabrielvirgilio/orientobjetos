package notas;

public class Main {

    public static void main(String[] args) {
        Notas aluno = new Notas(7.5, 8.0, 6.5, 7.0, 8.5, 7.5);
    
        // Exibi a média final
        System.out.println("Media Final: " + aluno.calcularMediaFinal());

        // Verifica se o aluno foi aprovado
        if (aluno.alunoAprovado()) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado.");
        }
    }
    
}
