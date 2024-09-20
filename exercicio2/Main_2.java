public class Main {
    public static void main(String[] args) {
        // Objetos Livro
        Livro livro1 = new Livro("Vidas Secas", "Gracilliano Ramos");
        Livro livro2 = new Livro("1984", "George Orwell");
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis");

        // Objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Listando todos os livros disponíveis na biblioteca
        biblioteca.listarLivros();
    }
}
