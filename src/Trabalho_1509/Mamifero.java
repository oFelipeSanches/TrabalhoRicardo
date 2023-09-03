package Trabalho_1509;

public class Mamifero extends Animal {
    private String corDoPelo;

    private String som;

    public Mamifero(String nome, int idade, String corDoPelo, String som) {
        super(nome, idade);
        this.corDoPelo = corDoPelo;
        this.som = som;
    }

    public void somAnimal() {
        System.out.printf("%s faz %s",getNome(), getSom());
    }

    public String getSom() {
        return som;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }
}
