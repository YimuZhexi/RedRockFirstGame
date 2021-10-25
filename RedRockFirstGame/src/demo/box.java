package demo;

//设置大类
public class box {
    private int height;
    private int wide;

    //设置高度
    public void setHeight(int height) {
        this.height = height;
        System.out.println("您设置高度为:" + height);
    }

    //设置宽度
    public void setWide(int wide) {
        this.wide = wide;
        System.out.println("您设置宽度为:" + wide);
    }

    //获得高度
    public int getHeight() {
        return height;
    }

    //获得宽度
    public int getWide() {
        return wide;
    }
    //
    public void open(){
        System.out.println("你打开了高"+height+"cm,宽"+wide+"cm的门");
    }
    //
    public void close(){
        System.out.println("你关掉了了高"+height+"cm,宽"+wide+"cm的门");
    }
}

/*设置冰箱*/
class refrigerator extends box {
    private int temperature;

    //设置温度
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("您设置的冰箱温度为：" + temperature);
    }

    //获得温度
    public int getTemperature() {
        return temperature;
    }
}

/*设置烤箱*/
class oven extends refrigerator {
    public void start() {
        System.out.println("正在运行");
    }
}

/*设置洗衣机*/
class washer extends oven {
}

/*设置衣柜*/
class wardrobe extends box {
}

