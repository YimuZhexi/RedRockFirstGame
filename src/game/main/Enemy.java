package game.main;

import java.util.Random;

//创建总的士兵类
public class Enemy {
    //初始化生命、防御、攻击
    public int hp = 2000;
    public int defence = 75;
    public int atk = 200;

    //传建一个更改士兵属性的方法备用
    public void setEnemy() {

    }

    //获得目前血量的方法
    public int getHp() {
        return hp;
    }

    //实时修改血量
    public void setHp(int hp) {
        this.hp = hp;
    }

    //获得士兵防御值的方法
    public int getDefence() {
        return defence;
    }

    //输出士兵属性
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

    //士兵攻击的方法
    public int attack(String enemyName, String heroName, Hero hero, Enemy enemy) {
        int heroHp = hero.getHp();
        int heroDefence = hero.getDefence();
        heroHp = heroHp - atk * heroDefence / (100 + heroDefence);
        hero.setHp(heroHp);//实时修改英雄血量
        System.out.println(enemyName + "对" + heroName + "造成了" + atk * heroDefence / (100 + heroDefence) + "的伤害。");
        System.out.print("英雄剩余血量：");
        for (int i = 0; i < (heroHp / 100); i++) {
            System.out.print("■");
        }
        System.out.println(heroHp);
        //添加反击机制
        Random random = new Random();
        int num = random.nextInt(4);
        if (num == 1) {
            System.out.println("您进行了反击。");
            int enemyHp = hero.attack(heroName, enemyName, enemy);
            enemy.setHp(enemyHp);
        }
        return heroHp;
    }
    //声明一个空的返回名字的方法
    public String getName() {
        return null;
    }
}
//创建远程兵类
class LongRangeSoldier extends Enemy {
    //输出远程兵属性
    public void getEnemy() {
        System.out.println("远程兵");
        super.getEnemy();
    }
    //初始化远程兵属性
    public void setEnemy() {
        super.hp = 1500;
        super.atk = 400;
        super.defence = 50;
    }
    //获得远程兵的名字
    public String getName() {
        return "远程兵";
    }
}
//创建近战士兵类
class MeleeSoldier extends Enemy {
    //创建获得近战小兵属性的方法
    public void getEnemy() {
        System.out.println("近战士兵");
        super.getEnemy();
    }
    //创建初始化近战小兵属性值的方法
    public void setEnemy() {
        super.atk = 300;
        super.hp = 2000;
        super.defence = 75;
    }
    //创建获得近战小兵姓名的方法
    public String getName() {
        return "近战士兵";
    }
}
//创建炮兵类
class Artillery extends Enemy {
    //创建获得炮兵属性的方法
    public void getEnemy() {
        System.out.println("炮兵");
        super.getEnemy();
    }
    //创建初始化炮兵数值的方法
    public void setEnemy() {
        super.atk = 400;
        super.hp = 3000;
        super.defence = 100;
    }
    //创建获得炮兵名字的方法
    public String getName() {
        return "炮兵";
    }
}
//创建超级兵类
class SuperSoldier extends Enemy {
    //创建获得超级兵属性的方法
    public void getEnemy() {
        System.out.println("超级兵");
        super.getEnemy();
    }
    //创建可以初始化超级兵属性的方法
    public void setEnemy() {
        super.atk = 500;
        super.hp = 4000;
        super.defence = 150;
    }
    //创建可以获得超级兵名字的方法
    public String getName() {
        return "超级兵";
    }
}