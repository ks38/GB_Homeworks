package lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {      // метод уменьшения еды в тарелке
        if (food < amount) {                    // если корма в тарелке меньше, чем аппетит кота
            increaseFood();                     // подсыпаем корм
        } else {
            this.food -= amount;                // кормим кота (количество еды в тарелке - аппетит кота)
        }
    }

    boolean checkFood(int amount) {             // проверяем количество корма в тарелке
        return (food - amount) >= 0;            // если (количество корма - аппетит кота) >= 0, то true
    }

    public void increaseFood() {                // метод добавления корма
        this.food += 20;
        System.out.println("Еды мало! В тарелку добавили 20 гр. корма");
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.printf("В тарелке находится [ %d ] гр. корма\n", food);
    }
}
