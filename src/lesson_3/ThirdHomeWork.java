package lesson_3;

import java.util.Arrays;
import java.util.Random;

public class ThirdHomeWork {
    static Random rand = new Random();
    int x = rand.nextInt();

    public static void main(String[] args) {

        System.out.println(getMinimalValue(getRandomArr(10)));
        System.out.println(getMaximalValue(getRandomArr(10)));

        System.out.println(Arrays.toString(getInitialArr(6, 5)));

        int[] arrContrary = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1};
        for (int i = 0; i < arrContrary.length; i++) {
            if (arrContrary[i] == 1) {
                arrContrary[i] = 0;
            } else {
                arrContrary[i] = 1;
            }
        }

        int[] arrayOrder = new int[101];
        for (int i = 1; i < arrayOrder.length; i++) {
            arrayOrder[i] = i;
            System.out.print(arrayOrder[i] + " ");
        }
        System.out.println();

        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < 6) {
                array2[i] *= 2;
            }
        }

        int[][] square = new int[5][5];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else if (i == square.length - 1 - j) {
                    System.out.print("1 ");
                } else {
                    System.out.print(square[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static int[] getInitialArr(int initialValue, int len) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    /*для решения шестой задачи создал метод для генерации случайного массива с указанным
     * количеством элементов
     * и в разных методах находил минимальное и максимальное значение
     */

    public static int[] getRandomArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 10;
        }
        return arr;
    }

    public static int getMinimalValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getMaximalValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

