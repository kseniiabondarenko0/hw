public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }


    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary + ", Position: " + position + ", Department: " + department;
    }
}