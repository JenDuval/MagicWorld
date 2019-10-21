package com.magicworld.fight;

import com.magicworld.player.Mage;
import com.magicworld.player.Players;
import com.magicworld.player.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FightTest {

    @Test
    void versus() {
        Players p1, p2;
        p1 = new Warrior("Joueur 1", 10, 10, 0,0);
        p2 = new Mage("Joueur 2", 10, 0, 0,10);

         int damages;

         for(int i = 0; i <= 7; i++){
             switch(i){
                 case 1 :
                     damages = p1.basic(2);
                     Assertions.assertEquals(10, damages);
                     break;
                 case 2 :
                     damages = p2.basic(2);
                     Assertions.assertEquals(10, damages);
                     break;
                 case 3 :
                     damages = p1.special(2);
                     Assertions.assertEquals(20, damages);
                     break;
                 case 4 :
                     damages = p2.special(2);
                     Assertions.assertEquals(0, damages);
                     break;
                 case 5 :
                     damages = p1.special(2);
                     Assertions.assertEquals(20, damages);
                     break;
                 case 6 :
                     damages = p2.basic(2);
                     Assertions.assertEquals(10, damages);
                     break;
                 case 7 :
                     damages = p1.special(2);
                     Assertions.assertEquals(20, damages);
                     break;
             }
         }
    }

    @Test
    void win() {
    }
}