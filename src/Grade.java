public class Grade {
    Student student;
    String subject;
    double grade;

    public Grade(Student student, String subject, double grade) {
        this.student = student;
        this.subject = subject;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }
}

