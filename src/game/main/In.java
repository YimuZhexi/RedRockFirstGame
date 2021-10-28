package game.main;

interface inHero {
    void getHero();

    int getHp();

    int getDefence();

    int getAtk();

    void setHero(int hp,int defence,int magicPoint,int atk);

    int attack(String heroName, String enemyName, int enemyHp, int enemyDefence);
}

interface inYaSe extends inHero {

}

interface inGongSunLi extends inHero {
    void getGongSunLi();

    int hpAdd(int heroHp, int enemyHp, int enemyDefence);
}

interface inYiXing extends inHero{

}