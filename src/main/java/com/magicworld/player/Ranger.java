package com.magicworld.player;

public class Ranger extends Players {
    public Ranger(String name, int level, int strength, int agility, int intelligence) {
        super(name, level, strength, agility, intelligence);
    }

    @Override
    public String getScream() {
        return "Fufufu !";
    }

    @Override
    public String getClasse() {
        return "Rôdeur";
    }


    @Override
    public int basic(int nbPlayer) {
        System.out.println(name + " utilise tir à l’arc et inflige " + agility + " dommages");
        System.out.println("Joueur " + nbPlayer + " perd " + agility + " points de vie");
        return this.agility;
    }

    @Override
    public int special(int nbPlayer) {
        System.out.println(name + " utilise concentration");
        agility = agility + (level / 2);
        System.out.println(name + " a gagné " + level / 2 + " en agilité");
        return 0;
    }

}
