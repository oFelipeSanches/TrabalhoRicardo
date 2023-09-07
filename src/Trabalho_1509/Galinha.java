package Trabalho_1509;

public class Galinha extends Oviparo{
    private String corDaPena;

    public Galinha(String nome, int idade, int quantidadeDeOvos, String corDaPena) {
        super(nome, idade, quantidadeDeOvos);
        this.corDaPena = corDaPena;
    }

    public void infGalinha() {
        System.out.printf("A galinha %s de %d anos de idade, tem a cor da pena %s e ja botou %d de ovos", this.getNome(), this.getIdade(), this.getCorDaPena(), this.getQuantidadeDeOvos());
    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }
}
