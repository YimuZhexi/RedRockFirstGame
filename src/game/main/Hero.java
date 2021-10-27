package game.main;

public class Hero {
    public int hp = 10000;
    public int defence = 100;
    public int atk = 500;

    public void getHero(){
        System.out.print("血量：");
        for(int i = 0;i<(hp/100);i++){
            System.out.print("■");
        }
        System.out.println(hp);
        System.out.print("防御：");
        for(int i = 0;i<defence;i++){
            System.out.print("■");
        }
        System.out.println(defence);
        System.out.print("攻击：");
        for(int i = 0;i<(atk/5);i++){
            System.out.print("■");
        }
        System.out.println(atk);
    }

    public int getHp(){
        return hp;
    }

    public int getDefence(){
        return defence;
    }

    public int getAtk(){
        return atk;
    }

    public int attack(String heroName,String enemyName,int enemyHp,int enemyDefence){
        enemyHp = enemyHp - atk * enemyDefence/(100+enemyDefence);
        System.out.println(heroName +"对"+enemyName+"造成了"+atk * enemyDefence/(100+enemyDefence)+"的伤害。");
        System.out.println("■■□");
        return enemyHp;
    }
}
