package lesson_2;

public class MySecondHomeWork {
    public static void main(String[] args) {
        cheсkSum();
        cheсkPositiveOrNegative();
        isPositiveOrNegative();
        printText();


    }

    public static boolean cheсkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void cheсkPositiveOrNegative(int a) {
        if (a < 0) {
            System.out.println(a + " - отрицательное число");
        } else {
            System.out.println(a + " - положительное число");
        }
    }

    public static boolean isPositiveOrNegative(int a) {
        return a < 0;
    }

    public static void printText(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }
}



