package lesson_6.animals;

public abstract class Animal {
    protected String name;
    protected double maxSwim = 0;
    protected double maxRun = 0;

    public abstract void run(double runLength);

    public abstract void swim(double swimLength);

}
