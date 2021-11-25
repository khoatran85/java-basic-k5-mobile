package Lesson8;

public class StandardEmployee extends Employee {

    public StandardEmployee(double salary, double supportSalary) {
        super(salary, supportSalary);
    }


    @Override
    public void setSupportSalary(double supportSalary) {
        super.supportSalary = supportSalary;

    }
}