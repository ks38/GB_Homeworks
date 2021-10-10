package lesson_6;

import lesson_6.animals.Animal;
import lesson_6.animals.Cat;
import lesson_6.animals.Dog;

public class Main {
    public static void main(String[] args) {
        int CountCats = 0;
        int CountDogs = 0;


        Cat cat = new Cat("Шурик");
        cat.run(50);
        cat.swim(1);
        System.out.println();
        Dog dog = new Dog("Паша");
        dog.run(77);
        dog.swim(7);
        System.out.println();

        Animal[] animals = {
                new Cat("Барсик"),
                new Cat("Мурзик"),
                new Cat("Васька"),
                new Cat("Нафаня"),
                new Dog("Барбос"),
                new Dog("Онотоле"),
                cat,
                dog
        };

        animals[0].run(10);
        animals[0].swim(50);
        System.out.println();
        animals[1].run(100);
        System.out.println();
        animals[2].run(150);
        System.out.println();
        animals[3].run(200);
        System.out.println();
        animals[4].swim(10);
        animals[4].run(40);
        System.out.println();
        animals[5].swim(15);
        animals[5].run(550);
        System.out.println();

        for (Animal animals3 : animals) {

            if (animals3 instanceof Cat) {
                CountCats++;
            } if ( animals3 instanceof Dog) {
                CountDogs++;
            }
        }

        System.out.println("Количество котов: " + CountCats);
        System.out.println("Количество собак: " + CountDogs);

    }
}

