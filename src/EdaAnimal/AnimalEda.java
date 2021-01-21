package EdaAnimal;

import java.util.Scanner;

public class AnimalEda {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Bastian", 6),
                new Cat("Garfield", 8),
        };

        Plate plate = new Plate(17);

        printInfo(cats, plate);
        haveLunch(cats, plate);

        printInfo(cats, plate);

        addFood(plate);

        System.out.println("Added food: ");
        plate.info();
        System.out.println();

        haveLunch(cats, plate);
        printInfo(cats, plate);

    }

    private static void haveLunch(Cat[] cats, Plate plate) {

        for (Cat cat : cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Has Cat '%s' eaten? Answer: %s%n", cat.getName(), result);
        }
        System.out.println();
    }


    private static void printInfo(Cat[] cats, Plate plate) {
        System.out.println("--- Info ---");
        plate.info();
        printInfo(cats);
        System.out.println("------");
        System.out.println();
    }

    private static void addFood(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give some food: ");
        int foodCount = scanner.nextInt();
        plate.addFood(foodCount);

    }

    private static void printInfo (Cat...cats){
        for (Cat cat : cats) {
            System.out.printf("Is cat '%s(appetite: %d)' hungry? Answer: %s%n",
                    cat.getName(),
                    cat.getAppetite(),
                    !cat.getSatiety());

        }
    }



    ///Dog dog = new Dog("Krepish", 20);
    ///
    ///plate.info();
///
    ///dog.eat(plate);
    ///plate.info();

}


