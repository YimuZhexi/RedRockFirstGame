package game.main;

import java.util.Random;

public class Enemy {
    public int hp = 2000;
    public int defence = 75;
    public int atk = 200;

    public void setEnemy(){

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefence() {
        return defence;
    }

    public void getEnemy() {
        System.out.print("血量：");
        for (int i = 0; i < (hp / 100); i++) {
            System.out.print("■");
        }
        System.out.println(hp);
        System.out.print("防御：");
        for (int i = 0; i < defence; i++) {
            System.out.print("■");
        }
        System.out.println(defence);
        System.out.print("攻击：");
        for (int i = 0; i < (atk / 5); i++) {
            System.out.print("■");
        }
        System.out.println(atk);
    }

    public int attack(String enemyName, String heroName, Hero hero,Enemy enemy) {
        int heroHp = hero.getHp();
        int heroDefence = hero.getDefence();
        heroHp = heroHp - atk * heroDefence / (100 + heroDefence);
        hero.setHp(heroHp);
        System.out.println(enemyName + "对" + heroName + "造成了" + atk * heroDefence / (100 + heroDefence) + "的伤害。");
        System.out.print("英雄剩余血量：");
        for (int i = 0; i < (heroHp / 100); i++) {
            System.out.print("■");
        }
        System.out.println(heroHp);

        Random random = new Random();
        int num = random.nextInt(4);
        if(num==1){
            System.out.println("您进行了反击。");
            int enemyHp = hero.attack(heroName,enemyName,enemy);
            enemy.setHp(enemyHp);
        }
        return heroHp;
    }

    public String getName() {
        return null;
    }
}

class LongRangeSoldier extends Enemy {

    public void getEnemy(){
        System.out.println("远程兵");
        super.getEnemy();
    }

    public void setEnemy() {
        super.hp = 1500;
        super.atk = 400;
        super.defence = 50;
    }

    public String getName() {
        return "远程兵";
    }
}

class MeleeSoldier extends Enemy {

    public void getEnemy(){
        System.out.println("近战士兵");
        super.getEnemy();
    }

    public void setEnemy(){
        super.atk = 300;
        super.hp = 2000;
        super.defence = 75;
    }
    public String getName() {
        return "近战士兵";
    }
}

class Artillery extends Enemy {

    public void getEnemy(){
        System.out.println("炮兵");
        super.getEnemy();
    }

    public void setEnemy() {
        super.atk = 400;
        super.hp = 3000;
        super.defence = 100;
    }

    public String getName() {
        return "炮兵";
    }
}

class SuperSoldier extends Enemy {

    public void getEnemy(){
        System.out.println("超级兵");
        super.getEnemy();
    }

    public void setEnemy() {
        super.atk = 500;
        super.hp = 4000;
        super.defence = 150;
    }
    public String getName(){
        return "超级兵";
    }
}