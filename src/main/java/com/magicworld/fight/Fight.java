package com.magicworld.fight;

/**
 * @author Duval Jennifer
 * @version 1.0
 */

import com.magicworld.capture.Captures;
import com.magicworld.player.Players;

public class Fight {
    static int turn = 1;

    /**
     * Combat between the two players
     * @param p1 player1: p1 contains all the skills of the player 1
     * @param p2 player2: p2 contains all the skills of player 2
     */
    public static void versus(Players p1, Players p2) {

        Players playerChallenger, playerDefender;
        int choiceAttack, damages, nbPlayer;

        do {
            if (turn % 2 == 1) {
                playerChallenger = p1;
                playerDefender = p2;
                nbPlayer = 2;
            } else {
                playerChallenger = p2;
                playerDefender = p1;
                nbPlayer = 1;
            }

            System.out.println(playerChallenger.name + " (" + playerChallenger.life + " vitalité) " +
                    "veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
            choiceAttack = Captures.readInt(1, 2);

            if (choiceAttack == 1)
                damages = playerChallenger.basic(nbPlayer);
            else
                damages = playerChallenger.special(nbPlayer);

            if (!(damages == 0))
                playerDefender.life -= damages;
            turn++;

        } while (p1.life > 0 && p2.life > 0);

        Fight.win(playerDefender.life, playerChallenger.life, playerChallenger.name, playerDefender.name);

    }


    /**
     * Determine who to win at the end of the duel
     * Display the message of death and who win
     * @param defender the life of the defender player
     * @param challenger the life of the challenger player
     * @param namChal the name of the challenger player
     * @param nameDef the name of the defending player
     */
    public static void win(int defender, int challenger, String namChal, String nameDef){
        if(defender <= 0 && challenger <= 0) {
            System.out.println(nameDef + " est mort");
            System.out.println(namChal + " est mort");
            System.out.println("Match null !!!!");
        } else if (defender <= 0) {
            System.out.println(nameDef + " est mort");
            System.out.println(nameDef + " a perdu !");
        } else if (challenger <= 0) {
            System.out.println(namChal + " est mort");
            System.out.println(namChal + " a perdu !");
        }
    }
}
