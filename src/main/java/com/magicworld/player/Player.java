package com.magicworld.player;

import com.magicworld.character.InitilizeCharacter;

import java.util.HashMap;
import java.util.Map;
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
        Map<Integer, Integer> player =  new HashMap<>();
        if(nbPlayer == 1) {
            player.put(0, grade);
            player.put(1, level);
            player.put(2, life);
            player.put(3, strength);
            player.put(4, agility);
            player.put(5, intelligence);
        }else if(nbPlayer == 2) {
            player.put(6, grade);
            player.put(7, level);
            player.put(8, life);
            player.put(9, strength);
            player.put(10, agility);
            player.put(11, intelligence);
        }
    }
}
