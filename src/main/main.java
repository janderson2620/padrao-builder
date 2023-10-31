package main;

import entities.Sanduiche;
import entities.SanduicheBuilder;

public class main {
    public static void main(String[] args) {
        Sanduiche sanduiche = new SanduicheBuilder("Italiano", "frango")
                .adicionarMolho("Maionese")
                .adicionarMolho("Mostarda")
                .adicionarMolho("Ketchup")
                .adicionarExtra("Bacon")
                .build();

        System.out.println("Sanduíche: " + sanduiche.getTipoDePao() + " com " +
                sanduiche.getRecheio() + " e molhos " + sanduiche.getMolhos() +
                " e extra " + sanduiche.getExtra());
    }
}
