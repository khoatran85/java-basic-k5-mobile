package Lesson7;

public class RobotAnimal {
    private static int id;
    private String name;

    public RobotAnimal() {
        increaseId();
    }

    public RobotAnimal(String name) {
        this.name = name;
    }

    //write only
    private void setName(String name) {
        this.name = name;
    }

    //Read only
    public String getName() {
        return name;
    }

    //service method => public
    public int getId() {
        return id;
    }

    //support method => private
    private void increaseId() {
        id++;
    }
}
