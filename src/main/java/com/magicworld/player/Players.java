package com.magicworld.player;

import com.magicworld.capture.Captures;

public abstract class Players {
    public String name;

    int level;
    public int life;
    int lifeInitial;
    int strength;
    int agility;
    int intelligence;

    /**
     * Displays the finished character of each player.
     * Name, level, life, strength, agility and intelligence.
     * @param name         gives the player who is created players (1 or 2)
     * @param level        level of the player
     * @param strength     force of the player
     * @param agility      player agility
     * @param intelligence intelligence of the player
     */
    public Players(String name, int level, int strength, int agility, int intelligence) {
        this.name = name;
        this.level = level;
        this.life = level * 5;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;

        System.out.println(getScream() + " " +
                "Je suis le " + getClasse() + " " + name + " niveau " + level + ". "
                + "Je possède " + life + " de vitalité, "
                + strength + " de force, "
                + agility + " d'agilité et "
                + intelligence + " d'intelligence !");
        System.out.println("================");
    }

    /**
     * allows to create the character of the players
     * @param name gives the player who is created players (1 or 2)
     * @return returns the player character class
     */
    public static Players created(String name) {
        System.out.println("Création du personnage du " + name);
        System.out.println("Veuillez choisir la classe de votre personnage ("
                + "1 : Guerrier, "
                + "2 : Rôdeur, "
                + "3 : Mage)");
        int grade = Captures.readInt(1, 3);

        System.out.println("Niveau du personnage ?");
        int level = Captures.readInt(1, 100);

        int maxStrength = level;
        System.out.println("Force du personnage ?");
        int strength = Captures.readInt(0, maxStrength);

        int maxAgility = maxStrength - strength;
        System.out.println("Agilité du personnage ?");
        int agility = Captures.readInt(0, maxAgility);

        int maxIntelligence = maxAgility - agility;
        System.out.println("Intelligence du personnage ?");
        int intelligence = Captures.readInt(maxIntelligence, maxIntelligence);


        if (grade == 1)
            return new Warrior(name, level, strength, agility, intelligence);
        else if (grade == 2)
            return new Rogue(name, level, strength, agility, intelligence);
        else
            return new Mage(name, level, strength, agility, intelligence);
    }

    /**
     * Scream of the character
     * @return returns the character's scream
     */
    public abstract String getScream();

    /**
     * character class
     * @return returns the character class
     */
    public abstract String getClasse();


    /**
     * Basic attack of the player
     * @param nbPlayer sends a number 1 or 2 to distinguish the 2 players
     * @return the damage that the attack does
     */
    public abstract int basic(int nbPlayer);

    /**
     * Special attack of the player
     * @param nbPlayer sends a number 1 or 2 to distinguish the 2 players
     * @return the damage that the attack does
     */
    public abstract int special(int nbPlayer);
}
