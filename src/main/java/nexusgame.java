

import java.util.Scanner;
import java.util.Random;
public class nexusgame {
    private Scanner scanner;
    private Random random;
    private int playerVida;
    private int playerPoder;
    private int    dimensaoSinergica;
    private String playerName;


    public nexusgame (){
        scanner = new Scanner (System.in);
        random = new Random();
        playerPoder = 10;
        dimensaoSinergica = 40;
        playerVida = 50;


    }
    public void start(){
        System.out.println("==== NEXUS: AVENTURA TRIDIMENSONAL ====");
        System.out.println("Digite seu nome: ");
        playerName = scanner.nextLine();


        System.out.println("\nBem-vindo, " +playerName+ "!");
        System.out.println("Você acorda em um laboratório dimensional estranhamente grande ");


        mainMenu();


    }


    private void mainMenu(){
        while(true){
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Explorar Laboratório");
            System.out.println("2. Verificar Status");
            System.out.println("3. Batalhar com inimigo");
            System.out.println("4. Sair do game");
            System.out.println(" Escolha uma opção: ");


            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    explorar();
                    break;
                case 2:
                    mostrarStatus();
                    break;
                case 3:
                    batalhar();
                case 4:
                    System.out.println("Obrigado por jogar  " +playerName+" até logo..." );
                    return;
                default:
                    System.out.println("Opção inválida!");




            }
        }
    }
    private void explorar() {

       String[] locais = {
               "Sala de Experimentos Quânticos",
               "Corredor de Máquinas Estranhas",
               "Câmara de Teletransporte"
       };
       String localExplorado = locais[random.nextInt(locais.length)];
        System.out.println("Você explora " +localExplorado+ "...");
        if (random.nextInt(2) ==0){
            int bonus = random.nextInt(10);
            playerPoder += bonus;
            System.out.println("Você encontrou um dispositivo que aumentou seu poder em " +bonus+ "!" );

    } else if (random.nextInt(3) ==0) {
            int bonus = random.nextInt(25);
            dimensaoSinergica += bonus;
            System.out.println("Você encontrou uma gema translúcida, com cores alternado entre azul e roxo, ele aumentou seu poder especial em " +bonus);
        }
    }
    private void mostrarStatus() {
        System.out.println("\n--- STATUS DE JOGADOR ---");
        System.out.println("Nome: " +playerName);
        System.out.println("Vida: " +playerVida);
        System.out.println("Poder: " +playerPoder);
        System.out.println(" Dimensão Sinérgica");
    }
    private void batalhar(){
        String[] inimigos = {
                "Parasitas Dimensionais",
                "Observador do Abismo",
                "Eco Dimensional"
        };
        String inimigo  = inimigos[random.nextInt(inimigos.length)];
        int  vidaInimigo = random.nextInt(25) +20;
        System.out.println("Você encontrou " +inimigo+ "!");
        System.out.println("A vida do "+inimigo+ " é " +vidaInimigo);

        boolean emCombate =  true;
        while  (emCombate){
            System.out.println("\n--- Combate ---");
            System.out.println("1. Atacar");
            System.out.println("2. Tentar fugir ");

            int escolha  = scanner.nextInt();
            scanner.nextLine();

        }

        switch (escolha){

            case 1:
                int danoJogador = random.nextInt(playerPoder) +5;
                vidaInimigo -= danoJogador;
                System.out.println("Você ataca e causa"  +danoJogador+ " de dano!);
                break;

            case 2:
                int poderEspecial = random.nextInt(poderEspecial) +6;
                vidaInimigo -= poderEspecial;
                System.out.println("Você cria ");

        }

    }

    public static void main (String[] args){
        nexusgame game = new nexusgame();
        game.start();


        game.scanner.close();
    }

}
