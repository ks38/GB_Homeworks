package lesson_2;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println("++++++++++Homework 2++++++++++");
        System.out.println("Условие выполнения первого задания: " + within10and20());
        isPositiveOrNegative();
        System.out.println("Условие выполнения третьего задания: " + isNegative());
        printWordNTimes();
        System.out.println("Условие выполнения пятого задания: " + leapYear());
    }

    public static boolean within10and20() {
        System.out.println("----------Task one----------");
        int a = 10;
        int b = -100;
        return (a + b > 10) & (a + b <= 20);
    }

    private static void isPositiveOrNegative() {
        System.out.println("----------Task two----------");
        int x = -15;
        if (x >= 0) {
            System.out.println("Число: " + x + " положительное");
        } else System.out.println("Число: " + x + " отрицательное");
    }

    public static boolean isNegative() {
        System.out.println("----------Task three----------");
        int x = -1;
        return x < 0;
    }

    public static void printWordNTimes() {
        System.out.println("----------Task four----------");
        String word = "Geek Brains";
        int times = 5;
        System.out.println("Слово " + word + " будет повторяться " + times + " раз.");
        for (int i = 0; i < times; i++) {
            System.out.println(" Слово: " + word);
        }
    }

    public static boolean leapYear() {
        System.out.println("----------Task five*----------");
        int birthday = 1900;
        return ((birthday % 4 == 0) || (birthday % 400 == 0)) && (birthday % 100 != 0);
    }
}
