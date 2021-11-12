package Lesson5_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {
    static CEO ceo = new CEO();
    static StandardEmployee employee = new StandardEmployee();
    static Manager manager = new Manager();

    public static void main(String[] args) {
        System.out.println(countTotalSalary(1,2,7));
    }



    public static int countTotalSalary(int totalCEO, int totalManager, int totalEmployee) {
//        int totalCEO = 1;
//        int totalManager = 2;
//        int totalEmployee = 7;

//        Manager manager1 = new Manager();
//        Manager manager2 = new Manager();


//        List<StandardEmployee> employeeList1 = new ArrayList<>();
//        StandardEmployee employee1 = new StandardEmployee();
//        StandardEmployee employee2 = new StandardEmployee();
//        StandardEmployee employee3 = new StandardEmployee();
//        StandardEmployee employee4 = new StandardEmployee();
//        StandardEmployee employee5 = new StandardEmployee();
//        StandardEmployee employee6 = new StandardEmployee();
//        StandardEmployee employee7 = new StandardEmployee();

//        List<StandardEmployee> employeeList = Arrays.asList(employee1,employee2,employee3,employee5,employee4,employee6,employee7);
//
//        int totalStandardEmpMonthlySalaries = 0;
//
//        for (StandardEmployee employee : employeeList) {
//            totalStandardEmpMonthlySalaries = totalStandardEmpMonthlySalaries + employee.salary() + employee.supportSalary();
//        }

        int totalCEOSalary = countTotalCEOSalary(totalCEO);
        int totalManagerSalary = countTotalManagerSalary(totalManager);
        int standardEmpSalary = countTotalEmpSalary(totalEmployee);
        return totalCEOSalary + totalManagerSalary + standardEmpSalary;
    }

    private static int countTotalCEOSalary(int totalCEO){
       return (ceo.salary() + ceo.supportSalary())*totalCEO;
    }
    private static int countTotalEmpSalary(int totalEmployee){
       return (employee.salary() + employee.supportSalary())*totalEmployee;
    }
    private static int countTotalManagerSalary(int totalManager){
       return (manager.salary() + manager.supportSalary())*totalManager;
    }

}
