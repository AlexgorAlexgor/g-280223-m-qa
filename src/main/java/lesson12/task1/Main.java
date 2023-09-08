package lesson12.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Иван", 21, 3, 4.65, Degree.MASTER));
        students.add(new Student("Александра", 18, 1, 4.34, Degree.MASTER));
        students.add(new Student("Пётр", 29, 4, 3.98, Degree.BACHELOR));
        students.add(new Student("Оксана", 27, 2, 4.12, Degree.MASTER));
        students.add(new Student("Сидор", 32, 5, 4.87, Degree.BACHELOR));
        students.add(new Student("Ольга", 25, 2, 3.85, Degree.BACHELOR));
        students.add(new Student("Макар", 23, 3, 4.71, Degree.MASTER));
        students.add(new Student("Елена", 33, 4, 3.82, Degree.MASTER));

        // Фильтры:
        // имя и курс
        // балл и степень
        // возраст и степень
        // имя и балл
        // курс и возраст
        // имя и степень

        System.out.println("Список всех студентов:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        // Фильтруем студентов - имя и курс. Курс >= 2. Имя должно содержать "О" без учёта регистра.
        // Сидор, Оксана, Ольга
        System.out.println("Фильтруем студентов по курсу и имени.");
        StudentUtils.printStudents(students, new StudentFilter());
        System.out.println();

        // Фильтруем студентов - средний балл и степень. Балл выше 4, степень - магистр.
        // Иван, Александра, Оксана, Макар
        System.out.println("Фильтруем студентов по баллу и степени.");
        StudentUtils.printStudents(students, new SecondFilter());
        System.out.println();

        // Фильтруем студентов - возраст и степень. Возраст > 25, степень - бакалавр.
        // Пётр, Сидор
        System.out.println("Фильтруем студентов по возрасту и степени (анонимный класс).");
        StudentUtils.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getAge() > 25 && student.getDegree().equals(Degree.BACHELOR);
            }
        });
        System.out.println();

        // Обычный класс мы можем применить столько раз, сколько нам требуется
        // Чтобы применить анонимный класс два раза, мы будем вынуждены его и написать два раза
        System.out.println("Фильтруем студентов по курсу и имени.");
        StudentUtils.printStudents(students, new StudentFilter());
        System.out.println();

        // Фильтруем студентов - имя и балл. Имя должно заканчиваться на а. Балл > 4.
        // Оксана, Александра
        System.out.println("Фильтруем студентов по имени и баллу (анонимный класс).");
        StudentUtils.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getName().endsWith("а") && student.getAverageRate() > 4;
            }
        });
        System.out.println();

        // Фильтруем студентов - курс и возраст. Возраст больше 30, старше 4 курса.
        // Сидор
        System.out.println("Фильтруем студентов по курсу и возрасту (лямбда-выражение).");
        StudentUtils.printStudents(students, x -> x.getAge() > 30 && x.getCourse() > 4);
        System.out.println();

        // Фильтруем студентов - имя и степень. Длина имени > 4. Степень - магистр.
        // Александра, Оксана, Макар, Елена
        System.out.println("Фильтруем студентов по имени и степени (лямбда-выражение)");
        StudentUtils.printStudents(students, x -> x.getName().length() > 4 && x.getDegree().equals(Degree.MASTER));
        System.out.println();

        Filter filter = x -> x.getCourse() == 3;

        Student student1 = new Student("Иван", 23, 2, 4.76, Degree.MASTER);
        Student student2 = new Student("Пётр", 25, 3, 3.94, Degree.BACHELOR);

        System.out.println(filter.test(student1));
        System.out.println(filter.test(student2));

        StudentUtils.printStudents(students, filter);
        StudentUtils.printStudents(students, filter);
        StudentUtils.printStudents(students, filter);
        StudentUtils.printStudents(students, filter);
        StudentUtils.printStudents(students, filter);
    }
}
