package lesson12.task1;

@FunctionalInterface
public interface Filter {

    /**
     * Метод, который фильтрует студентов
     *
     * @param student   студент, для которого мы должны определить,
     *                  подходит ли он по критериям
     * @return          true - если студент подходит,
     *                  false - если студент не подходит
     */
    boolean test(Student student);

    // Если мы в функциональный интерфейс добавим второй абстрактный метод,
    // то функциональный интерфейс перестанет быть функциональным,
    // и в нашем приложении сломается вся логика, основанная на этом интерфейсе
//    int printResult(int x, int y);
}