package Lesson9;


//interface
public class StandardEmployee implements IEmployee{

    @Override
    public double salary() {
        return 30;
    }

    @Override
    public double supportSalary() {
        return 5;
    }

    @Override
    public int compareTo(IEmployee o) {
        return 0;
    }

    @Override
    public void printInfo() {

    }
}
