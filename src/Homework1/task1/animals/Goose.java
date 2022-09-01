package Homework1.task1.animals;

import Homework1.task1.interfaces.Flyable;

public class Goose implements Flyable {
    @Override
    public void fly() {
        System.out.println("Гусь летит");
    }
}
