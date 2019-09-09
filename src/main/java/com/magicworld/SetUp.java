package com.magicworld.character;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.magicworld.Start.nbPlayer;

public class SetUp {
    private static int nbCharacter;
    private static int nbLevel;
    private static int nbStrength;
    private static int nbAgility;
    private static int nbIntelligence;
    private static int life;
    Scanner sc = new Scanner(System.in);

    private void displayCharacter() {
        System.out.println("Création du personnage du joueur " + nbPlayer);
        System.out.println("Veillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
    }

    /**
     * Used to select the class for the player's character.
     * Set up the life of the player character.
     * @param character character = nbCharacter.
     *                  Number that selects the character class of the player.
     */
    private void selectCharacter(int character) {
        life = nbLevel*5;

        switch (character)
        {
            case 1:
                System.out.println("Woarg je suis le Guerrier du joueur " + nbPlayer + " je possède " + life + " de vitalité, " + nbStrength + " de force, " + nbAgility + " d'agilité et " + nbIntelligence + " d'intelligence !");
                break;
            case 2:
                System.out.println("Fufufu je suis le Rôdeur du joueur " + nbPlayer + " je possède " + life + " de vitalité, " + nbStrength + " de force, " + nbAgility + " d'agilité et " + nbIntelligence + " d'intelligence !");
                break;
            case 3:
                System.out.println("Abracadabra je suis le Mage du joueur " + nbPlayer + " je possède " + life + " de vitalité, " + nbStrength + " de force, " + nbAgility + " d'agilité et " + nbIntelligence + " d'intelligence !");
                break;
        }
    }

    /**
     * Set up the feature of the player.
     * Check if the total of the player's feature are less than or equal to are level.
     */
    private void setUpFeature() {
        int feature = nbStrength+nbAgility+nbIntelligence;

        if (feature <= nbLevel)
            this.selectCharacter(nbCharacter);
        else {
            System.out.println("Votre personnage est level " + nbLevel + " est vous avez entré " + feature + " point de compétence.");
            System.out.println("Les points de compétence ne peuvent pas être supérieur à votre niveau.");
            System.out.println("Vous avez donc " + nbLevel + "points de comptence à mettre dans les trois comptence demander.");
            System.out.println("Veillez recréé votre personnage !");
            this.recreated();
        }
    }

    /**
     * Check if the player's level is less than or equal to 100 and is greater than or equal to 1.
     */
    private void checkFeatures() {
        if (nbLevel >= 1 && nbLevel <= 100)
        {
            System.out.println("Force du Personnage ?");
            nbStrength = sc.nextInt();
            System.out.println("Agilité du Personnage ?");
            nbAgility = sc.nextInt();
            System.out.println("Intelligence du Personnage ?");
            nbIntelligence = sc.nextInt();
            this.setUpFeature();
        }  else {

            if ( nbLevel > 100)
                System.out.println("Le niveau de votre personnage est trop élevé. Il ne peut supérieur à 100.");
            else
                System.out.println("Le niveau de votre personnage est trop bas. Il ne être inférieur à 1.");

            System.out.println("Veillez recréé votre personnage !");
            this.recreated();
        }
    }

    private void checkCharacter() {
        if ( nbCharacter >= 1 && nbCharacter <= 3)
            this.recreated();
        else {
            System.out.println("Vous n'avez pas choisi de classe parmi les choix proposés");
            this.created();
        }

    }

    /**
     * Run asking process for this game.
     */
    public void created() {
        this.displayCharacter();
        try {
            nbCharacter = sc.nextInt();
            this.checkCharacter();
        } catch (InputMismatchException e) {
            sc.next();
            System.out.println("Vous devez saisir un nombre !");
            nbPlayer = 2;
            return;
        }
    }

    /**
     * Run asking process 2 for this game.
     */
    public void recreated() {
        System.out.println("Niveau du Personnage ?");
        nbLevel = sc.nextInt();
        this.checkFeatures();
    }
}
