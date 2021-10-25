package demo;

import java.util.Scanner;

public class animal {
    private int height;
    private int weight;
    Scanner sc = new Scanner(System.in);

    //设置身高
    public void setHeight() {
        System.out.println("请输入高度：");
        this.height = sc.nextInt();
    }

    //设置体重
    public void setWeight() {
        System.out.println("请输入重量：");
        this.weight = sc.nextInt();
    }

    //获得高度
    public int getHeight(String animal) {
        System.out.println(animal+"高度为"+height);
        return height;
    }

    //获得体重
    public int getWeight(String animal) {
        System.out.println(animal+"重量为"+weight);
        return weight;
    }

    //操作方法
    public void getIn(String animal) {
        box box = new box();
        box.in(animal);
        System.out.println("你把它放了进去？");
        System.out.println("等着接受法律的制裁吧！！！");
    }
}

class elephant extends animal {

}

class tiger extends animal {
}