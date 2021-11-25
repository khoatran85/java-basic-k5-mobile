package Lesson8;

import Lesson5_1.Manager;

import java.util.List;

public class SalaryCalculator {
    public static double getTotalSalary(List<Employee> employeeList) {
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary() + employee.getSupportSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee ceo, manager, standardEmployee;
        ceo = new CEO(100,0);
        manager = new ManagerEmployee(50,3);
        standardEmployee = new StandardEmployee(30,5);
    }
}
