package com.magicworld.fight;

import static com.magicworld.Features.*;

public class Ranger implements Attack {
    @Override
    public void basic(Integer player, Integer comp, Integer lifeAdvers) {
        System.out.println("Le joueur " + player + " utilise Tir à l’Arc est inflige " + comp + " dommages.");

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
        int comp2 = level/2;
        comp = comp + comp2;
        System.out.println("Le joueur " + player + " gagne " + comp2 + " en agilité.");

        if(player == 1) {
            agilityP1 = comp;
            player++;
        }
        else {
            agilityP2 = comp;
            player--;
        }

    }
}
