package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import enums.NivelDificuldade;

public class Navio {
    private List<Integer> posicoes;
    private Random random;

    public Navio() {
        this.posicoes = new ArrayList<>();
        this.random = new Random();
    }

    public void sortearPosicoes(NivelDificuldade dificuldade, int tamanhotabuleiro) {
        int tamanhoNavio = dificuldade.getVidaInimigo() * 2;
        tamanhotabuleiro = 20;
        int limiteSorteio = tamanhotabuleiro - tamanhoNavio + 1;

        int inicio = random.nextInt(limiteSorteio);

        this.posicoes.clear();
        for (int i = 0; i < tamanhoNavio; i++) {
            this.posicoes.add(inicio + i);
        }
    }
    public boolean avaliarDisparo(int palpite){
        if(this.posicoes.contains(palpite)){
            System.out.println("HIT!!");
            this.posicoes.remove(Integer.valueOf(palpite));
            return true;
        }else{
            System.out.println("MISS");
            return false;
        }
    }


    public List<Integer> getPosicoes() {
        return posicoes;
    }
}
