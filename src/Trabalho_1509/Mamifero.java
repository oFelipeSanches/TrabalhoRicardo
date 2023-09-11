package Trabalho_1509;

public class Mamifero extends Animal {
    private String corDoPelo;

    public Mamifero(String nome, int idade, String corDoPelo) {
        super(nome, idade);
        this.corDoPelo = corDoPelo;
    }

    public void infMamifero() {
        System.out.printf("\n%s que é da cor %s tem %d anos de idade e no momento está ", this.getNome(), this.getCorDoPelo(), this.getIdade());
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo() {
        this.corDoPelo = corDoPelo;
    }

}
