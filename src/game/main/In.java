package game.main;

interface inHero {
    void getHero();

    int getHp();

    int getDefence();

    int getAtk();

    void setHp(int hp);

    int attack(String heroName, String enemyName, Enemy enemy);

    String getName();

    void setHero();
}

interface inYaSe extends inHero {

    String getName();
}

interface inGongSunLi extends inHero {

    int hpAdd(int heroHp, int enemyHp, int enemyDefence);
}

interface inYiXing extends inHero {
}