package entities;

public class CalculateSalary {

    public Double calculateSalary(EmployeeSalary employeeSalary, Salary salary) {
        return salary.calculateSalary(employeeSalary);
    }
}
