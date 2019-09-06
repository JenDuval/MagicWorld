package com.magicworld;

public class Main {
    static int nbPlayer = 1;

    public static void main(String[] args) {
        int nbPlayers = 2;
        while (nbPlayer <= nbPlayers) {
            SetUp setup = new SetUp();
            setup.run();
            nbPlayer++;
        }
    }
}