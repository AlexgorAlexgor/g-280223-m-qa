package lesson4.task6;

public class CopyTest {

    public static void main(String[] args) throws CloneNotSupportedException {

//        System.out.println("Создаём книгу");
//        Book book1 = new Book("Java. Полное руководство.",
//                "Герберт Шилдт");
//        Book book2 = book1;
//
//        // Меняем название второй книге.
//        book2.setName("Чистый код.");
//        // Выводим в консоль название первой книги.
//        System.out.println(book1.getName());
//
//        Book book3 = new Book("Книга джунглей",
//                "Редьярд Киплинг");
//        Book book4 = (Book) book3.clone();
//
//        book4.setName("Тестовое наименование");
//        System.out.println(book3.getName());

        Book book1 = new Book("Тестовое название", new Author("Автор"));
        // Поверхностное копирование объекта при помощи метода clone
        // Создаётся реальная копия объекта book, но не создаётся
        // реальная копия внутреннего объекта - author
        Book book2 = (Book) book1.clone();

        book2.getAuthor().setName("Другой автор");
        System.out.println(book1.getAuthor().getName());

        Book book3 = new Book("Тестовое название", new Author("Автор"));
        // Глубокое копирование объекта при помощи написанного конструктора
        // Создаётся и реальная копия объекта book, и реальная копия
        // внутреннего объекта author
        Book book4 = new Book(book3);

        book4.getAuthor().setName("Другой автор");
        System.out.println(book3.getAuthor().getName());
    }
}
