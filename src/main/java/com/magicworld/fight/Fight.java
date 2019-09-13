package com.magicworld.fight;

import java.util.Scanner;

import static com.magicworld.Features.*;

public class Fight {
    Scanner sc = new Scanner(System.in);

    public void fightP1(int select) {
        switch (gradeP1){
            case 1 :
                this.warrior(select, player, strengthP1, lifeP1, lifeP2, levelP1);
                break;
            case 2 :
                this.ranger(select, player, strengthP1, lifeP1, lifeP2, levelP1);
                break;
            case 3 :
                this.mage(select, player, strengthP1, lifeP1, lifeP2, levelP1);
                break;
        }
    }

    public void fightP2(int select) {
        switch (gradeP2) {
            case 1 :
                this.warrior(select, player, strengthP2, lifeP2, lifeP1, levelP2);
                break;
            case 2 :
                this.ranger(select, player, agilityP2, lifeP2, lifeP1, levelP2);
                break;
            case 3 :
                this.mage(select, player, intelligenceP2, lifeP2, lifeP1, levelP2);
                break;
        }
    }

    public void startFight() {
        boolean tour = true;
        player = 1;
        while(tour) {
            if(lifeP1 < 1) {
                System.out.println("Le joueur 1 a perdu !");
                tour = false;
            } else if(lifeP2 < 1) {
                System.out.println("Le joueur 2 a perdu !");
                tour = false;
            } else if(player == 1) {
                System.out.println("Le joueur " + player + " (" + lifeP1 + " Vitalité) veillez utilisé votre action (1 : Attaque Basic, 2 : Attaque Spéciale)");
                int select = sc.nextInt();
                this.validity(select);
                player++;
            } else {
                System.out.println("Le joueur " + player + " (" + lifeP2 + " Vitalité) veillez utilisé votre action (1 : Attaque Basic, 2 : Attaque Spéciale)");
                int select = sc.nextInt();
                this.validity(select);
                player--;
            }
        }
    }

    private void warrior(Integer select, Integer player, Integer strength, Integer life, Integer lifeAdvers, Integer level){
        Warrior warrior = new Warrior();
        switch (select) {
            case 1:
                warrior.basic(player, strength, life);
                break;
            case 2:
                warrior.special(player, strength, life, lifeAdvers, level);
                break;
        }
    }

    private void ranger(Integer select, Integer player, Integer agility, Integer life, Integer lifeAdvers, Integer level){
        Ranger ranger = new Ranger();

        switch (select) {
            case 1:
                ranger.basic(player, agility, life);
                break;
            case 2:
                ranger.special(player, agility, life, lifeAdvers, level);
                break;
        }
    }

    private void mage(Integer select, Integer player, Integer intelligence, Integer life, Integer lifeAdvers, Integer level){
        Mage mage = new Mage();

        switch (select) {
            case 1:
                mage.basic(player, intelligence, life);
                break;
            case 2:
                mage.special(player, intelligence, life, lifeAdvers, level);
                break;
        }
    }

    private void validity(int select) {
        if ( select >= 1 && select <= 2)
            if(player == 1)
                this.fightP1(select);
            else if(player == 2)
                this.fightP2(select);
            else
                System.out.println("Une erreur est survenue.");
        else {
            System.out.println("Vous n'avez pas choisi de classe parmi les choix proposés");
            this.startFight();
        }
    }
}
