package com.magicworld;

import java.util.Map;

public interface Player {
    void character();
    void attack(String name, Integer );
    void initPlayer(Map<Integer, Integer> player);
}
