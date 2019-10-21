package com.magicworld.player;

public class Warrior extends Players {
    int strength2;

    public Warrior(String name, int level, int strength, int agility, int intelligence) {
        super(name, level, strength, agility, intelligence);
    }

    @Override
    public String getScream() {
        return "Woarg !";
    }

    @Override
    public String getClasse() {
        return "Guerrier";
    }

    @Override
    public int basic(int nbPlayer) {
        System.out.println(name + " utilise coup d'épée et inflige " + strength + " dommages");
        System.out.println("Joueur " + nbPlayer + " perd " + strength + " points de vie");
        return this.strength;
    }

    @Override
    public int special(int nbPlayer) {

        strength2 = strength * 2;
        life = life - (strength / 2);

        System.out.println(name + " utilise coup de rage et inflige " + strength2 + " dommages");
        System.out.println("Joueur " + nbPlayer + " perd " + strength2 + " points de vie");
        System.out.println(name + " perd " + strength / 2 + " point de vie");
        return this.strength2;
    }
}