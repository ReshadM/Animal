package Animal;

public class Cat extends Animal {

    public static final int DEFAULT_RUN_DISTANCE = 200;
    public static final int DEFAULT_JUMP_HEIGHT = 3;
    public static final int DEFAULT_SWIM_DISTANCE = 0;

    public Cat(int runDistance, int jumpHeight){
        super(runDistance, jumpHeight, DEFAULT_SWIM_DISTANCE);

    }

    public Cat(){
        super(DEFAULT_RUN_DISTANCE, DEFAULT_JUMP_HEIGHT, DEFAULT_SWIM_DISTANCE);
    }


    @Override
    public boolean run(int distance) {
        if (this.runDistance >= distance) {
            System.out.printf("Кот пробежал дистанцию %d. Max = %d%n", distance, runDistance);
            return true;
        }

        System.out.printf("Кот не смог пробежать дистанцию %d. Max = %d%n", distance, runDistance);
        return false;
    }


    @Override
    public boolean swim(int distance){
        System.out.println("Коты не умеют плавать!");
        return false;
    }

    @Override
    public boolean jump(int height){
        if (this.jumpHeight >= height) {
            System.out.printf("Кот перепрыгнул собаку %d. Max = %d%n", height, jumpHeight);
            return true;
        }

        System.out.printf("Кот не смог перепрыгнуть собаку. Max = %d%n", height, jumpHeight);
        return false;
    }


}
