package com.magicworld.fight;

import java.util.Scanner;

import static com.magicworld.Features.*;

public class Fight {
    Scanner sc = new Scanner(System.in);

    public void fightP1(){
       if(gradeP1 == 1) {
           Warrior warrior = new Warrior();
           int select = sc.nextInt();
           if(select == 1)
               warrior.basic(player, strengthP1, lifeP2);
           else if (select == 2)
               warrior.special(player, strengthP1, lifeP2, lifeP1, levelP1);
           else
               System.out.println("Vous avez taper un nombre invalide !");
       } else if (gradeP1 == 2) {
           Ranger ranger = new Ranger();
           int select = sc.nextInt();
           if(select == 1)
                   ranger.basic(player, agilityP1, lifeP2);
           else if (select == 2)
               ranger.special(player, agilityP1, lifeP2, lifeP1, levelP1);
           else
               System.out.println("Vous avez taper un nombre invalide !");
       } else if (gradeP1 == 3) {
           Mage mage = new Mage();
           int select = sc.nextInt();
           if(select == 1)
               mage.basic(player, intelligenceP1, lifeP2);
           else if (select == 2)
               mage.special(player, intelligenceP1, lifeP2, lifeP1, levelP1);
           else
               System.out.println("Vous avez taper un nombre invalide !");
       } else{
           System.out.println("Une erreur est survenue !");
           System.out.println("Merci de relancer le jeu.");
           return;
       }
    }

    public void fightP2(){
        if(gradeP2 == 1) {
            Warrior warrior = new Warrior();
            int select = sc.nextInt();
            if(select == 1)
                warrior.basic(player, strengthP2, lifeP1);
            else if (select == 2)
                warrior.special(player, strengthP2, lifeP1, lifeP2, levelP2);
            else
                System.out.println("Vous avez taper un nombre invalide !");
        } else if (gradeP2 == 2) {
            Ranger ranger = new Ranger();
            int select = sc.nextInt();
            if(select == 1)
                ranger.basic(player, agilityP2, lifeP1);
            else if (select == 2)
                ranger.special(player, agilityP2, lifeP1, lifeP2, levelP2);
            else
                System.out.println("Vous avez taper un nombre invalide !");
        } else if (gradeP2 == 3) {
            Mage mage = new Mage();
            int select = sc.nextInt();
            if(select == 1)
                mage.basic(player, intelligenceP2, lifeP1);
            else if (select == 2)
                mage.special(player, intelligenceP2, lifeP1, lifeP2, levelP2);
            else
                System.out.println("Vous avez taper un nombre invalide !");
        } else{
            System.out.println("Une erreur est survenue !");
            System.out.println("Merci de relancer le jeu.");
            return;
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
                this.fightP1();
                player++;
            } else {
                System.out.println("Le joueur " + player + " (" + lifeP2 + " Vitalité) veillez utilisé votre action (1 : Attaque Basic, 2 : Attaque Spéciale)");
                this.fightP2();
                player--;
            }
        }
    }
}
