package Homework1.task1.animals;

import Homework1.task1.interfaces.Swimable;

public class Penguin implements Swimable {
    @Override
    public void swim() {
        System.out.println("Пингвин плывет");
    }
}
