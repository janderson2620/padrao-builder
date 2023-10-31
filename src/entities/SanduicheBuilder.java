package entities;

import java.util.ArrayList;
import java.util.List;

public class SanduicheBuilder {
    String tipoDePao;
    String recheio;
    List<String> molhos = new ArrayList<>();
    String extra;

    public SanduicheBuilder(String tipoDePao, String recheio) {
        this.tipoDePao = tipoDePao;
        this.recheio = recheio;
    }

    public SanduicheBuilder adicionarMolho(String molho) {
        molhos.add(molho);
        return this;
    }

    public SanduicheBuilder adicionarExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public Sanduiche build() {
        return new Sanduiche(this);
    }
}

