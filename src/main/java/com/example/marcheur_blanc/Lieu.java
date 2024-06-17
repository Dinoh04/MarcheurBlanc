package com.example.marcheur_blanc;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public  class Lieu {
    public  String nom;
    private  List<Rue> Rues;

    public Lieu(String nom) {
        this.nom = nom;
        this.Rues = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Lieu" + "nom=" + nom;
    }

    public void ajouterRue(Rue rue){
          this.Rues.add(rue);
    };
}
