package game.main;

public class Hero implements inHero {
    int hp = 10000;
    int defence = 100;
    int atk = 500;
    int magicPoint = 100;

    public void setHero(int hp, int defence, int magicPoint, int atk) {
        this.hp = hp;
        this.defence = defence;
        this.magicPoint = magicPoint;
        this.atk = atk;
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

    public int attack(String heroName, String enemyName, int enemyHp, int enemyDefence) {
        enemyHp = enemyHp - atk * enemyDefence / (100 + enemyDefence);
        System.out.println(heroName + "对" + enemyName + "造成了" + atk * enemyDefence / (100 + enemyDefence) + "的伤害。");
        System.out.print("小兵剩余血量：");
        for (int i = 0; i < (enemyHp / 50); i++) {
            System.out.print("■");
        }
        for (int i = 0; i < (100 - enemyHp / 50); i++) {
            System.out.print("□");
        }
        System.out.println(enemyHp);
        return enemyHp;
    }
}

class YaSe extends Hero implements inYaSe {

}

class GongSunLi extends Hero implements inGongSunLi {
    public void getGongSunLi() {
        super.hp = 7000;
        super.defence = 70;
        super.atk = 650;
    }

    public int hpAdd(int heroHp, int enemyHp, int enemyDefence) {
        int addHp = (atk * enemyDefence / (100 + enemyDefence)) / 10;
        heroHp += addHp;
        if (heroHp > hp) {
            heroHp = hp;
        }
        return heroHp;
    }
}

class YiXing extends Hero implements inYiXing {
    public void getYiXing() {
        super.hp = 6500;
        super.defence = 50;
        super.atk = 300;
    }

    public int attack(String heroName, String enemyName, int enemyHp, int enemyDefence) {
        enemyHp = enemyHp - atk;
        System.out.println(heroName + "对" + enemyName + "造成了" + atk + "的伤害。");
        System.out.print("小兵剩余血量：");
        for (int i = 0; i < (enemyHp / 50); i++) {
            System.out.print("■");
        }
        for (int i = 0; i < (100 - enemyHp / 50); i++) {
            System.out.print("□");
        }
        System.out.println(enemyHp);
        return enemyHp;
    }
}
