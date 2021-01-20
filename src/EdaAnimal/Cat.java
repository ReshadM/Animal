package EdaAnimal;

public class Cat {

    private final String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite){

        this.name = name;
        this.appetite = appetite;


    }

    public boolean eat(Plate plate){

       String validateMessage = checkEat(plate);
       if(validateMessage != null){
           System.out.println(validateMessage);
           return false;

       }
        doEat(plate);
        satiety = true;
        return true;
    }


    public int getAppetite(){
        return appetite;
    }

    public void setAppetite(int appetite){
        this.appetite = appetite;
    }


    public boolean getSatiety(){
        return satiety;
    }

    public void setSatiety(boolean satiety){
        this.satiety = satiety;
    }

    private String checkEat(Plate plate) {
        if( !plate.isFoodEnough(appetite) ){
            return "Food is not enough in the palte!";
        }
        if(satiety){
            return "Cat is finally satiety";
        }

        return null;
    }

    private void doEat(Plate plate){
        plate.decreaseFood(appetite);

    }

    public String getName() {
        return name;
    }

}
