package Trabalho_1509;

public class Animal {
    private String nome;
    private int idade;
    private String som;

    public Animal(String nome, int idade, String som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }

    public void somAnimal() {
        System.out.printf("%s faz %s",this.getNome(), this.getSom());
    }

    public String getSom() {
        return som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}