import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    // Construtor
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Método para adicionar um livro à lista
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método para listar todos os livros
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro disponível na biblioteca.");
        } else {
            System.out.println("Livros disponíveis na biblioteca:");
            for (Livro livro : livros) {
                System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
            }
        }
    }
}
