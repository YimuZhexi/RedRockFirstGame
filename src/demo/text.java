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
            myAnimal.getHeight(animal);
            myAnimal.getWeight(animal);
        }else{
            animal = "tiger";
            tiger myAnimal = new tiger();
            myAnimal.setHeight();
            myAnimal.setWeight();
            myAnimal.getHeight(animal);
            myAnimal.getWeight(animal);
        }
        System.out.println("请选择操作：\t1.oven\t2.refrigerator\t3.wardrobe\t4.washer");
        String box = sc.next();
        switch (box){
            case ("1"):
            case("oven"):
                oven myOven = new oven();
                myOven.setHeight();
                myOven.setWide();
                myOven.setTemperature();
                myOven.open();
                myOven.in(animal);
                myOven.start();
                myOven.roast(animal);
                break;
            case ("2"):
            case("refrigerator"):
                refrigerator myRefrigerator = new refrigerator();
                myRefrigerator.setHeight();
                myRefrigerator.setWide();
                myRefrigerator.setTemperature();
                myRefrigerator.open();
                myRefrigerator.in(animal);
                break;
            case ("3"):
            case("wardrobe"):
                wardrobe myWardrobe = new wardrobe();
                myWardrobe.setHeight();
                myWardrobe.setWide();
                myWardrobe.open();
                myWardrobe.in(animal);
                break;
            default:
                washer myWasher=new washer();
                myWasher.setHeight();
                myWasher.setWide();
                myWasher.open();
                myWasher.in(animal);
                myWasher.wash(animal);
                break;
        }
    }
}
