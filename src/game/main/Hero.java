package game.main;

import java.util.Random;

public class Hero implements inHero {
    public int hp = 9999;
    public int defence = 100;
    public int atk = 500;
    public int magicPoint = 100;

    public void setHero(){

    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void getHero() {
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
        System.out.print("法力：");
        for (int i = 0; i < magicPoint; i++) {
            System.out.print("■");
        }
        System.out.println(magicPoint);
    }

    public int getHp() {
        return hp;
    }

    public int getDefence() {
        return defence;
    }

    public int getAtk() {
        return atk;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public int attack(String heroName, String enemyName, Enemy enemy) {
        Random random = new Random();
        int ra = random.nextInt(4);
        int enemyDefence = enemy.getDefence();
        int enemyHp = enemy.getHp();
        int atk = this.atk;
        if(ra==1){
            System.out.println("暴击！");
            atk = atk*2;
        }
        enemyHp = enemyHp - atk * enemyDefence / (100 + enemyDefence);
        enemy.setHp(enemyHp);
        System.out.println(heroName + "对" + enemyName + "造成了" + atk * enemyDefence / (100 + enemyDefence) + "的伤害。");
        System.out.print("小兵剩余血量：");
        for (int i = 0; i < (enemyHp / 100); i++) {
            System.out.print("■");
        }
        System.out.println(enemyHp);
        return enemyHp;
    }

    @Override
    public String getName() {
        return null;
    }
}

class YaSe extends Hero implements inYaSe {

    public void getHero(){
        System.out.println("亚瑟");
        super.getHero();
    }

    public void setHero() {
        super.hp = 9999;
        super.defence = 100;
        super.atk = 500;
        super.magicPoint = 100;
    }

    @Override
    public String getName() {
        return "亚瑟";
    }
}

class GongSunLi extends Hero implements inGongSunLi {

    public void getHero(){
        System.out.println("公孙离：");
        super.getHero();
    }

    public void setHero() {
        super.hp = 7000;
        super.defence = 70;
        super.atk = 650;
    }

    public int hpAdd(int heroHp, int enemyHp, int enemyDefence) {
        int addHp = (650 * enemyDefence / (100 + enemyDefence)) / 10;
        heroHp += addHp;
        if (heroHp > 7000) {
            heroHp = 7000;
        }
        return heroHp;
    }

    public String getName() {
        return "公孙离";
    }
}

class YiXing extends Hero implements inYiXing {

    public void getHero(){
        System.out.println("奕星：");
        super.getHero();
    }

    public void setHero() {
        super.hp = 6500;
        super.defence = 50;
        super.atk = 300;
    }

    public int attack(String heroName, String enemyName, Enemy enemy) {
        Random random = new Random();
        int ra = random.nextInt(4);
        int enemyHp = enemy.getHp();
        int atk = this.atk;
        if(ra==1){
            System.out.println("暴击！");
            atk = atk*2;
        }
        enemyHp = enemyHp - atk;
        enemy.setHp(enemyHp);
        System.out.println(heroName + "对" + enemyName + "造成了" + atk + "的伤害。");
        System.out.print("小兵剩余血量：");
        for (int i = 0; i < (enemyHp / 100); i++) {
            System.out.print("■");
        }
        System.out.println(enemyHp);
        return enemyHp;
    }

    public String getName(){
        return "奕星";
    }
}
