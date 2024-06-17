package com.example.marcheur_blanc;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;



@AllArgsConstructor
@Getter
@Setter
public class Rue{
    private Lieu premierLieux;
    private  Lieu deuxiemeLieux;

    public Lieu getAutreLieu(Lieu lieu){
        if (lieu == premierLieux) {
            return deuxiemeLieux;
        } else {
            return premierLieux;
        }

    }

}
