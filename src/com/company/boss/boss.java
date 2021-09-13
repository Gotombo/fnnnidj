package com.company.boss;

import com.company.GameEntity;

import java.util.Random;

public class boss extends GameEntity {
    public boss(int health, int damage) {
        super(health, damage);
    }
    public int getAttack(){
        int randomDanage = new Random().nextInt(3)+1;
        return this.damage*randomDanage;
    }

}
