package com.example.marcheur_blanc;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class MarcheurBlancTest {

    @Test
    void testMarcher() {
        Carte carte = new Carte();
        var nom = new NomDuMarcheur(" Bjarni");

        var HEI = new Lieu("Hei");
        var Pullman = new Lieu("Pullman");
        var Balancoire = new Lieu("Balancoire");
        var Nexta = new Lieu("Nexta");
        var BoulevardDeLEurope = new Lieu("Boulevard de l'europe");
        var ESTI = new Lieu("ESTI");

        carte.ajouterLieu(HEI);
        carte.ajouterLieu(Pullman);
        carte.ajouterLieu(Balancoire);
        carte.ajouterLieu(Nexta);
        carte.ajouterLieu(BoulevardDeLEurope);
        carte.ajouterLieu(ESTI);

        carte.ajouterRue("Hei","Pullman");
        carte.ajouterRue("Pullman","Nexta");
        carte.ajouterRue("Nexta","Pullman");
        carte.ajouterRue("Pullman", "Balancoire");
        carte.ajouterRue("Balancoire","Hei");
        carte.ajouterRue("Hei","Balancoire");
        carte.ajouterRue("Balancoire","Boulevard de l'europe");
        carte.ajouterRue("Boulevard de l'europe", "ESTI");

        MarcheurBlanc marche = new MarcheurBlanc(HEI);
        marche.marcher(carte, "ESTI");
        assertEquals("ESTI", marche.getPositionActuel().getNom());

    }
}
