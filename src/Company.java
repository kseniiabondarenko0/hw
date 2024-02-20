public class Company {
    private Employee[] employees;
    private int numEmployees;

    public Company() {
        this.employees = new Employee[10];
        this.numEmployees = 0;
    }

    public void addEmployee(Employee employee) {
        if (numEmployees < employees.length) {
            employees[numEmployees] = employee;
            numEmployees++;
        } else {
            System.out.println("Unable to add employee. Company is full.");
        }
    }

    public void printAllEmployees() {
        System.out.println("Employees:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println(employees[i]);
        }
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < numEmployees; i++) {
            totalSalary += employees[i].getSalary();
        }
        //totalSalary = Math.floor(totalSalary);
        return totalSalary;
    }

    public double calculateAverageSalary() {
        double count = 0;
        if (numEmployees == 0) {
            return 0;
        }
        count = calculateTotalSalary() / numEmployees;
        return Math.floor(count);
    }
}
