package lesson13.task2;

public class Cat {

    private int age;
    private String color;
    private double weight;

    public Cat(int age, String color, double weight) {
        this.age = age;
        this.color = color;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}