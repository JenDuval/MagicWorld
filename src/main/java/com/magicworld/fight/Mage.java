package com.magicworld.fight;

import static com.magicworld.Features.*;

public class Mage implements Attack {
    @Override
    public void basic(Integer player, Integer comp, Integer lifeAdvers) {
        System.out.println("Le joueur " + player + " utilise Boule de Feu est inflige " + comp + " dommages.");

        lifeAdvers = lifeAdvers - comp;

        if(player == 1) {
            lifeP2 = lifeAdvers;
            player++;
        }
        else {
            lifeP1 = lifeAdvers;
            player--;
        }
        System.out.println("Le joueur " + player + " perd " + comp + " point de vie.");
    }

    @Override
    public void special(Integer player, Integer comp, Integer lifeAdvers, Integer life, Integer level) {
        life = life + (comp*2);

        System.out.println("Le joueur " + player + " utilise Soin " + comp + " en vitalité.");

        if(!(life == (level*5))){
            life = level*5;
        }

        if(player == 1)
            lifeP1 = life;
        else
            lifeP2 = life;
    }
}
