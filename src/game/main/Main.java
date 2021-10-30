package game.main;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        Hero myHero;
        String heroName;
        Enemy thisEnemy;
        Random random = new Random();
        String[] enName = {"炮兵", "远程兵", "近战士兵", "超级兵"};
        Artillery artillery = new Artillery();
        LongRangeSoldier longRangeSoldier = new LongRangeSoldier();
        longRangeSoldier.setEnemy();
        MeleeSoldier meleeSoldier = new MeleeSoldier();
        meleeSoldier.setEnemy();
        SuperSoldier superSoldier = new SuperSoldier();
        superSoldier.setEnemy();
        System.out.println("请选择角色：1、亚瑟\t2、公孙离\t3、奕星");
        YaSe yaSe = new YaSe();
        GongSunLi gongSunLi = new GongSunLi();
        YiXing yiXing = new YiXing();
        String heName = get.next();
        if (heName.equals("1") || heName.equals("亚瑟")) {
            myHero = yaSe;
            heroName = myHero.getName();
        } else if (heName.equals("2") || heName.equals("公孙离")) {
            myHero = gongSunLi;
            heroName = myHero.getName();
        } else {
            myHero = yiXing;
            heroName = myHero.getName();
        }
        myHero.setHero();
        myHero.getHero();
        while (true) {
            int num = random.nextInt(4);
            if (num == 0) {
                thisEnemy = artillery;
                if (thisEnemy.getHp() < 0) {
                    continue;
                }
            } else if (num == 1) {
                thisEnemy = longRangeSoldier;
                if (thisEnemy.getHp() < 0) {
                    continue;
                }
            } else if (num == 2) {
                thisEnemy = meleeSoldier;
                if (thisEnemy.getHp() < 0) {
                    continue;
                }
            } else {
                thisEnemy = superSoldier;
                if (thisEnemy.getHp() < 0) {
                    continue;
                }
            }
            if (artillery.getHp() <= 0 || longRangeSoldier.getHp() <= 0 || meleeSoldier.getHp() <= 0 || superSoldier.getHp() <= 0) {
                break;
            }
            System.out.println("输入任意值继续……");
            int a = get.nextInt();
            System.out.println("与您对战的是：" + thisEnemy.getName());
            thisEnemy.getEnemy();
            int heroHp = myHero.getHp();
            int enemyHp = thisEnemy.getHp();
            int enemyDefence = thisEnemy.getDefence();
            System.out.println("输入任意值继续……");
            a = get.nextInt();
            myHero.attack(heroName, enName[num], thisEnemy);
            thisEnemy.attack(enName[num], heroName, myHero, thisEnemy);
            if (heroName.equals("公孙离")) {
                gongSunLi.hpAdd(heroHp, enemyHp, enemyDefence);
            }
            System.out.println("最终结果：");
            myHero.getHero();
            thisEnemy.getEnemy();
            if (myHero.getHp() <= 0) {
                System.out.println("对不起，挑战失败。");
                break;
            }
        }
        System.out.println("恭喜您，胜利了！");
    }
}
