package com.magicworld.player;

import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    InitilizeCharacter inite = new InitilizeCharacter();

    public static int nbPlayer = 1;
    private int nbPlayers = 2;
    public static int nbGrade;

    public void selectGrade(){
        while(nbPlayer <= nbPlayers)
        {
            System.out.println("Création du personnage du joueur " + nbPlayer);
            System.out.println("Veillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            nbGrade = sc.nextInt();
            inite.grade(nbGrade);
            nbPlayer++;
        }
    }

    public void assignLevel(){
        System.out.println("Niveau du Personnage ?");
        int nbLevel = sc.nextInt();
        inite.assignFeatures(nbLevel);
    }

    public void initPlayer(Integer grade, Integer level, Integer strength, Integer agility, Integer intelligence, Integer life){
        Create create = new Create();
        if(nbPlayer == 1)
            create.player1(grade, level, life, strength, agility, intelligence);
        else if(nbPlayer == 2)
            create.player2("Player 2", grade, level, life, strength, agility, intelligence);
        else {
            System.out.println("Une erreur est survenue lors qe la création des joueurs.");
            System.out.println("Relancer le jeu.");
            return;
        }

    }
}
