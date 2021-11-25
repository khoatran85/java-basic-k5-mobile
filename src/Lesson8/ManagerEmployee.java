package Lesson8;

public class ManagerEmployee extends Employee{

    public ManagerEmployee(double salary, double supportSalary) {
        super(salary, supportSalary);
    }

    @Override
    public void setSupportSalary(double supportSalary) {
        super.supportSalary = supportSalary;
    }

}
