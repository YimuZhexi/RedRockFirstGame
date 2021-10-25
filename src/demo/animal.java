package demo;

public class animal {
    private int height;
    private int weight;
    //设置身高
    public void setHeight(int height){
        this.height=height;
    }
    //设置体重
    public void setWeight(int weight){
        this.weight = weight;
    }
    //获得高度
    public int getHeight() {
        return height;
    }
    //获得体重
    public int getWeight() {
        return weight;
    }
    //操作方法
    public void getIn(){
        System.out.println("你把它放了进去？");
        System.out.println("等着接受法律的制裁吧！！！");
    }
}
