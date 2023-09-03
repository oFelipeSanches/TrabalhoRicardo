package Trabalho_1509;

public class Cachorro extends Animal {
    private String corDoPelo;

    public Cachorro(String nome, int idade, String corDoPelo) {
        super();
        this.corDoPelo = corDoPelo;
    }



    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
}