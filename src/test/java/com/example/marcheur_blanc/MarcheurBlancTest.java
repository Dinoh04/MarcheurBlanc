package com.example.marcheur_blanc;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class MarcheurBlancTest {

    @Test
    void testMarcher() {
        Carte carte = new Carte();
        NomDuMarcheur  nom = new NomDuMarcheur(" Bjarni");

        Lieu HEI = new Lieu("Hei");
        Lieu Pullman = new Lieu("Pullman");
        Lieu Balancoire = new Lieu("Balancoire");
        Lieu ESTI = new Lieu("ESTI");

        carte.ajouterLieu(HEI);
        carte.ajouterLieu(Pullman);
        carte.ajouterLieu(Balancoire);
        carte.ajouterLieu(ESTI);

        carte.ajouterRue("Hei","Pullman");
        carte.ajouterRue("Pullman", "Balancoire");
        carte.ajouterRue("Balancoire", "ESTI");

        MarcheurBlanc marche = new MarcheurBlanc(HEI);
        marche.marcher(carte, "ESTI");
        assertEquals("ESTI", marche.getPositionActuel().getNom());

    }
}
