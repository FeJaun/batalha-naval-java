package valueobjects;

public class VidaInimigo {
    private int pontos;

    public VidaInimigo(int pontosIniciais) {
        this.pontos = pontosIniciais;
    }

    public void perderVida() {
        if (this.pontos > 0) {
            this.pontos--;
        }
    }

    public boolean estaZerada() {
        return this.pontos <= 0;
    }

    public int getPontos() {
        return this.pontos;
    }
}