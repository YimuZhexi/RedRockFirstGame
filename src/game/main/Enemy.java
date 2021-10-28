package game.main;

public class Enemy {
    public int hp = 5000;
    public int defence = 100;
    public int atk = 200;

    public int getHp() {
        return hp;
    }

    public int getDefence() {
        return defence;
    }

    public int getAtk() {
        return atk;
    }

    public void getEnemy() {
        System.out.print("血量：");
        for (int i = 0; i < (hp / 50); i++) {
            System.out.print("■");
        }
        System.out.println(hp);
        System.out.print("防御：");
        for (int i = 0; i < defence; i++) {
            System.out.print("■");
        }
        System.out.println(defence);
        System.out.print("攻击：");
        for (int i = 0; i < (atk / 2); i++) {
            System.out.print("■");
        }
        System.out.println(atk);
    }

    public int attack(String enemyName, String heroName, int heroHp, int heroDefence) {
        heroHp = heroHp - atk * heroDefence / (100 + heroDefence);
        System.out.println( enemyName + "对" + heroName + "造成了" + atk * heroDefence / (100 + heroDefence) + "的伤害。");
        System.out.print("小兵剩余血量：");
        for (int i = 0; i < (heroHp / 50); i++) {
            System.out.print("■");
        }
        for (int i = 0; i < (100 - heroHp / 50); i++) {
            System.out.print("□");
        }
        System.out.println(heroHp);
        return heroHp;
    }
}
