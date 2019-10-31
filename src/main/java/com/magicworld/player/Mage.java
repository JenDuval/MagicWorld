package com.magicworld.player;

/**
 * @author Duval Jennifer
 * @version 1.0
 */

public class Mage extends Players {
    public Mage(String name, int level, int strength, int agility, int intelligence) {
        super(name, level, strength, agility, intelligence);
    }

    @Override
    public String getScream() {
        return "Abracadabra !";
    }

    @Override
    public String getClasse() {
        return "Mage";
    }

    @Override
    public int basic(int nbPlayer) {
        System.out.println(name + " utilise boule de feu et inflige " + intelligence + " dommages");
        System.out.println("Joueur " + nbPlayer + " perd " + intelligence + " points de vie");
        return this.intelligence;
    }

    @Override
    public int special(int nbPlayer) {
        System.out.println(name + " utilise soin");
        lifeInitial = level * 5;
        life = life + (intelligence * 2);
        if (life > lifeInitial)
            life = lifeInitial;

        System.out.println(name + " a gagné " + intelligence * 2 + " point de vie");
        return 0;
    }
}
