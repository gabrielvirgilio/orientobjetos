package datas;

public class Main {

    public static void main(String[] args) {
        // Objeto da classe Data
        Data data = new Data(10, 9, 2024);
        
        // Exibir Data
        System.out.print("Data formatada: ");
        data.exibeData();

        // Alteração dos valores
        data.setDia(10);
        data.setMes(10);
        data.setAno(2024);

        // Nova data após alterações
        System.out.print("Nova data formatada: ");
        data.exibeData();
    }
    
}
