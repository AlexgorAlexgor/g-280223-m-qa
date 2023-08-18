package lesson9.task1;

import java.util.Objects;

public class Cat implements Comparable<Cat> {

    private int age; // anotherCat.age = 3;
    private String color;
    private double weight;

    public Cat(int age, String color, double weight) {
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    @Override
//    public boolean equals(Object obj) {
//
//        // Сравнивается ли объект сам с собой
//        if (this == obj) {
//            return true;
//        }
//
//        // Сравнивается ли объект с null
//        if (obj == null) {
//            return false;
//        }
//
//        // Сравнивается ли объект с объектом другого класса
//        if (!this.getClass().equals(obj.getClass())) {
//            return false;
//        }
//
//        Cat anotherCat = (Cat) obj;
//
//        // this - это кот, у которого вызван метод equals
//        // anotherCat - другой кот, с которым мы сравниваем текущего кота this
//        // 6.0 -> 5.99999999999999999999999999999999 - погрешность, которая может присутствовать у типа double
//        return this.age == anotherCat.age && Objects.equals(this.color, anotherCat.color) && Double.compare(this.weight, anotherCat.weight) == 0;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, weight);
    }

    @Override
    public String toString() {
        return String.format("Кот: возраст - %d, цвет - %s, вес - %.2f.", age, color, weight);
    }

    @Override
    public int compareTo(Cat anotherCat) {
        // this - кот, у которого был вызван метод compareTo
        // anotherCat - другой кот, которого мы сравниваем с котом this

        // 1. Если возраст разный, возвращаем разницу в возрасте.
        // 2. Если возраст одинаковый, переходим к сравнению цветов.
        // 3. Если цвета разные, возвращаем разницу в цвете.
        // 4. Если цвета одинаковые, переходим к сравнению веса.
        // 5. Возвращаем разницу в весе.

        int ageDifference = this.age - anotherCat.age;
        if (ageDifference != 0) {
            return ageDifference;
        }

        int colorDifference = this.color.compareTo(anotherCat.color);
        if (colorDifference != 0) {
            return colorDifference;
        }

        return Double.compare(this.weight, anotherCat.weight);
    }
}