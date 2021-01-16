package Animal;

public class Dog extends Animal {

    public static final int DEFAULT_RUN_DISTANCE = 500;
    public static final int DEFAULT_JUMP_HEIGHT = 2;
    public static final int DEFAULT_SWIM_DISTANCE = 10;

    public Dog(int runDistance, int jumpHeight, int swimDistance) {
        super(runDistance, jumpHeight, swimDistance);

    }

    public Dog(){
        this(DEFAULT_RUN_DISTANCE,DEFAULT_JUMP_HEIGHT,DEFAULT_SWIM_DISTANCE);
    }

    @Override
    public boolean run(int distance) {
        if (this.runDistance >= distance) {
            System.out.printf("Собака пробежала дистанцию %d. Max = %d%n", distance, runDistance);
            return true;
        }

        System.out.printf("Собака не смогла пробежать дистанцию %d. Max = %d%n", distance, runDistance);
        return false;
    }


    @Override
    public boolean swim(int distance) {
        if (this.swimDistance >= distance) {
            System.out.printf("Собака переплыла дистанцию %d. Max = %d%n", distance, swimDistance);
            return true;
        }

        System.out.printf("Собака не смогла переплыть дистанцию %d. Max = %d%n", distance, swimDistance);
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (this.jumpHeight >= height) {
            System.out.printf("Собака перепрыгнула лежачего полицейского %d. Max = %d%n", height, jumpHeight);
            return true;
        }

        System.out.printf("Собака не смогла перепрыгнуть лежачего полицейского%d. Max = %d%n", height, jumpHeight);
        return false;
    }
}
