package enums;

public enum NivelDificuldade {

    FACIL(1, 5, 3),
    MEDIO(2, 4, 4),
    DIFICIL(3, 3, 5),
    INFERNO(4, 2, 6);

    private final int codigo;
    private final int vidajogador;
    private final int vidaInimigo;

    NivelDificuldade(int codigo, int vidaJogador, int vidaInimigo) {
        this.vidajogador = vidaJogador;
        this.vidaInimigo = vidaInimigo;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getVidaJogador() {
        return vidajogador;
    }

    public int getVidaInimigo() {
        return vidaInimigo;
    }

    // Busca o Enum pelo nome digitado (ignorando maiúsculas/minúsculas)
    public static NivelDificuldade porCodigo(int codigo) {
        for (NivelDificuldade nivel : values()) {
            if (nivel.codigo == codigo) {
                return nivel;
            }
        }
        throw new IllegalArgumentException("Dificuldade inválida: " + codigo);
    }

}