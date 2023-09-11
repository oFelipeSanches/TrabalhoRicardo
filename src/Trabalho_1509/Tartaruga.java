package Trabalho_1509;

public class Tartaruga extends Oviparo{
    private String tipoCasco;

    public Tartaruga(String nome, int idade, int quantidadeDeOvos, String tipoCasco) {
        super(nome, idade, quantidadeDeOvos);
        this.tipoCasco = tipoCasco;
    }

    public void infTartaruga() {
        System.out.printf("\nA tartaruga %s com o casco %s de %d anos de idade ja botou %d de ovos", this.getNome(), this.getTipoCasco(), this.getIdade(), this.getQuantidadeDeOvos());
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }
}
