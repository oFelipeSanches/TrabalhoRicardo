package Trabalho_1509;

public class Cachorro extends Mamifero {
    public Cachorro(String nome, int idade, String corDoPelo) {
        super(nome, idade, corDoPelo);
    }

    @Override
    public void somAnimal() {
        super.somAnimal();
        System.out.println("Au Au");
    }
}