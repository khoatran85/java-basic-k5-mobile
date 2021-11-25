package Lesson8;

//Abstract class co hoac ko cos abstract method, neu co abstract method thi phai co abstract class
//abstract class dung cho tap hop cua doi tuong mat thiet voi nhau
public abstract class Employee {

    protected double salary;
    protected double supportSalary;

    public Employee(double salary, double supportSalary) {
        this.salary = salary;
        this.supportSalary = supportSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSupportSalary() {
        return supportSalary;
    }

    public void setSupportSalary(double supportSalary) {
        this.supportSalary = supportSalary;
    }


}
