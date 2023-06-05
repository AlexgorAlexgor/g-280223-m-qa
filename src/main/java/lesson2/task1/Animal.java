package lesson2.task1;

public abstract class Animal {

    int weight;
    private String privateField;

    public Animal() {
        System.out.println("Вызван конструктор животного");
    }

    public abstract void feed();

    private void privateMethod() {
        System.out.println("Test");
    }

    public String getPrivateField() {
        return privateField;
    }
}
