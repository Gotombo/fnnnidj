package com.company.players;

import com.company.AbilityType;
import com.company.boss.boss;

public class Warrion extends Hero {
    public Warrion(int health, int damage) {
        super(health, damage, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }


    @Override
    public void useAbility(Hero[] heroes, boss boss) {

    }
}
