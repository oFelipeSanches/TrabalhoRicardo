package Trabalho_1509;

public class Galinha extends Oviparo{
    private String corDaPena;

    public Galinha(String nome, int idade, int quantidadeDeOvos, String corDaPena) {
        super(nome, idade, quantidadeDeOvos);
        this.corDaPena = corDaPena;
    }

    @Override
    public void somAnimal() {
        super.somAnimal();
    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }
}
