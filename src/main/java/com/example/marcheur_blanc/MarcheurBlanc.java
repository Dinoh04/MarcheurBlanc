package com.example.marcheur_blanc;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@AllArgsConstructor
@Getter
public class MarcheurBlanc {

    private Lieu positionActuel;
    private Random endroitAuHasard;

    public MarcheurBlanc(Lieu positionActuel) {
        this.positionActuel = positionActuel;
        this.endroitAuHasard = new Random();
    }

    @Override
    public String toString() {
        return "MarcheBlanc{" +
                "positionActuel=" + positionActuel +
                ", endroitAuHasard=" + endroitAuHasard +
                '}';
    }

    public void marcher(Carte lieuDeDepart, String destination){
        List<Lieu> Arrive = new ArrayList<>();
        Arrive.add(positionActuel);

        while (!positionActuel.nom.equals(destination)){
            Rue rueAuHasard = positionActuel.getRues().get(endroitAuHasard.nextInt(positionActuel.getRues().size()));
            positionActuel = rueAuHasard.getAutreLieu(positionActuel);
            Arrive.add(positionActuel);
        }

        System.out.println("Marche terminé : "+ Arrive);

    }

}
