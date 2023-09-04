package Trabalho_1509;

public class Mamifero extends Animal {
    private String corDoPelo;

    public Mamifero(String nome, int idade, String corDoPelo) {
        super(nome, idade);
        this.corDoPelo = corDoPelo;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo() {
        this.corDoPelo = corDoPelo;
    }

}
