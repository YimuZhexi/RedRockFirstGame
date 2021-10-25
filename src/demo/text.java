package demo;

import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择动物：\t1.elephant\t2.tiger");
        String animal = sc.next();
        if(animal.equals("1")||animal.equals("elephant")){
            animal = "elephant";
            elephant myAnimal = new elephant();
            myAnimal.setHeight();
            myAnimal.setWeight();
            int height = myAnimal.getHeight(animal);
            int weight = myAnimal.getWeight(animal);
        }else{
            animal = "tiger";
            tiger myAnimal = new tiger();
            myAnimal.setHeight();
            myAnimal.setWeight();
            int height = myAnimal.getHeight(animal);
            int weight = myAnimal.getWeight(animal);
        }
        box myBox =new box();
        myBox.setHeight();
        oven myOven = new oven();
        myOven.getHeight();
    }
}
