package domain;

public enum TipoJogada {
    PAPEL(1), TESOURA(2), PEDRA(3), LAGARTO(4), SPOCKY(5);
    private int id;

    TipoJogada (int pId){
        this.id = pId;
    }

    public int getId(){
        return id;
    }

    public static TipoJogada getById(int id) {
        for (TipoJogada tipo : values()) {
            if (tipo.getId() == id) {
                return tipo;
            }
        }
        throw new RuntimeException(id + "invalido");
    }
}
