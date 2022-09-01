package Homework1.task1.animals;

import Homework1.task1.interfaces.Flyable;

public class Duck implements Flyable {
    @Override
    public void fly() {
        System.out.println("Утка летит");
    }
}
