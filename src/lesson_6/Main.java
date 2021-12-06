package lesson_6;

import lesson_6.animals.Cat;
import lesson_6.animals.Dog;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Tom", 100, 0, 200,0);
        Dog dog = new Dog("Spike", 300, 5, 500, 10);

        cat.swim(10);
        cat.run(150);

        dog.run(300);
        dog.swim(5);
    }
}
