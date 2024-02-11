public class StudentManager {

    private Student[] students;
    private Grade[][] grades;
    private int size;

    public StudentManager(int capacity) {
        students = new Student[capacity];
        grades = new Grade[capacity][];
        size = 0;
    }

    public void addStudent(Student student) {
        if (size < students.length) {
            students[size] = student;
            grades[size] = new Grade[0];
            size++;
        } else {
            System.out.println("StudentManager is full.");
        }
    }

    public void addGrade(Student student, String subject, double grade) {
        int studentIndex = findStudentIndex(student);
        if (studentIndex != -1) {
            Grade newGrade = new Grade(student, subject, grade);
            Grade[] studentGrades = grades[studentIndex];
            Grade[] newStudentGrades = new Grade[studentGrades.length + 1];
            for (int i = 0; i < studentGrades.length; i++) {
                newStudentGrades[i] = studentGrades[i];
            }
            newStudentGrades[studentGrades.length] = newGrade;
            grades[studentIndex] = newStudentGrades;
            grades[studentIndex][studentGrades.length] = newGrade;
        } else {
            System.out.println("Student not found.");
        }
    }

    public double getAverageGrade(Student student) {
        int studentIndex = findStudentIndex(student);
        if (studentIndex != -1) {
            Grade[] studentGrades = grades[studentIndex];
            if (studentGrades.length > 0) {
                double sum = 0;
                for (Grade grade : studentGrades) {
                    sum += grade.getGrade();
                }
                return sum / studentGrades.length;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    private int findStudentIndex(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == student.getId()) {
                return i;
            }
        }
        return -1;
    }
}
