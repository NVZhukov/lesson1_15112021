package lesson_7;

public class Main {
    public static void main(String[] args) {

        Cat [] cats = {
                new Cat("Barsik",10,false),
                new Cat("Murzik",30,false),
                new Cat("Motya",15,false),
                new Cat("Pushistik",10,false)
        };

        Plate plate = new Plate(50);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].fullCat();
            plate.addFood(cats[i]);
        }
    }
}
