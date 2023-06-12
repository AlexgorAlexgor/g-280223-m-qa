package lesson4.task5;

import java.util.Objects;

public class Dog {

    private int age;
    private String color;

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color);
    }
}
