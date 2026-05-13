public class Tarefa {
    String descricao;
    boolean concluida;
    String prioridade; // Novo Atributo
    String dataEntrega;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
        this.prioridade = "Baixa"; //Valor padrao
        
    }

    public void dataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public void status() { 
        System.out.println("Pending");
    }

}