package entities;

public class Tester implements Salary {
    @Override
    public Double calculateSalary(EmployeeSalary employeePosition) {
        return employeePosition.getSalary() > 3000.0 ? employeePosition.getSalary() + (employeePosition.getSalary() * 0.015) : employeePosition.getSalary() + (employeePosition.getSalary() * 0.02);
    }
}
