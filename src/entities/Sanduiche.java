package entities;

import java.util.List;

public class Sanduiche {

    private String tipoDePao;
    private String recheio;
    private List<String> molhos;
    private String extra;

    Sanduiche(SanduicheBuilder builder) {
        this.tipoDePao = builder.tipoDePao;
        this.recheio = builder.recheio;
        this.molhos = builder.molhos;
        this.extra = builder.extra;
    }

    public String getTipoDePao() {
        return tipoDePao;
    }

    public String getRecheio() {
        return recheio;
    }

    public List<String> getMolhos() {
        return molhos;
    }

    public String getExtra() {
        return extra;
    }

}
