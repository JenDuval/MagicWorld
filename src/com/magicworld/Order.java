package com.magicworld;

import java.util.Scanner;

public class Order {
    /**
     * Display all available character in the game.
     */
    public void displayAvailableCharacter() {
        System.out.println("Création du personnage du joueur 1 ");
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
    }

    /**
     * Display a selected character.
     * @param nbCharacter The selected character.
     */
    public void displaySelectedCharacter(int nbCharacter) {
        switch (nbCharacter) {
            case 1:
                System.out.println("Woarg, je suis le Guerrier joueur 1");
                break;
            case 2:
                System.out.println("Tadatad, je suis le Rôdeur du joueur 1");
                break;
            case 3:
                System.out.println("Abracadabra, je suis le Mage joueur 1");
                break;
            default:
                System.out.println("Vous n'avez pas choisi de classe parmi les choix proposés");
                break;
         }
    }

    public void runCharacter() {
        this.displayAvailableCharacter();
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        this.displaySelectedCharacter(nb);
    }
}
