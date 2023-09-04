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

        if (escolha == 1) {
            while (!sair) {
                System.out.println("Escolha uma opção:");
                System.out.println("Criar Cachorro - 1");
                System.out.println("Criar   Gato   - 2");
                System.out.println("Criar   Porco  - 3");
                System.out.println("Sair do menu   - 0");

                int op = scan.nextInt();
                scan.nextLine();

                switch (op) {
                    case 1:
                        System.out.print("Digite o nome do cachorro: ");
                        String nomeCachorro = scan.nextLine();
                        System.out.print("Digite a idade do cachorro: ");
                        int idadeCachorro = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Digite a cor do pelo do cachorro: ");
                        String corPeloCachorro = scan.nextLine();
                        Cachorro cachorro = new Cachorro(nomeCachorro, idadeCachorro, corPeloCachorro);

                        cachorro.somAnimal();
                        break;

                    case 2:
                        System.out.print("Digite o nome do gato: ");
                        String nomeGato = scan.nextLine();
                        System.out.print("Digite a idade do gato: ");
                        int idadeGato = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Digite a cor do pelo do gato: ");
                        String corPeloGato = scan.nextLine();
                        Gato gato = new Gato(nomeGato, idadeGato, corPeloGato);

                        gato.somAnimal();
                        break;

                    case 3:
                        System.out.print("Digite o nome do Porco: ");
                        String nomePorco = scan.nextLine();
                        System.out.print("Digite a idade do Porco: ");
                        int idadePorco = scan.nextInt();
                        System.out.print("Digite a cor do Porco: ");
                        String corPorco = scan.nextLine();
                        Porco porco = new Porco(nomePorco, idadePorco, corPorco);

                        porco.somAnimal();
                        break;

                    case 0:
                        sair = true;
                        break;

                    default:
                        System.out.println("Opcao invalida");
                        break;
                }


            }
        }

    }



}