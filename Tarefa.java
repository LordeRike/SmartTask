public class Tarefa {
    String descricao;
    boolean concluida;
    String prioridade; // Novo Atributo

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
        this.prioridade = "Baixa"; //Valor padrao
    }
}