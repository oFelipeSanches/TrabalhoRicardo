package Trabalho_1509;

public class Tartaruga extends Oviparo{
    private String tipoCasco;

    public Tartaruga(String nome, int idade, int quantidadeDeOvos, String tipoCasco) {
        super(nome, idade, quantidadeDeOvos);
        this.tipoCasco = tipoCasco;
    }

    @Override
    public void somAnimal() {
        System.out.println("...");
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }
}
