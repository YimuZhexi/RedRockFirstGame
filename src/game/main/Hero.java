package game.main;

import java.util.Random;

//设置英雄大类
public class Hero implements inHero {
    public int hp = 9999;
    public int defence = 100;
    public int atk = 500;
    public int magicPoint = 100;

    //设置英雄属性
    public void setHero() {

    }

    //设置修改血量的方法，便于修改
    public void setHp(int hp) {
        this.hp = hp;
    }

    //获得英雄属性
    public void getHero() {
        //萌新并不知道怎么解决代码重复的问题
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

    //获得英雄血量
    public int getHp() {
        return hp;
    }

    //获得英雄防御
    public int getDefence() {
        return defence;
    }

    //获得英雄攻击
    public int getAtk() {
        return atk;
    }

    //获得英雄法力值（但因为懒得写技能被闲置了。。。）
    public int getMagicPoint() {
        return magicPoint;
    }

    //英雄进行攻击
    public int attack(String heroName, String enemyName, Enemy enemy) {
        Random random = new Random();
        int ra = random.nextInt(4);
        int enemyDefence = enemy.getDefence();
        int enemyHp = enemy.getHp();
        int atk = this.atk;
        //添加个暴击机制玩
        if (ra == 1) {
            System.out.println("暴击！");
            atk = atk * 2;
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

    //为子类创建一个获得英雄名的方法
    @Override
    public String getName() {
        return null;
    }

    //为射手添加的吸血方法
    public void hpAdd(int heroHp, int enemyHp, int enemyDefence) {
    }
}

//创建近战英雄亚瑟
class YaSe extends Hero implements inHero {
    //为getHero指令添加输出英雄名功能
    public void getHero() {
        System.out.println("亚瑟");
        super.getHero();
    }

    //重新设置英雄属性
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

class GongSunLi extends Hero implements inHero {
    //为getHero指令添加输出英雄名功能
    public void getHero() {
        System.out.println("公孙离：");
        super.getHero();
    }

    //重新设置英雄属性
    public void setHero() {
        super.hp = 7000;
        super.defence = 70;
        super.atk = 650;
    }

    //为射手写加血机制
    @Override
    public void hpAdd(int heroHp, int enemyHp, int enemyDefence) {
        int addHp = (650 * enemyDefence / (100 + enemyDefence)) / 10;
        heroHp += addHp;
        if (heroHp > 7000) {
            heroHp = 7000;
        }
        this.hp = heroHp;
    }

    public String getName() {
        return "公孙离";
    }
}

class YiXing extends Hero implements inHero {
    //为getHero指令添加输出英雄名功能
    public void getHero() {
        System.out.println("奕星：");
        super.getHero();
    }

    //重新设置英雄属性
    public void setHero() {
        super.hp = 6500;
        super.defence = 50;
        super.atk = 300;
    }

    //重写无视防御的攻击方式
    public int attack(String heroName, String enemyName, Enemy enemy) {
        Random random = new Random();
        int ra = random.nextInt(4);
        int enemyHp = enemy.getHp();
        int atk = this.atk;
        if (ra == 1) {
            System.out.println("暴击！");
            atk = atk * 2;
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

    public String getName() {
        return "奕星";
    }
}
