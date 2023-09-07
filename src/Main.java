import entities.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmployeeSalary employeeSalary = new EmployeeSalary(4000d);
        CalculateSalary calculate = new CalculateSalary();
        System.out.println(calculate.calculateSalary(employeeSalary, new Dev()));
        System.out.println(calculate.calculateSalary(employeeSalary, new Dba()));
        System.out.println(calculate.calculateSalary(employeeSalary, new Tester()));

        scanner.close();

    }


}
