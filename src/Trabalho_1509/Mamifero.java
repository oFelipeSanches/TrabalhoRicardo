package Trabalho_1509;

public class Mamifero extends Animal {
    private String corDoPelo;

    public Mamifero(String nome, int idade, String som, String corDoPelo) {
        super(nome, idade, som);
        this.corDoPelo = corDoPelo;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }
}
