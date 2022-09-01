package Homework1.task1.animals;

import Homework1.task1.interfaces.Bitable;

public class Lion implements Bitable {
    @Override
    public void bite() {
        System.out.println("Лев кусает");
    }
}
