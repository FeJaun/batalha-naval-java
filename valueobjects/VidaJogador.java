package valueobjects;

public class VidaJogador {
    private int pontos;

    public VidaJogador(int pontosIniciais) {
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