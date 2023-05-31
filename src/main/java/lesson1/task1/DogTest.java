package lesson1.task1;

public class DogTest {

    public static void main(String[] args) {

        // Объявление переменной
        int value;

        // Инициализация переменной
        value = 5;

        // Объявление переменной
        Dog smallDog;

        // Инициализация переменной (с созданием объекта)
        smallDog = new Dog();

        // Объявление и инициализация
        Dog bigDog = new Dog();

        smallDog.color = "Чёрный";
        bigDog.color = "Белый";

        System.out.println("Цвет маленькой собаки:");
        System.out.println(smallDog.color);
        System.out.println("Цвет большой собаки: " + bigDog.color);

        smallDog.sleep();
        bigDog.eat();

        Dog dog = new Dog(7);
//        System.out.println("Возраст: " + dog.age);

        Dog dog1 = new Dog("Овчарка", 3.54);

        Dog dog2 = new Dog();
        dog2.id = 5;

        System.out.println(dog1.breed + " " + dog1.weight);

        Dog dog3 = new Dog();
//        dog3.age = -3;

        dog3.setAge(-3);
        System.out.println(dog3.getAge());

        dog3.setAge(9);
        System.out.println(dog3.getAge());
        System.out.println(dog.getAge());
    }
}
