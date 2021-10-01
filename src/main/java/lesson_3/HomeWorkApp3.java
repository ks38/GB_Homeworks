package lesson_3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp3 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----------First Task----------");
        firstTask();
        System.out.println("----------Second Task----------");
        secondTask();
        System.out.println("----------Third Task----------");
        thirdTask();
        System.out.println("----------Fourth Task----------");
        fourthTask();
        System.out.println("----------Fifth Task----------");
        fifthTask();
        System.out.println("----------Sixth Task----------");
        sixthTask();
        System.out.println("----------Seventh Task----------");
        System.out.println(seventhTask(new int[]{2, 1, 1, 3, 1}));
    }

    public static void firstTask() {
        int[] array = {1, 0, 1, 0, 1, 1, 0, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = 0;
            } else array[i] = 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void secondTask() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void thirdTask() {
        int[] ara = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < ara.length; i++) {
            if (ara[i] < 6) {
                ara[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(ara));
    }

    public static void fourthTask() {
        int cols = 5;
        int rows = 5;
        int[][] ararat = new int[rows][cols];
        for (int i = 0; i < ararat.length; i++) {
            for (int j = 0; j < ararat.length; j++) {
                if (i == j || i == ararat.length - 1 - j) {
                    ararat[i][j] = 1;
                }
                System.out.print(ararat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fifthTask() {
        System.out.print("Введите размер массива: ");
        int len = scan.nextInt();
        System.out.print("Введите индекс ячеек массива: ");
        int initialValue = scan.nextInt();

        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array) + " ");
        System.out.println("Размер массива: " + len);
        System.out.println("Индекс массива: " + initialValue);
    }

    public static void sixthTask() {
        int[] arraySix = {100, 155, 1, 5, 900, 50, 35, 5, 56, -1};
        int min = arraySix[0];
        int max = arraySix[0];
        for (int i = 0; i < arraySix.length; i++) {
            min = (min < arraySix[i] ? min : arraySix[i]);
            max = (max > arraySix[i] ? max : arraySix[i]);
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    public static boolean seventhTask(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (rightSum == leftSum) return true;
        }
        return false;
    }

    public static void eighthTask() {

    }
}






