package com.company;

import com.company.boss.boss;
import com.company.players.*;

public class RpgGame {
    public static void printStatistics(Hero heroes[], boss boss) {
        System.out.println("_______________");
        System.out.println("boss health:" + boss.getHealth());
        for (Hero hero : heroes) {
            System.out.println("Hero " + hero.getClass().getSimpleName()
                    + " current health: " + hero.getHealth());
        }
        System.out.println("_______________");
    }

    private static void heroesHits(Hero heroes[], boss boss) {
        for (Hero hero : heroes) {
            int heroDamage = hero.getDamage();
            boss.putDamage(heroDamage);
            System.out.println("Hero " + hero.getClass().getSimpleName() + " attack Boss - " + heroDamage);
        }
    }

    private static void bossHits(Hero heroes[], boss boss) {
        for (Hero hero : heroes) {
            int bossDamage = boss.getAttack();
            hero.putDamage(bossDamage);
            System.out.println("Boss attack hero " + hero.getClass().getSimpleName() + ": " + bossDamage);
        }
    }

    private static boolean isFinish(Hero heroes[], boss boss) {
        if (boss.getHealth() <= 0) {
            return true;
        }
        boolean allHeroesDead = true;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                allHeroesDead = false;
                break;
            }

        }
        return allHeroesDead;
    }

    private static void applyAbility(Hero heroes[], boss boss) {
        for (Hero hero : heroes) {
            hero.useAbility(heroes, boss);
        }

    }

    private static void round(Hero heroes[], boss boss) {
        //Нанесение урона боссом
        if (isFinish(heroes, boss)) ;

        if (isFinish(heroes, boss)) {
            printStatistics(heroes, boss);
        }
        heroesHits(heroes, boss);

        applyAbility(heroes, boss);

        printStatistics(heroes, boss);


    }

    public static void startGame() {
        Hero heroes[] = createHeroes();
        boss boss = new boss(400,30);
        printStatistics(heroes,boss);
        while (!isFinish(heroes,boss)){
            round(heroes,boss);
        }
    }

    private static Hero[] createHeroes() {
        Hero heroes[] = new Hero[4];
        heroes[0] = new Hunter(100, 10);
        heroes[1] = new Magical(100, 10);
        heroes[2] = new Warrion(100, 10);
        heroes[3] = new Medic(100, 10);
        return heroes;
    }
}


