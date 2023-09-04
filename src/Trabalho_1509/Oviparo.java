package Trabalho_1509;

public class Oviparo extends Animal {
    private int quantidadeDeOvos;

    public Oviparo(String nome, int idade, int quantidadeDeOvos) {
        super(nome, idade);
        this.quantidadeDeOvos = quantidadeDeOvos;
    }

    public int getQuantidadeDeOvos() {
        return quantidadeDeOvos;
    }

    public void setQuantidadeDeOvos(int quantidadeDeOvos) {
        this.quantidadeDeOvos = quantidadeDeOvos;
    }
}
