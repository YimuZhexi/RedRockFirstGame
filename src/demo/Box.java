package demo;

import java.util.Scanner;

//设置大类
public class Box {
    private int height;
    private int wide;
    Scanner sc = new Scanner(System.in);

    //设置高度
    public void setHeight() {
        System.out.println("请设置高度：");
        int height = sc.nextInt();
        this.height = height;
        System.out.println("您设置高度为:" + height);
    }

    //设置宽度
    public void setWide() {
        System.out.println("请设置宽度：");
        int wide = sc.nextInt();
        this.wide = wide;
        System.out.println("您设置宽度为:" + wide);
    }

    //获得高度
    public int getHeight() {
        System.out.println("高度为："+height);
        return height;
    }

    //获得宽度
    public int getWide() {
        System.out.println("宽度为："+wide);
        return wide;
    }

    //开门
    public void open() {
        System.out.println("你打开了高" + height + "cm,宽" + wide + "cm的门");
    }

    //放
    public void in(String setAnimal) {
        System.out.println("你把" + setAnimal + "放了进去。。。");
        System.out.println("等等，你把他放进去了？");
        System.out.println("准备接受法律制裁吧！！！");
    }

    //关门
    public void close() {
        System.out.println("你关掉了了高" + height + "cm,宽" + wide + "cm的门");
    }
}

/*设置冰箱*/
class Refrigerator extends Box {

    //设置温度
    public void setTemperature() {
        System.out.println("请设置温度：");
        int temperature = sc.nextInt();
        System.out.println("您设置的冰箱温度为：" + temperature);
    }
}

/*设置烤箱*/
class Oven extends Box {

    //设置温度
    public void setTemperature() {
        System.out.println("请设置温度：");
        int temperature = sc.nextInt();
        System.out.println("您设置的烤箱温度为：" + temperature);
    }

    public void roast(String animal) {
        System.out.println("正在烤"+animal+"。。。");
    }

    public void start() {
        System.out.println("正在运行");
    }
}

/*设置洗衣机*/
class Washer extends Box {
    //开洗
    public void wash(String animal){
        System.out.println("正在洗"+animal+"。。。");
    }
}

/*设置衣柜*/
class Wardrobe extends Box {
}

