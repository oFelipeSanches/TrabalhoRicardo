package Trabalho_1509;

public class If extends Escolha{
    boolean sair = false;

    public If(int escolha, boolean sair) {
        super();
        this.sair = sair;
    }

    public boolean isSair() {
        return sair;
    }

    public void setSair(boolean sair) {
        this.sair = sair;
    }
}
