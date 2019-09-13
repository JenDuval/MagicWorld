package com.magicworld.fight;

import static com.magicworld.Features.*;

public class Warrior implements Attack {
    @Override
    public void basic(Integer player, Integer comp, Integer lifeAdvers) {
        System.out.println("Le joueur " + player + " utilise Coup d’Épée est inflige " + comp + " dommages.");

        lifeAdvers = lifeAdvers - comp;

        if (player == 1) {
            lifeP2 = lifeAdvers;
            player++;
        } else {
            lifeP1 = lifeAdvers;
            player--;
        }
        System.out.println("Le joueur " + player + " perd " + comp + " point de vie.");
    }

    @Override
    public void special(Integer player, Integer comp, Integer lifeAdvers, Integer life, Integer level) {
        comp = comp*2;
        int comp2 = comp/2;
        lifeAdvers = lifeAdvers - comp;
        life = life - comp2;

        System.out.println("Le joueur " + player + " utilise Coup de rage est inflige " + comp + " dommages.");
        if (player == 1) {
            player++;
            System.out.println("Le joueur " + player + " perd " + comp + " point de vie.");
            player--;
            System.out.println("Le joueur " + player + " perd " + comp2 + " point de vie.");
            lifeP2 = lifeAdvers;
            lifeP1 = life;
        } else {
            player--;
            System.out.println("Le joueur " + player + " perd " + comp + " point de vie.");
            player++;
            System.out.println("Le joueur " + player + " perd " + comp2 + " point de vie.");
            lifeP2 = lifeAdvers;
            lifeP1 = life;
        }
    }
}
