package Trabalho_1509;

public class Porco extends Mamifero {
    public Porco(String nome, int idade, String corDoPelo) {
        super(nome, idade, corDoPelo);
    }

    @Override
    public void somAnimal() {
        super.somAnimal();
        System.out.println("Oinc Oinc");
    }
}
