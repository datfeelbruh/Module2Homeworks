package Homework1.task2;

import java.util.Arrays;

public class MyList<T>  {
    T[] objects;
    int size;

    public MyList() {
        this.objects = (T[]) new Object[3];
        this.size = 0;
    }

    public boolean add(T elem) {
        if (size == objects.length) {
            Object[] newObjects;
            newObjects = Arrays.copyOf(this.objects, this.objects.length * 2, this.objects.getClass());
            this.objects = (T[]) newObjects;
        }
        this.objects[this.size] = elem;
        this.size++;
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(this.objects, 0, this.size));
    }

    public T get(int index) {
        return this.objects[index];
    }
}
