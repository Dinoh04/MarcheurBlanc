package com.example.marcheur_blanc;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;


public class Carte {
    Map<String, Lieu> lieux;


    public Carte() {
        this.lieux = new HashMap<>();
    }

    public Lieu obtenirLieu(String nom) {
        return this.lieux.get(nom);
    }

    public void ajouterLieu(Lieu lieu) {
        this.lieux.put(lieu.getNom(), lieu);
    }

    @Override
    public String toString() {
        return "Carte{" +
                "lieux=" + lieux +
                '}';
    }

    public void ajouterRue(String nomLieu1, String nomLieu2) {
        Lieu premierlieu = this.lieux.get(nomLieu1);
        Lieu deuxiemelieu = this.lieux.get(nomLieu2);
        Rue rue = new Rue(premierlieu, deuxiemelieu);
        premierlieu.ajouterRue(rue);
        deuxiemelieu.ajouterRue(rue);
    }
}
