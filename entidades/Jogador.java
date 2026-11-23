package entidades;

import valueobjects.VidaJogador;

public class Jogador {
    private VidaJogador vida;

    public Jogador(VidaJogador vida){
        this.vida = vida;
    }
    public VidaJogador getVida(){
        return this.vida;
    }
}
