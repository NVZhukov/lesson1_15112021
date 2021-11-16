package lesson_1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(5,-6);
        printColor(100);
        compareNumbers(10,15);
    }

    public static void printThreeWords() {
        System.out.println("\nOrange\nBanana\nApple");
    }

    public static void checkSumSign(int a, int b) {
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (0 < value && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

            }
    public static void compareNumbers( int a, int b){
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}





