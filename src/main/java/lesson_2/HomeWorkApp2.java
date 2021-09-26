package lesson_2;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println("++++++++++Homework 2++++++++++");
        System.out.println("Условие выполнения первого задания: " + within10and20(10, -100));
        isPositiveOrNegative(-15);
        System.out.println("Условие выполнения третьего задания: " + isNegative(-1));
        printWordNTimes("GeekBrains", 5);
        System.out.println("Условие выполнения пятого задания: " + leapYear(1900));
    }

    public static boolean within10and20(int a, int b) {
        System.out.println("----------Task one----------");
        return (a + b > 10) & (a + b <= 20);
    }

    private static void isPositiveOrNegative(int x1) {
        System.out.println("----------Task two----------");
        if (x1 >= 0) {
            System.out.println("Число: " + x1 + " положительное");
        } else System.out.println("Число: " + x1 + " отрицательное");
    }

    public static boolean isNegative(int x) {
        System.out.println("----------Task three----------");
        return x < 0;
    }

    public static void printWordNTimes(String word, int times) {
        System.out.println("----------Task four----------");
        System.out.println("Слово " + word + " будет повторяться " + times + " раз.");
        for (int i = 0; i < times; i++) {
            System.out.println(" Слово: " + word);
        }
    }

    public static boolean leapYear(int birthday) {
        System.out.println("----------Task five*----------");
        return ((birthday % 4 == 0) || (birthday % 400 == 0)) && (birthday % 100 != 0);
    }
}
