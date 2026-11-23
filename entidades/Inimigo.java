package entidades;

import valueobjects.VidaInimigo;

public class Inimigo {
    private VidaInimigo vida;

    public Inimigo(VidaInimigo vida){
        this.vida = vida;
    }
    public VidaInimigo getVida(){
        return this.vida;
    }
}
