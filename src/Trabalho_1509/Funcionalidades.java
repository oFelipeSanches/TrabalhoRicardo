package Trabalho_1509;
import java.util.Scanner;
public class Funcionalidades extends Executora{

    public void definirTipo(int escolha){

        Scanner scan = new Scanner(System.in);
        boolean sair = false;

        if (escolha == 1) {
            while (!sair) {
                System.out.println("\nEscolha uma opção:");
                System.out.println("Criar Cachorro - 1");
                System.out.println("Criar   Gato   - 2");
                System.out.println("Criar   Porco  - 3");
                System.out.println("Sair do menu   - 0");

                int op = scan.nextInt();
                scan.nextLine();

                switch (op) {
                    case 1:
                        System.out.print("\nDigite o nome do cachorro: ");
                        String nomeCachorro = scan.nextLine();
                        System.out.print("\nDigite a idade do cachorro: ");
                        int idadeCachorro = scan.nextInt();
                        scan.nextLine();
                        System.out.print("\nDigite a cor do pelo do cachorro: ");
                        String corPeloCachorro = scan.nextLine();
                        Cachorro cachorro = new Cachorro(nomeCachorro, idadeCachorro, corPeloCachorro);

                        cachorro.somAnimal();
                        break;

                    case 2:
                        System.out.print("\nDigite o nome do gato: ");
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
                        System.out.print("\nDigite o nome do Porco: ");
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
        }else if (escolha == 2) {
            while (!sair) {
                int op=0;
                System.out.println("\nEscolha uma opção:");
                System.out.println("Criar Tartaruga - 1");
                System.out.println("Criar  Galinha  - 2");
                System.out.println("Sair do menu    - 0");

                op = scan.nextInt();
                scan.nextLine();

                switch (op) {
                    case 1:
                        System.out.print("\nDigite o nome da tartaruga: ");
                        String nomeTartaruga = scan.nextLine();
                        System.out.print("Digite a idade da tartaruga: ");
                        int idadeTartaruga = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Digite a quantidade de ovos da tartaruga: ");
                        int quantidadeOvosTartaruga = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Digite o tipo de casco da tartaruga: ");
                        String tipoCascoTartaruga = scan.nextLine();

                        Tartaruga tartaruga = new Tartaruga(nomeTartaruga, idadeTartaruga, quantidadeOvosTartaruga, tipoCascoTartaruga);

                        tartaruga.somAnimal();
                        break;

                    case 2:
                        System.out.print("\nDigite o nome da galinha: ");
                        String nomeGalinha = scan.nextLine();
                        System.out.print("Digite a idade da galinha: ");
                        int idadeGalinha = scan.nextInt();
                        System.out.print("Digite a quantidade de ovos: ");
                        int quantidadeGalinha = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Digite a cor da pena da galinha: ");
                        String corPena = scan.nextLine();

                        Galinha galinha = new Galinha(nomeGalinha, idadeGalinha,quantidadeGalinha,corPena);

                        galinha.somAnimal();;
                        break;

                    case 0:
                        sair = true;
                        break;

                    default:
                        System.out.println("Opcao invalida!");
                        break;
                }

            }
        }
    }

}
