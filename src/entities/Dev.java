package entities;

public class Dev implements Salary {
    @Override
    public Double calculateSalary(EmployeeSalary employeePosition) {
        return employeePosition.getSalary() > 3000.0 ? employeePosition.getSalary()
                + (employeePosition.getSalary() * 0.01) : employeePosition.getSalary()
                + (employeePosition.getSalary() * 0.02);

    }
}
