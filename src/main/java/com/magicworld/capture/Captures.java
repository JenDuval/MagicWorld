package com.magicworld.capture;

/**
 * @author Duval Jennifer
 * @version 1.0
 */

import java.util.Scanner;

public class Captures {

    static Scanner sc = new Scanner(System.in);

    /**
     * Allows catcher is processed keyboard input
     * @param min Minimum value
     * @param max Maximum value
     * @return return the rest
     */
    public static int readInt(int min, int max) {
        String line = sc.nextLine();

        int rest;

        try {
            rest = Integer.parseInt(line);
        } catch (Exception e) {
            System.out.println("Cette valeur n'est pas autorisée");
            return readInt(min, max);
        }

        if (rest < min || rest > max) {
            System.out.println("Cette valeur n'est pas autorisée");
            return readInt(min, max);
        }

        return rest;
    }
}
