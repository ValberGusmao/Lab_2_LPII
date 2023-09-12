import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogador[] jogadores = new Jogador[2];

        Jogo jogo;
        String entrada;
        EstadosJogo estadoJogo;

        System.out.println("\n--JOGO DA VELHA--");
        System.out.println("\n| COMO JOGAR:");
        System.out.println("| DIGITE O NUMERO DA LINHA + '-' + O NUMERO DA COLUNA");
        System.out.println("| EXEMPLO DE JOGADA: 0-0\n");

        for (int i = 0; i < 2; i++){
            System.out.print("INSIRA O NOME DO JOGADOR-0"+(i+1)+": ");
            entrada = scanner.nextLine();
            jogadores[i] = new Jogador(entrada);
        }
        jogo = new Jogo(jogadores);

        //Loop de reiniciar o jogo
        do{
            //Loop de uma partida do jogo
            do{
                //Desenhar o tabuleiro
                System.out.print("   0 1 2");
                for (int i = 0; i < jogo.getTabuleiro().length; i++) {
                    System.out.print("\n"+i+" |");
                    for (int j = 0; j< jogo.getTabuleiro()[0].length; j++){
                        System.out.print(jogo.getTabuleiro()[i][j].getSimbolo()+"|");
                    }
                }
                System.out.println("\n");
                //Loop de decidir a jogada
                do{
                    System.out.println("É a vez de "+jogo.getJogadorAtual().getNome()+":");
                    entrada = scanner.next();
                }while (!jogo.movimento(entrada));

                estadoJogo = jogo.ganhouJogo();
            }while(estadoJogo == EstadosJogo.EMJOGO);

            if(estadoJogo==EstadosJogo.EMPATE){
                System.out.println("DEU VELHA");
            }
            else {
                System.out.println("O jogador "+jogo.getJogadorAtual().getNome()+" VENCEU");
            }
            System.out.println("DESEJA JOGAR NOVAMENTE? (S/N)");
            entrada = scanner.next();
            jogo.reiniciar();
        }while (entrada.equalsIgnoreCase("S"));
        System.out.println("OBRIGADO POR JOGAR");
    }
    public void desenharTabuleiro(){

    }
}