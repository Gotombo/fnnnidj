package com.company.players;

import com.company.AbilityType;
import com.company.boss.boss;

public class Magical extends Hero {
    public Magical(int health, int damage) {
        super(health, damage, AbilityType.BOOST);
    }


    @Override
    public void useAbility(Hero[] heroes, boss boss) {

    }


}
