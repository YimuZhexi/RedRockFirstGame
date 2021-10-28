package game.main;

public class Main {
    public static void main(String[] args) {
        Hero hero;
        GongSunLi gongUnLi = new GongSunLi();
        YiXing yiXing = new YiXing();
        YaSe yaSe = new YaSe();
        hero = yiXing;
        gongUnLi.getGongSunLi();
        yiXing.getYiXing();
        int hp = 5000;
        /*hero.getHero();*/
        hero.attack("123","12",hp,50);
    }
}
