package lesson_7;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = {

                new Cat("Барсик", 1),
                new Cat("Голодный кот", 5),
                new Cat("Василий", 20),
                new Cat("Тимоша", 14),
                new Cat("Яша", 3),
                new Cat("Онотоле", 7),
                new Cat("Яшка", 8)
        };

        Plate plate = new Plate(10);
        plate.info();

        for (Cat cat : cats) {
            if (cat.isHungry() && cat.getAppetite() <= plate.getFood()) {                      // если[i] кот голоден и аппетит кота меньше количества корма в тарелке
                cat.eat(plate);                                                                // кот ест
            }
            if (!plate.checkFood(cat.getAppetite()) && cat.getAppetite() > plate.getFood()) {  //
                plate.increaseFood();
            }
        }

        for (Cat cat2 : cats) {
            if (cat2.getSatiety() == 0) {                                                      // дополнительная проверка сытости котов если кот голоден, то
                plate.increaseFood();                                                          // добавляем корм
                cat2.eat(plate);                                                               // кот ест
            }
        }

        for (Cat cat3 : cats) {                                                                 // пытаемся докормить котов
            cat3.eat(plate);
        }

        for (Cat cat1 : cats) {                                                                 // проверяем наличие голодных и сытых котов
            if (!cat1.isHungry()) {
                System.out.printf("%s наелся\n", cat1.getName());
            } else {
                System.out.printf("%s остался голодным, ему не хватило %d единиц еды\n", cat1.getName(), cat1.getAppetite() - plate.getFood());
            }
        }
    }
}


