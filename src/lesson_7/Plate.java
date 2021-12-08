package lesson_7;

import java.util.Scanner;

public class Plate {
    private int food;
    Scanner scanner = new Scanner(System.in);

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int amount) {
        if (food < amount || amount < 0) {
            return false;
        } else {
            food -= amount;
        }
        return true;
    }

    public void addFood(Cat cat){
        if(cat.isSatiety()){
            System.out.println("Не требуется добавлять еду");
        }else {
            System.out.println("Недостаточно еды. Добавьте!");
            food = scanner.nextInt();
        }
    }
}
