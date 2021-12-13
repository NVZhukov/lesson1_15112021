package lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate){
        if(plate.decreaseFood(appetite)==true){
            satiety = true;
            System.out.println("Cat " + name + " eat...");
        }else{
        System.out.println("Cat " + name + " didn't eat...");
        }
    }

    public void fullCat(){
        if(satiety == true)  System.out.println("Cat " + name + " satiety is " + satiety);
    }

    public boolean isSatiety(){
        if(satiety == true){
            return true;
        }else {
            return false;
        }
    }

    public String getName() {
        return name;
    }
}
