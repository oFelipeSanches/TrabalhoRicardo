package Trabalho_1509;
import java.util.Scanner;
public class Executora {
    public static void main(String[] args) {

        int escolha;

        System.out.println("---------------------------------------");
        System.out.println("Escolha uma espécie abaixo:");
        System.out.println("Mamífero - 1");
        System.out.println("Ovíparo - 2");
        System.out.print("Digite o número conforme o que você quer: ");
        Scanner scan = new Scanner(System.in);

        escolha = scan.nextInt();
        boolean sair = false;

        Funcionalidades choose = new Funcionalidades();
        choose.definirTipo(escolha);

    }
}