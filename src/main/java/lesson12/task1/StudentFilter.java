package lesson12.task1;

public class StudentFilter implements Filter {

    @Override
    public boolean test(Student student) {
        return student.getCourse() >= 2 && student.getName().toLowerCase().contains("о");
    }
}