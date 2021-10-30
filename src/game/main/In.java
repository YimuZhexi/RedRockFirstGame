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

    void hpAdd(int heroHp, int enemyHp, int enemyDefence);
}
/*
说实话，还是不太懂接口的具体作用和方法
*/
