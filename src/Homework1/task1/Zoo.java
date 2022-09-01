package Homework1.task1;

import Homework1.task1.interfaces.Bitable;
import Homework1.task1.interfaces.Flyable;
import Homework1.task1.interfaces.Swimable;


public class Zoo <T extends Flyable, E extends Swimable, K extends Bitable> {
    T flyingAnimal;
    E swimmingAnimal;
    K bitingAnimal;


    public void feedFlyable() {
        System.out.println("Летающее животное ест");
        flyingAnimal.fly();
    }
    public void feedSwimable() {
        System.out.println("Плавающее животное ест");
        swimmingAnimal.swim();
    }
    public void feedBitable() {
        System.out.println("Кусающее животное ест");
        bitingAnimal.bite();
    }

    public void setFlyingAnimal(T flyingAnimal) {
        this.flyingAnimal = flyingAnimal;
    }

    public void setSwimmingAnimal(E swimmingAnimal) {
        this.swimmingAnimal = swimmingAnimal;
    }

    public void setBitingAnimal(K bitingAnimal) {
        this.bitingAnimal = bitingAnimal;
    }

    public T getFlyingAnimal() {
        return flyingAnimal;
    }

    public E getSwimmingAnimal() {
        return swimmingAnimal;
    }

    public K getBitingAnimal() {
        return bitingAnimal;
    }
}
