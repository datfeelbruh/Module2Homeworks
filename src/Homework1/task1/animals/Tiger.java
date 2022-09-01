package Homework1.task1.animals;

import Homework1.task1.interfaces.Bitable;

public class Tiger implements Bitable {
    @Override
    public void bite() {
        System.out.println("Тигр кусает");
    }
}
