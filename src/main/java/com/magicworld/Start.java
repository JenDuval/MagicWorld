package com.magicworld;

public class Start {
    public static int nbPlayer = 1;

    public static void started() {
        int nbPlayers = 2;
        while (nbPlayer <= nbPlayers) {
            SetUp setup = new SetUp();
            setup.created();
            nbPlayer++;
        }
    }
}