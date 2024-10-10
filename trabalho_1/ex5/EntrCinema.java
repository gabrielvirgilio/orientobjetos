package cinema;

class EntradaDeCinema {
    // Atributos
    private Data dataFilme;
    private String horario;
    private int sala;
    private double valor;

    // Construtor
    public EntradaDeCinema(Data dataFilme, String horario, int sala, double valor) {
        this.dataFilme = dataFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }

    // Desconto para menores de 12 anos
    public void calculaDesconto(Data dataNascimento, int anoAtual) {
        int idade = dataNascimento.calcularIdade(anoAtual);
        if (idade < 12) {
            this.valor *= 0.5; // Desconto de 50%
        }
    }

    // Desconto para estudantes
    public void calculaDesconto(Data dataNascimento, int carteiraEstudante, int anoAtual) {
        int idade = dataNascimento.calcularIdade(anoAtual);
        if (idade >= 12 && idade <= 15) {
            this.valor *= 0.6; // Desconto de 40%
        } else if (idade >= 16 && idade <= 20) {
            this.valor *= 0.7; // Desconto de 30%
        } else if (idade > 20) {
            this.valor *= 0.8; // Desconto de 20%
        }
    }

    // Desconto filme horário
    public void calculaDescontoHorario() {
        String[] partes = horario.split(":");
        int horas = Integer.parseInt(partes[0]);
        if (horas < 16) {
            this.valor *= 0.9; // Desconto de 10%
        }
    }

    // Imprime todos os dados do ingresso
    @Override
    public String toString() {
        return "Data do Filme: " + dataFilme.getDia() + "/" + dataFilme.getMes() + "/" + dataFilme.getAno() +
               "\nHorario: " + horario +
               "\nSala: " + sala +
               "\nValor: R$ " + String.format("%.2f", valor);
    }
}
