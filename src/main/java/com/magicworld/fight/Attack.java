package com.magicworld.fight;

public interface Attack {
    void basic(Integer player, Integer comp, Integer lifeAdvers);
    void special(Integer player, Integer comp, Integer lifeAdvers, Integer life, Integer level);
}
