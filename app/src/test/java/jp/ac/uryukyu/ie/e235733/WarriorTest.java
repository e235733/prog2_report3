package jp.ac.uryukyu.ie.e235733;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int defaultHeroHp = 100;
        Warrior warrior = new Warrior("Warrior1", defaultHeroHp, 100);

        Enemy enemy1 = new Enemy("Enemy1", 150, 1);
        Enemy enemy2 = new Enemy("Enemy2", 150, 1);
        Enemy enemy3 = new Enemy("Enemy3", 150, 1);

        warrior.attackWithWeponSkill(enemy1);
        warrior.attackWithWeponSkill(enemy2);
        warrior.attackWithWeponSkill(enemy3);

        assertEquals(0, enemy1.getHitPoint());
        assertEquals(0, enemy2.getHitPoint());
        assertEquals(0, enemy3.getHitPoint());
    }
}