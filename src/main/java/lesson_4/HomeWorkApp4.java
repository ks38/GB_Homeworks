package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    private static Random random;
    private static Scanner scanner;
    private static char[][] map;

    private static final byte SIZE = 5;
    private static final byte DOTS_TO_WIN = 4;

    private static final char MAP_ELEMENT_EMPTY = '.'; // свободное поле
    private static final char MAP_ELEMENT_X = 'X'; // крестик - человек
    private static final char MAP_ELEMENT_O = 'O'; // нолик - компьютер

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        random = new Random();

        initMAP();
        printMap();

        while (true) {
            playerTurn();
            printMap();
            if (checkWin(MAP_ELEMENT_X)) {
                System.out.println("Player win");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(MAP_ELEMENT_O)) {
                System.out.println("AI win");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw");
                break;
            }
        }
        System.out.println("Game Over!");
    }

    public static void initMAP() { // метод инициализации игрового поля
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = MAP_ELEMENT_EMPTY;
            }
        }
    }

    public static void printMap() { // метод вывода игрового поля в консоль
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void playerTurn() { // ход человека
        int x, y;
        do {
            System.out.println("Enter your turn coordinates: X , Y");

            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[x][y] = MAP_ELEMENT_X;
    }

    public static void aiTurn() { // ход компьютера

        int x, y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        } while (!isCellValid(x, y));
        map[x][y] = MAP_ELEMENT_O;
        System.out.println("AI turn was in [" + (x + 1) + ", " + (y + 1) + "]");
    }

    public static boolean isCellValid(int x, int y) { // проверка пустых клеток
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        if (map[x][y] != MAP_ELEMENT_EMPTY) {
            return false;
        }
        return true;
    }

    public static boolean isMapFull() { // проверка
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == MAP_ELEMENT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char element) {
        int vertical, horizontal;
        int diagMain, diagReverse;

        for (int i = 0; i <= SIZE - 1; i++) {
            horizontal = 0;
            vertical = 0;
            for (int j = 0; j <= SIZE - 1; j++) {
                if (map[i][j] == element) {
                    horizontal++;
                } else if (map[i][j] != element && horizontal < DOTS_TO_WIN) {
                    horizontal = 0;
                }

                if (map[j][i] == element) {
                    vertical++;
                } else if (map[j][i] != element && vertical < DOTS_TO_WIN) {
                    vertical = 0;
                }
                if (horizontal >= DOTS_TO_WIN || vertical >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        for (int j = 0; j < SIZE; j++) {
            diagMain = 0;
            for (int i = 0; i < SIZE; i++) {
                int k = j + i;
                if (k < SIZE) {
                    if (map[i][k] == element) {
                        diagMain++;
                    } else if (map[i][k] != element && diagMain < DOTS_TO_WIN) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        for (int j = 1; j < SIZE; j++) {
            diagMain = 0;
            for (int i = 0; i < SIZE; i++) {
                int k = j + i;
                if (k < SIZE) {
                    if (map[k][i] == element) {
                        diagMain++;
                    } else if (map[k][i] != element && diagMain < DOTS_TO_WIN) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        for (int j = 0; j < SIZE; j++) {
            diagReverse = 0;
            for (int i = 0; i < SIZE; i++) {
                int k = (SIZE - 1) - i;
                int l = j + i;
                if (k >= 0 && l < SIZE) {
                    if (map[l][k] == element) {
                        diagReverse++;
                    } else if (map[l][k] != element && diagReverse < DOTS_TO_WIN) {
                        diagReverse = 0;
                    }
                }
                if (diagReverse >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        for (int j = 1; j < SIZE; j++) {
            diagReverse = 0;
            for (int i = 0; i < SIZE; i++) {
                int k = (SIZE - 1) - j - i;
                if (k >= 0) {
                    if (map[i][k] == element) {
                        diagReverse++;
                    } else if (map[i][k] != element && diagReverse < DOTS_TO_WIN) {
                        diagReverse = 0;
                    }
                }
                if (diagReverse >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }
}
