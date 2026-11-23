import java.util.Scanner;
import entidades.Navio;
import enums.NivelDificuldade;

public class BatalhaNaval {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao jogo de batalha naval\n");
        System.out.println("Selecione a dificuldade:");
        System.out.println("1 - Facil");
        System.out.println("2 - Médio");
        System.out.println("3 - Dificil ");
        System.out.println("4 - Inferno");
        int escolhaDificuldade = leitor.nextInt();

        NivelDificuldade dificuldade = NivelDificuldade.porCodigo(escolhaDificuldade);

        try {

            System.out.println("Dificuldade selecionada: " + dificuldade);
            System.out.println("Vida do Jogador: " + dificuldade.getVidaJogador());
            System.out.println("Vida do Inimigo: " + dificuldade.getVidaInimigo());

            Navio navio = new Navio();
            navio.sortearPosicoes(dificuldade, 20);

            int vidaJogador = dificuldade.getVidaJogador();
            int vidaInimigo = dificuldade.getVidaInimigo();

            System.out.println("[DEBUG - Posições do Navio]: " + navio.getPosicoes());

            while (vidaJogador > 0 && vidaInimigo > 0) {
                System.out.println("\n---------------------------------------------------------------");
                System.out.println("❤️ Suas Vidas: " + vidaJogador + " | 🎯 Vidas do Inimigo: " + vidaInimigo);
                System.out.print("Digite uma coordenada de tiro (0 a 19): ");

                int palpite = leitor.nextInt();

                boolean acertou = navio.avaliarDisparo(palpite);
                if (acertou) {
                    vidaInimigo--;
                } else {
                    vidaJogador--;
                }
            }

            if (vidaInimigo == 0) {
                System.out.println("Você ganhou");
            }
            else {
                System.out.println("Você perdeu");
            }

            // Tabuleiro de 20 posições (0 a 19)

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            leitor.close();
        }

    }
}