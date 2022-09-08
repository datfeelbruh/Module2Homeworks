package Homework3;

import java.util.Objects;

public class UserBroken {
    public int age;
    public String name;

    public UserBroken(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return o != null && getClass() == o.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(1);
    }
}
