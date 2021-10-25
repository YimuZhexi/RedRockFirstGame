package demo;

import java.util.Scanner;

public class animal {
    int height = 0;
    int weight = 0;
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
    public void getHeight(String animal) {
        System.out.println(animal + "高度为" + height);
    }

    //获得体重
    public void getWeight(String animal) {
        System.out.println(animal + "重量为" + weight);
    }
}

class elephant extends animal {
}

class tiger extends animal {
}