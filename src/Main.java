public class Main {

    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager(5);

        // Додавання студентів
        Student student1 = new Student("John", 1, 20);
        Student student2 = new Student("Alice", 2, 21);
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);

        // Додавання оцінок студентам
        studentManager.addGrade(student1, "Math", 90);
        studentManager.addGrade(student1, "History", 85);
        studentManager.addGrade(student2, "Math", 75);
        studentManager.addGrade(student2, "History", 80);

        // Виведення середнього балу студентів
        System.out.println("Average grade for " + student1.getName() + ": " + studentManager.getAverageGrade(student1));
        System.out.println("Average grade for " + student2.getName() + ": " + studentManager.getAverageGrade(student2));


    }
}
