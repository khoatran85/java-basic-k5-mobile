package Lesson5_1;

public class totalSalary {

    public static void main(String[] args) {
        int totalManager = 10;
        int totalEmployee = 100;
        int totalCEO = 2;
        int totalSalary = SalaryCalculator.countTotalSalary(totalCEO,totalManager,totalEmployee);
        System.out.println(totalSalary);
    }
}
