package Trabalho_1509;

public class Gato extends Mamifero {
    public Gato(String nome, int idade, String corDoPelo) {
        super(nome, idade, corDoPelo);
    }

    @Override
    public void somAnimal() {
        super.somAnimal();
        System.out.println("Miau");
    }
}
