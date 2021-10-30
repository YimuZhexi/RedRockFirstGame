package game.main;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        //创建myHero
        Hero myHero;
        //创建heroName用来保存英雄名字
        String heroName;
        //创建thisEnemy
        Enemy thisEnemy;
        Random random = new Random();
        //用数组保存小兵名字
        String[] enName = {"炮兵", "远程兵", "近战士兵", "超级兵"};
        //new出各对象（bushi），并初始化各士兵属性
        Artillery artillery = new Artillery();
        LongRangeSoldier longRangeSoldier = new LongRangeSoldier();
        longRangeSoldier.setEnemy();
        MeleeSoldier meleeSoldier = new MeleeSoldier();
        meleeSoldier.setEnemy();
        SuperSoldier superSoldier = new SuperSoldier();
        superSoldier.setEnemy();
        //创建选项，让玩家选择角色
        System.out.println("请选择角色：1、亚瑟\t2、公孙离\t3、奕星");
        YaSe yaSe = new YaSe();
        GongSunLi gongSunLi = new GongSunLi();
        YiXing yiXing = new YiXing();
        String heName = get.next();
        //依据玩家选择获得各角色名字
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
        //依据选择初始化属性并获得属性
        myHero.setHero();
        myHero.getHero();
        //单调乏味的攻击方式
        while (true) {
            //随机获得对战小兵并判断其生命值是否小于0，若小于0则跳过重新抽取
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
            //若全部抽取完成但生命值均低于0，则退出循环，直接结算
            if (artillery.getHp() <= 0 || longRangeSoldier.getHp() <= 0 || meleeSoldier.getHp() <= 0 || superSoldier.getHp() <= 0) {
                break;
            }
            //防止输出过快搞的没用的小玩意
            System.out.println("输入任意值继续……");
            int a = get.nextInt();
            //提示对战对象并获得其属性
            System.out.println("与您对战的是：" + thisEnemy.getName());
            thisEnemy.getEnemy();
            //创建一堆变量用于接收属性
            int heroHp;
            int enemyHp = thisEnemy.getHp();
            int enemyDefence = thisEnemy.getDefence();
            //添加这行注释水代码行数？
            System.out.println("输入任意值继续……");
            a = get.nextInt();
            //英雄攻击方法调用
            myHero.attack(heroName, enName[num], thisEnemy);
            //小兵攻击方法调用
            thisEnemy.attack(enName[num], heroName, myHero, thisEnemy);
            heroHp = myHero.getHp();
            //调用吸血方法（如果选择是射手的话）
            myHero.hpAdd(heroHp, enemyHp, enemyDefence);
            System.out.println("最终结果：");
            //向玩家展示最终结果
            myHero.getHero();
            thisEnemy.getEnemy();
            //判断玩家血量，小于0则挑战失败
            if (myHero.getHp() <= 0) {
                System.out.println("对不起，挑战失败。");
                break;
            }
        }
        //胜利语句
        System.out.println("恭喜您，胜利了！");
        /*
        最后本来想添加一个选择是否再来一局的选项，但感觉没那必要。。。
        因为以我现在的能力写出来的东西。。。完全没啥可玩性
        */
    }
}
