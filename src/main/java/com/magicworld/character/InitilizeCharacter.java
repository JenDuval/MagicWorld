package com.magicworld.character;

import com.magicworld.player.Player;

import java.util.Scanner;

import static com.magicworld.player.Player.nbGrade;
import static com.magicworld.player.Player.nbPlayer;

public class InitilizeCharacter implements Character {
    Scanner sc = new Scanner(System.in);

    public void assignFeatures(int level) {
        Player player = new Player();
        if (level >= 1 && level <= 100)
        {
            System.out.println("Force du Personnage ?");
            int nbStrength = sc.nextInt();
            System.out.println("Agilité du Personnage ?");
            int nbAgility = sc.nextInt();
            System.out.println("Intelligence du Personnage ?");
            int nbIntelligence = sc.nextInt();
            this.checkFeatures(level,nbStrength, nbAgility, nbIntelligence);
        }  else {

            if ( level > 100)
                System.out.println("Le niveau de votre personnage est trop élevé. Il ne peut supérieur à 100.");
            else
                System.out.println("Le niveau de votre personnage est trop bas. Il ne être inférieur à 1.");

            System.out.println("Veillez recréé votre personnage !");
            player.assignLevel();
        }
    }

    private void checkFeatures(int level,int strength, int agility, int intelligence) {
        int feature = strength+agility+intelligence;

        if (feature <= level)
            this.created(nbGrade,level, strength, agility, intelligence);
        else {
            System.out.println("Votre personnage est level " + level + " est vous avez entré " + feature + " point de compétence.");
            System.out.println("Les points de compétence ne peuvent pas être supérieur à votre niveau.");
            System.out.println("Vous avez donc " + level + "points de comptence à mettre dans les trois comptence demander.");
            System.out.println("Veillez recréé votre personnage !");
            this.assignFeatures(level);
        }
    }

    private void created(int nbGrade, int level, int strength, int agility, int intelligence) {
        Player player = new Player();
        int life = level*5;

        switch (nbGrade)
        {
            case 1:
                System.out.println("Woarg je suis le Guerrier du joueur " + nbPlayer + " je possède " + life + " de vitalité, " + strength + " de force, " + agility + " d'agilité et " + intelligence + " d'intelligence !");
                break;
            case 2:
                System.out.println("Fufufu je suis le Rôdeur du joueur " + nbPlayer + " je possède " + life + " de vitalité, " + strength + " de force, " + agility + " d'agilité et " + intelligence + " d'intelligence !");
                break;
            case 3:
                System.out.println("Abracadabra je suis le Mage du joueur " + nbPlayer + " je possède " + life + " de vitalité, " + strength + " de force, " + agility + " d'agilité et " + intelligence + " d'intelligence !");
                break;
        }

        player.initPlayer(nbGrade, level, strength, agility, intelligence, life);
    }

    public void grade(int nbGrade) {
        Player player = new Player();
        if ( nbGrade >= 1 && nbGrade <= 3)
            player.assignLevel();
        else {
            System.out.println("Vous n'avez pas choisi de classe parmi les choix proposés");
            player.selectGrade();
        }
    }
}
