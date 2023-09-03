package Trabalho_1509;
import java.util.Scanner;
public class Executora {
    public static void main(String[] args) {

        int n1;

        System.out.println("---------------------------------------");
        System.out.println("Escolha uma espécie abaixo:");
        System.out.println("Mamífero - 1");
        System.out.println("Ovíparo - 2");
        System.out.print("Digite o número conforme o que você quer: ");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();

        Cachorro cachorro = new Cachorro("jonas", 2, "Marrom");
        cachorro.somAnimal();

    }
}
