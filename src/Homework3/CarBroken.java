package Homework3;

import java.util.Objects;

public class CarBroken {
    public String carName;

    public CarBroken(String carName) {
        this.carName = carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarBroken carBroken = (CarBroken) o;
        return Objects.equals(carName, carBroken.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(1);
    }
}
