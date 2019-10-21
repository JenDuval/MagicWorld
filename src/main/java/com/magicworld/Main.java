package com.magicworld;

import com.magicworld.fight.Fight;
import com.magicworld.player.*;

public class Main {
    final static boolean MODE_TEST = true;

    public static void main(String[] args) {

        Players p1, p2;

        //en mode de test, pour passer directement au combat, on crée automatiquement 2 personnages
        if(MODE_TEST) {
            p1 = new Warrior("Joueur 1", 10, 10, 0,0);
            p2 = new Mage("Joueur 2", 10, 0, 0,10);
        }else{
            p1 = Players.created("Joueur 1");
            p2 = Players.created("Joueur 2");
        }

        Fight.versus(p1,p2);
    }

}