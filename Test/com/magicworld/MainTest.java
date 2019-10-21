package com.magicworld;

import com.magicworld.capture.CapturesTest;
import com.magicworld.player.Mage;
import com.magicworld.player.Players;
import com.magicworld.player.Warrior;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void main() {
        Players p1, p2;
        int level = 10;
        int point = 10;
        int i = 0;

        p1 = new Warrior("Joueur 1", level, point, i,i);
        p2 = new Mage("Joueur 2", level, i, i,point);

       CapturesTest.readInt(i, point);
    }
}