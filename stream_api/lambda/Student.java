package stream_api.lambda;

public class Student {
    private final String surname;
    private final double averageScore;

    public Student(String surname, double averageScore) {
        this.surname = surname;
        this.averageScore = averageScore;
    }

    public String getSurname() {
        return surname;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}


