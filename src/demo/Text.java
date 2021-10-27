package demo;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择动物：\t1.elephant\t2.tiger");
        String animal = sc.next();
        Animal animalChoice;
        Elephant myElephant = new Elephant();
        Tiger myTiger = new Tiger();
        if (animal.equals("1") || animal.equals("elephant")) {
            animal = "elephant";
            animalChoice = myElephant;
        } else {
            animal = "tiger";
            animalChoice = myTiger;
        }
        animalChoice.setHeight();
        animalChoice.setWeight();
        animalChoice.getHeight(animal);
        animalChoice.getWeight(animal);
        System.out.println("请选择操作：\t1.oven\t2.refrigerator\t3.wardrobe\t4.washer");
        String box = sc.next();
        Box boxChoice;
        Oven myOven = new Oven();
        Refrigerator myRefrigerator = new Refrigerator();
        Wardrobe myWardrobe = new Wardrobe();
        Washer myWasher = new Washer();
        switch (box) {
            case ("1"):
            case ("oven"):
                boxChoice = myOven;
                myOven.setTemperature();
                break;
            case ("2"):
            case ("refrigerator"):
                boxChoice = myRefrigerator;
                myRefrigerator.setTemperature();
                break;
            case ("3"):
            case ("wardrobe"):
                boxChoice = myWardrobe;
                break;
            default:
                boxChoice = myWasher;
                break;
        }
        boxChoice.setHeight();
        boxChoice.setWide();
        boxChoice.open();
        boxChoice.in(animal);
        if(box.equals("1")||box.equals("oven")){
            myOven.start();
            myOven.roast(animal);
        }else if(box.equals("4")||box.equals("washer")){
            myWasher.wash(animal);
        }
        boxChoice.close();
    }
}
