package lesson12.task1;

public class SecondFilter implements Filter {
    @Override
    public boolean test(Student student) {
        return student.getAverageRate() > 4 && student.getDegree().equals(Degree.MASTER);
    }
}
