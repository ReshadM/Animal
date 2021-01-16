package Animal;

import java.util.Random;

public class TestMain {

    public static void main (String[] args) {

        Animal[] participants = prepareParticipants();
        playGame(participants);

        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private static Animal[] prepareParticipants() {
        return new Animal[]{
        new Cat(200, 3),
        new Dog(500, 3,10),
        new Cat( 200, 3),
        new Dog (500, 3,10)


        };
    }

    private static void playGame(Animal[] participants){
        Random random = new Random();

        for(Animal participant : participants) {

            participant.printInfo();
            System.out.println(participant.run(random.nextInt(500)));
            System.out.println(participant.jump(random.nextInt(5)));
            System.out.println(participant.swim(random.nextInt(10)));
            System.out.println();

        }


    }

}
