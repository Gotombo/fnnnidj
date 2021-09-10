package com.company.players;

import com.company.AbilityType;
import com.company.boss.boss;

public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE);
    }


    @Override
    public void useAbility(Hero[] heroes, boss boss) {

    }
}
