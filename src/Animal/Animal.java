package Animal;

public abstract class Animal {

    protected int runDistance;
    protected int jumpHeight;
    protected int swimDistance;



    public Animal(int runDistance, int jumpHeight, int swimDistance) {


        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;

    }


    public abstract boolean run(int distance);
    public abstract boolean jump(int height);
    public abstract boolean swim(int distance);


    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{" +
                "runDistance=" + runDistance +
                ", jumpHeight=" + jumpHeight +
                ", swimDistance=" + swimDistance +
                '}';

    }


}




